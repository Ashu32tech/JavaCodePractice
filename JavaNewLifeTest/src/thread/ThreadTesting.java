package thread;

class ThreadTesting1 implements Runnable{
	ThreadTesting t1;
	int i;
	ThreadTesting1(ThreadTesting t1,int i){
		this.t1=t1;
		this.i=i;
	}
	public void run(){	
		try {
			if(i==0){
				ThreadTesting.test1();
			}else{
				t1.test2();
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


public class ThreadTesting{
	
	 static synchronized void test1() throws InterruptedException{
		System.out.println("I am in sysncronised");
		Thread.sleep(5000);
		System.out.println("I am finish");
	}
	
	  void test2(){
		System.out.println("I am in test 2");
	}

	public static void main(String args[]){
		ThreadTesting re1=new ThreadTesting();
		ThreadTesting re2=new ThreadTesting();
		ThreadTesting1 t1=new ThreadTesting1(re1,0);
		ThreadTesting1 t2=new ThreadTesting1(re2,0);
		Thread t12=new Thread(t1);
		Thread t13=new Thread(t2);
		t12.start();
		t13.start();
		
		
		
	}
	
}
