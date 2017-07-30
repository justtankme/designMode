package com.tank.designMode.filter;

public class DebugFilter implements MyFilter {

	@Override
	public void execute(String request) {
		System.out.println("request log: " + request);
	}

}
