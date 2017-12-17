package thread;

class JavaMethodTestT implements Runnable{

	static int i=0;
	public void run(){
		i=i+1;
		System.out.println(i);
	}	
}

public class JavaMethodTest{
				public static void main(String...args) throws InterruptedException{
					
					JavaMethodTestT jmt=new JavaMethodTestT();
					Thread t1=new Thread(jmt);
					Thread t2=new Thread(jmt);
					Thread t3=new Thread(jmt);
					Thread t4=new Thread(jmt);
				
				t1.start();
				t1.join();
				t2.start();
				t2.join();
				t3.start();
				t3.join();
				t4.start();
				t4.join();
				}	
}
