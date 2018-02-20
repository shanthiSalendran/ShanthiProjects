public class MyClass implements Interface1, Interface2 {

	@Override
	public void method2() {
		System.out.println("Inside method2");
	}

	@Override
	public void method1(String str) {
		System.out.println("Inside method1..:"+str);
	}

	//MyClass won't compile without having it's own log() implementation
	@Override
	public void log(String str){
		System.out.println("MyClass logging::"+str);
		Interface1.print("abc");
	}
	
	public static void main(String[] args){
		MyClass mc = new MyClass();
		mc.method1("testing");
		mc.method2();
		mc.log("testsrtrr");
		mc.print1("hgfhfgh");
	}
}