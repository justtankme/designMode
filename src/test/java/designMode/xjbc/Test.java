package designMode.xjbc;

public class Test {
	public static String string = Test.initStr();
	
	static {
		System.out.println("静态代码块执行了");
	}
	
	public static String initStr(){
		System.out.println("静态属性初始化了");
		return "test";
	}
	
	public static void initNothing(){
		System.out.println("静态方法执行了");
	}
	
	Test a = new Test();
	public Test(){
		System.out.println("构造函数执行了");
	}
	public static void main(String[] args) {
		System.out.println("main方法执行了");
//		Test testMain = new Test();
	}
}
