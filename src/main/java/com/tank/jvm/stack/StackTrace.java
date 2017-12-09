package com.tank.jvm.stack;

public class StackTrace {
	private String str1 = "a";
	private static void printStackTrace() {
		int a = 1;
		StackTraceElement[] stackElements = new Throwable().getStackTrace();
		int b = 2;
		if (stackElements != null) {
			for (int i = 0; i < stackElements.length; i++) {
				System.out.println("" + stackElements[i]);
			}
		}
	}

	public void methodA() {
		methodB();
	}

	public void methodB() {
		printStackTrace();
	}

	public static void main(String[] argv) {
		StackTrace a = new StackTrace();
		a.str1 = "b";
		a.methodA();
	}
}
