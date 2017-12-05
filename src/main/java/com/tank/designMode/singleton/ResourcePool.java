package com.tank.designMode.singleton;

import java.util.UUID;

public class ResourcePool {
	public String id;
	public ResourcePool(){
		id = UUID.randomUUID().toString();
	}
}
