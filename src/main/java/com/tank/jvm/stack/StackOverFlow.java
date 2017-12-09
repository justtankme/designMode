package com.tank.jvm.stack;

public class StackOverFlow {
	private Long stackLength = 0L;
	
	public void stackPush(Long len){
		stackLength+=len;
		stackPush(len);
	}
	
	public static void main(String[] args) {
		StackOverFlow stackOverFlow = new StackOverFlow();
		try {
			stackOverFlow.stackPush(1L);
		} catch(Exception e){
			System.out.println("can you see me?");
		}
		catch (StackOverflowError e) {//oom是Error,不是Exception
			System.out.println("stack length:" + stackOverFlow.stackLength);
			e.printStackTrace();
		}
		
	}
}
