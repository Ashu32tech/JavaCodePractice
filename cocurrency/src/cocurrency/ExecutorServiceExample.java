package cocurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyRunnable implements Runnable{
	
	int taskNumber;
	
	MyRunnable(int taskNumber){
			this.taskNumber=taskNumber;
	}
	@Override
	public void run() {
		
		System.out.println(Thread.currentThread().getName()+"Executing task number="+taskNumber);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


public class ExecutorServiceExample {
	
	private static int nTask=10;
	private static int nThread=2;
	
	public static void main(String args[]){
		
		ExecutorService es=Executors.newFixedThreadPool(nThread);
		for(int i=1;i<=nTask;i++){
		
			MyRunnable myRunnable=new MyRunnable(i);
			es.execute(myRunnable);
			
		}
		es.shutdown();
		System.out.println("Shut down");
		
	}
	
}
