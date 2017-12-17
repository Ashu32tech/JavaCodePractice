package thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class SumIntegerCallable implements Callable{

	 Integer n;
	 
	    SumIntegerCallable(Integer n) {
	           this.n = n;
	    }
	    
	@Override
	public Object call() throws Exception {
		Integer sum = 0;
        for (int i = 0; i <= n; i++) {
               sum += i;
        }
		return sum;
	}
}


class SquareDoubleCallable implements Callable{

	 Double n;
	    SquareDoubleCallable(Double n) {
	           this.n = n;
	    }	    
	@Override
	public Object call() throws Exception {
		return n*n;
	}	
}


public class CallableFutureExample {

	private static final int nThread=10;
	
	public static void main(String args[]) throws InterruptedException, ExecutionException{
		ExecutorService exrc=Executors.newFixedThreadPool(nThread);
			
		Future<Integer> futureInteger=exrc.submit(new SumIntegerCallable(5000));
		Future<Double> futureDouble=exrc.submit(new SquareDoubleCallable(700.7));
		
		while(true){
		if(futureInteger.isDone() && futureDouble.isDone()){
			System.out.println("both done");
			System.out.println("SumIntegerCallable has returned > "+futureInteger.get());
		    System.out.println("SquareDoubleCallable has returned > "+futureDouble.get());
		   break;
		}
		}
		/*
		try {
			System.out.println("SumIntegerCallable has returned > "+futureInteger.get());
		    System.out.println("SquareDoubleCallable has returned > "+futureDouble.get());
		}catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		exrc.shutdown();    		    
	}
}



/*package test; import java.util.concurrent.Callable; 
import java.util.concurrent.ExecutionException; 
import java.util.concurrent.ExecutorService; 
import java.util.concurrent.Executors; 
import java.util.concurrent.Future; 
import java.util.logging.Level; 
import java.util.logging.Logger; 
*//** * Java program to show how to use Future in Java. Future allows to write * 
 * asynchronous code in Java, where Future promises result to be available in * future * * @author Javin *//* 
public class FutureDemo { 
	private static final ExecutorService threadpool = Executors.newFixedThreadPool(3); 
	public static void main(String args[]) throws InterruptedException, ExecutionException { 
		FactorialCalculator task = new FactorialCalculator(10); 
		System.out.println("Submitting Task ..."); 
		Future future = threadpool.submit(task); 
		System.out.println("Task is submitted"); w
		hile (!future.isDone()) { 
			System.out.println("Task is not completed yet...."); 
			Thread.sleep(1); //sleep for 1 millisecond before checking again
			} System.out.println("Task is completed, let's check result"); 
			long factorial = future.get(); System.out.println("Factorial of 1000000 is : " + factorial); 
			threadpool.shutdown();
			} 
	private static class FactorialCalculator implements Callable { 
		private final int number;
		public FactorialCalculator(int number) { 
			this.number = number; 
			} 
		@Override public Long call() {
			long output = 0; 
			try { 
				output = factorial(number); 
				} catch (InterruptedException ex) { 
					Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex); 
					} return output; } 
		private long factorial(int number) throws InterruptedException { 
			if (number < 0) { 
				throw new IllegalArgumentException("Number must be greater than zero"); 
				} long result = 1; while (number > 0) { 
					Thread.sleep(1); // adding delay for example result = result * number; number--;
					} 
				return result; 
					} 
		} 
	} 
Output Submitting Task ... Task is submitted Task is not completed yet.... Task is not completed yet.... Task is not completed yet.... Task is completed, let's check result Factorial of 1000000 is : 3628800
	}
		}
	}
}

Read more: http://javarevisited.blogspot.com/2015/01/how-to-use-future-and-futuretask-in-Java.html#ixzz4sFXntkJa*/