package thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyRunnable1 implements Runnable{

	@Override
	public void run() {
		System.out.println("I am task");
	}
	
}

public class SubmitRunnableExample {
	private static final int nThreads=10;
	public static void main(String args[]){
		ExecutorService exr=Executors.newFixedThreadPool(nThreads);
		for(int i=0;i<=10;i++){
		MyRunnable1 myRun=new MyRunnable1();
		Future futureInteger1=exr.submit(myRun,1);
		Future futureInteger=exr.submit(myRun);
		try {
			System.out.println("futureInteger.get() > "+futureInteger1.get());
			System.out.println("futureInteger.get() > "+futureInteger.get());
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		exr.shutdown();
	}

}
