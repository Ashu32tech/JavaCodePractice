package cocurrency;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyRunnable1 implements Runnable{

	@Override
	public void run() {
	System.out.println("My Runnable methods");	
	}
}

public class SubmitRunnableExample {
	private static int nThread=10;	
	public static void main(String args[]){
	ExecutorService executor=Executors.newFixedThreadPool(nThread);
	
	MyRunnable1 myRunnable=new MyRunnable1();
	try {
	Future<Integer> fr=executor.submit(myRunnable, 1);

		System.out.println(fr.get());
	Future<?> fr1=executor.submit(myRunnable);
	System.out.println(fr1.get());
	
	} catch (InterruptedException | ExecutionException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
}
