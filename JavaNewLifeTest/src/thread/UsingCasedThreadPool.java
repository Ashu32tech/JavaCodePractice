package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import tuts.common.LoopTaskA;

public class UsingCasedThreadPool {

	public static void main(String args[]){
		ExecutorService exSr=Executors.newCachedThreadPool();
		exSr.execute(new LoopTaskA());
		exSr.execute(new LoopTaskA());
		exSr.execute(new LoopTaskA());
		exSr.execute(new LoopTaskA());
		exSr.execute(new LoopTaskA());
		exSr.execute(new LoopTaskA());
		exSr.shutdown();
	}
}
