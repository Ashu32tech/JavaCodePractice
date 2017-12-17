package tuts.common;

import java.util.concurrent.TimeUnit;

public class LoopTaskA implements Runnable{
	public static int count;
	public int id;
	@Override
	public void run() {
		System.out.println("####################Task <"+id+">Starting###########");
		for(int i=10;i>=1;i--){	
			System.out.println("<"+id+">Tick Tick"+i);
			try {
				TimeUnit.MILLISECONDS.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("####################Task <"+id+">End###########");

	}
	public LoopTaskA(){
		this.id=count++;		
	}
	
}