package com.tank.designMode.singleton;

public class ResourcePoolLazy2 {
	private ResourcePoolLazy2(){
		throw new RuntimeException("cannot call private construtor");
	}
	private static ResourcePool resourcePoolLazy = null;
	public static synchronized ResourcePool getInstance(){
		if (resourcePoolLazy == null) {
			resourcePoolLazy = new ResourcePool();
		}
		return resourcePoolLazy;
	}
}
