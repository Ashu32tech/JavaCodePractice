package coreTest;

public class TestOverloading {
	
	  /*void sum(int a,int b){System.out.println("int arg method invoked");}  
	  void sum(long a,long b){System.out.println("long arg method invoked");}  
	  
	  public static void main(String args[]){  
		  TestOverloading obj=new TestOverloading();  
	  obj.sum(20,20);//now int arg sum() method gets invoked 
	  */
	  
	  void sum(int a,long b){System.out.println("a method invoked");}  
	  void sum(long a,int b){System.out.println("b method invoked");}  
	  
	  public static void main(String args[]){  
		  TestOverloading obj=new TestOverloading();  
	  //obj.sum(20,20);//now ambiguity 
	  
	  }  
}
