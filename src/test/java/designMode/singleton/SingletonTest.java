package designMode.singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

import org.junit.Test;

import com.tank.designMode.singleton.ResourcePool;
import com.tank.designMode.singleton.ResourcePoolLazy;

public class SingletonTest {
	@Test
	public void ResourcePoolTest(){
		ForkJoinPool forkJoinPool = new ForkJoinPool();
		GetResourcePoolTask resourcePoolTask = new GetResourcePoolTask(0,100);
		try {
			List<String> res = forkJoinPool.submit(resourcePoolTask).get();
			for (String string : res) {
				System.out.println(string);
			}
			
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		forkJoinPool.shutdown();
		System.out.println(resourcePoolTask.isCompletedAbnormally());
	}
	
	public ResourcePool getResourcePool(){
//		return ResourceEnum.INSTANCE.getInstance();
		return ResourcePoolLazy.getInstance();
//		return ResourcePoolEdge.getInstance();
//		return ResourcePoolLazy2.getInstance();
//		return ResourcePoolLazy3.getInstance();
//		return ResourcePoolLazy4.getInstance();
	}
	
	/**
	 * @author duanzhiwei
	 * 静态内部类，用于fork/join获取一定数量的单例对象
	 */
	private class GetResourcePoolTask extends RecursiveTask<List<String>>{
		private static final long serialVersionUID = 1L;
		
		public int first;
		public int last;
		public static final int THRESHOULD = 2;
		
		public GetResourcePoolTask(int first, int last) {
			super();
			this.first = first;
			this.last = last;
		}
		
		@Override
		protected List<String> compute() {
			List<String> res = new ArrayList<>();
			if (last - first <= THRESHOULD) {
				res.add(getResourcePool().id);
			}
			else{
				int mid = (last + first)/2;
				GetResourcePoolTask t1 = new GetResourcePoolTask(first, mid);
				GetResourcePoolTask t2 = new GetResourcePoolTask(mid, last);
				t1.fork();
				t2.fork();
				res.addAll(t1.join());
				res.addAll(t2.join());
			}
			return res;
		}
		
	}
}
