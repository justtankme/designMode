package com.tank.designMode.exception;

public class ThrowsException {
	public void throwSomeException() throws SomeException{
		throw new SomeException();
	}
	
	public void throwSomeRunTimeExceptio(){
		throw new SomeRunTimeException();
	}
	
	public void throwError(){
		throw new Error("i'm error");
	}
}
