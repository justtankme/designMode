package com.tank.designMode.filter;

public class AuthFilter implements MyFilter{
	@Override
	public void execute(String request) {
		System.out.println("Authenticating request: " + request);
	}
	
}
