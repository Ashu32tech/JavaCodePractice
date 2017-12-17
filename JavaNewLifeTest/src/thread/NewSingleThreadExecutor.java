package thread;
import tuts.common.LoopTaskA;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NewSingleThreadExecutor {

	public static void main(String args[]){
		ExecutorService exSr=Executors.newSingleThreadExecutor();
		exSr.execute(new LoopTaskA());
		exSr.execute(new LoopTaskA());
		exSr.execute(new LoopTaskA());
		exSr.execute(new LoopTaskA());
		exSr.execute(new LoopTaskA());
		exSr.execute(new LoopTaskA());
		exSr.shutdown();
		
	}
}
