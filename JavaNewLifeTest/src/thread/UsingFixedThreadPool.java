package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import tuts.common.LoopTaskA;

public class UsingFixedThreadPool {

	public static void main(String[] args) {
		ExecutorService execute=Executors.newFixedThreadPool(3);
		
		execute.execute(new LoopTaskA());
		execute.execute(new LoopTaskA());
		execute.execute(new LoopTaskA());
		execute.execute(new LoopTaskA());
		execute.execute(new LoopTaskA());
		execute.execute(new LoopTaskA());
		execute.shutdown();
		//execute.execute(new LoopTaskA());	
		
	}

}
