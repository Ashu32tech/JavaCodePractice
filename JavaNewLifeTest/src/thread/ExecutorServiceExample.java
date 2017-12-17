package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyRunnable implements Runnable{
int taskNumber;
	MyRunnable(int taskNumber){
		this.taskNumber=taskNumber;
	}
	
	
	@Override
	public void run() {
		System.out.println("Current Thread"+Thread.currentThread().getName()+"Task Number"+taskNumber);
		try{
			Thread.sleep(1000);
		}catch(Exception e){
			e.printStackTrace();
		}	
	}

	
}
public class ExecutorServiceExample {
	
	private static int nThread=2;
	private static int nTask=10;
	
	public static void main(String args[]){
		ExecutorService exeSer=Executors.newFixedThreadPool(nThread);
		  System.out.println("executor created with 2 threads.");
          
          System.out.println("2 threads in executor will be used for executing 10 tasks. "
                       + "So, at a time only 2 tasks will be executed");
		for(int i=0;i<=nTask;i++){
			MyRunnable myTask=new MyRunnable(i);
			
			//exeSer.execute(myTask);
			exeSer.submit(myTask);
		}
		
		exeSer.shutdown();
		  System.out.println("executor has been shutDown.");
		
		
	}
	
	
	

}
