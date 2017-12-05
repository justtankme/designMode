package com.tank.designMode.singleton;

public class ResourcePoolLazy3 {
	private ResourcePoolLazy3(){
		throw new RuntimeException("cannot call private construtor");
	}
	private static volatile ResourcePool resourcePoolLazy = null;
	public static ResourcePool getInstance(){
		if (resourcePoolLazy == null) {
			synchronized (ResourcePoolLazy3.class) {
				if(resourcePoolLazy == null){
					resourcePoolLazy = new ResourcePool();
				}
			}
			
		}
		return resourcePoolLazy;
	}
}
