package com.tank.designMode.singleton;

public class ResourcePoolLazy {
	private ResourcePoolLazy(){
		throw new RuntimeException("cannot call private construtor");
	}
	private static ResourcePool resourcePoolLazy = null;
	public static ResourcePool getInstance(){
		if (resourcePoolLazy == null) {
			resourcePoolLazy = new ResourcePool();
		}
		return resourcePoolLazy;
	}
}
