package coreTest;

public class OverloadingCalculation3 {

	void test1(int a,long b){
		System.out.println("this is test1");
	} 
	
	void test1(long a,int b){
		System.out.println("this is test2");
	}
	
	public static void main(String args[]){
		OverloadingCalculation3 oc=new OverloadingCalculation3();
		oc.test1(20, 20l);
	}
	
}
