package com.tank.designMode.singleton;

public class ResourcePoolLazy4 {
	private ResourcePoolLazy4(){
		throw new RuntimeException("cannot call private construtor");
	}
	private static final class ResourcePoolHolder{
		public static ResourcePool resourcePoolLazy = new ResourcePool();
	}
	public static ResourcePool getInstance(){
		return ResourcePoolHolder.resourcePoolLazy;
	}
}
