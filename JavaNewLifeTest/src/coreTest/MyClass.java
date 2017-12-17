package coreTest;

class Xyz{
	Xyz(){
		System.out.println("this is xyz");
	}
	
	static void abc(){
		System.out.println("static class");
	}
	void OverrideTest(){
		System.out.println("parent class");
	}
	
}
public class MyClass extends Xyz{
	int i;
	String abc;
	static int a;
	MyClass(int i,String abc){
	this.i=i;
	this.abc=abc;
	}
	
	static{
		System.out.println("this is static block");
	}
	{
		System.out.println("this is init block");
	}
	MyClass(){
		System.out.println("i am in MyClass");
	}
	
	void MyClass(){
		System.out.println("i am in MyClass");
	}
	static void checkStatic(){
		
		System.out.println("this is static");
	}
	static void abc(){
		System.out.println("in cahild");
	}
	void OverrideTest(){
		System.out.println("child class");
	}
	public static void main(String args[]){
		MyClass ms=new MyClass();
		MyClass a=new MyClass(1,"i am");
		System.out.println(a.i+a.abc);
		MyClass.abc();
		checkStatic();
		Xyz.abc();
		ms.OverrideTest();
		
		Xyz m12=new MyClass();
		m12.OverrideTest();
		
	}
	
}
