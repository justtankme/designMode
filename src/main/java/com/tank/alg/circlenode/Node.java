package com.tank.alg.circlenode;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author duanzhiwei
 * 源自一个面试题：
 * 一组节点，可能有环或无环。
 * 有环：node0>node1>node2>...>nodeN>nodeRandom(0,N-1)
 * 无环：node0>node1>node2>...>nodeN>null
 * 编码根据传入的第一个节点判断是否有环。
 */
public class Node {
	private Node next;

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "Node [next=" + next + "]";
	}
	
	/**
	 * 创建一组节点，可以选择有环或无环，最后一个节点指向一个随机位置的上级节点形成回环。
	 * @param num 创建多少个节点
	 * @param circle 是否产生回环
	 * @return
	 */
	public static List<Node> createNodes(int num, boolean circle){
		List<Node> nodes = new ArrayList<>();
		//先创建出所需个数的节点
		for(int i = 0; i < num; i ++){
			Node thisNode = new Node();
			nodes.add(thisNode);
		}
		//最后一个节点之前的节点，依次设定为指向下一个节点。node0>node1>node2>...>nodeN
		for(int i = 0; i < nodes.size() - 1; i ++){
			nodes.get(i).setNext(nodes.get(i + 1));
		}
		if(circle){
			//最后一个节点指向一个随机位置的上级节点.node0>node1>node2>...>nodeN>nodeRandom
			nodes.get(num - 1).setNext(nodes.get(new Random().nextInt(num -1) - 1));
		}
		return nodes;
	}
	
	/**
	 * 根据传入的第一个节点，判断节点组是否存在回环。
	 * @param first 节点组的第一个节点
	 * @return
	 */
	public static boolean hasCircle(Node first){
		final int maxCircle = 5000;//如果节点太多就不处理，认为是无环
		int maxCircleInt = maxCircle;
		List<Node> nodes = new ArrayList<>();
		Node next = first;//下一个节点，初始化为第一个节点
		System.out.println(next.hashCode());
		while(maxCircleInt-- > 0) {
			nodes.add(next);//加入到已经遍历出来的节点列表
			next = next.getNext();//获取当前节点的下一个节点
			//如果下一个节点是null，则表示节点组结束并且不存在回环
			if (next == null) {
				System.out.println("circle not found");
				return false;
			}
			System.out.println(next.hashCode());
			//如果下一个节点在已经遍历出来的节点列表中，则表示存在回环
			if(nodes.contains(next)){
				System.out.println("circle point to " + nodes.indexOf(next));
				return true;
			}
		}
		System.out.println("max circle arrived " + maxCircle);
		return false;
	}
}
