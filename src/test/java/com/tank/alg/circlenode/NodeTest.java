package com.tank.alg.circlenode;

import org.junit.Test;

public class NodeTest {
	@Test
	public void circleTest(){
		System.out.println(Node.hasCircle(Node.createNodes(10, true).get(0)));
		System.out.println(Node.hasCircle(Node.createNodes(10, false).get(0)));
//		System.out.println(Node.hasCircle(Node.createNodes(10000, true).get(0)));
	}
}
