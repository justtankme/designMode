package com.tank.designMode.singleton;

public class ResourcePoolEdge {
	private ResourcePoolEdge(){
		throw new RuntimeException();
	}
	private static ResourcePool resourcePool = new ResourcePool();
	public static ResourcePool getInstance(){
		return resourcePool;
	}
}
