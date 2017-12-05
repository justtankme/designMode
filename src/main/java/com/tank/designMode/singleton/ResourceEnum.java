package com.tank.designMode.singleton;

public enum ResourceEnum {
	INSTANCE;
	private ResourcePool resourcePool;
	private ResourceEnum(){
		resourcePool = new ResourcePool();
	}
	public ResourcePool getInstance(){
		return resourcePool;
	}
}
