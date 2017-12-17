package thread;

import java.util.concurrent.TimeUnit;

public class FourthTest4 {
		public static void main(String args[]){
			FourthTask f=new FourthTask();
			FourthTask f1=new FourthTask();
			Thread t=new Thread(f);
			
			Thread t1=new Thread(f1);
			t.start();
			t1.start();
		}		
}
class FourthTask implements Runnable{
	public static int count;
	public int id;
	
	@Override
	public void run() {
	for(int i=10;i>=1;i--){	
	System.out.println("<"+id+">Tick Tick"+i);
	try {
		TimeUnit.MILLISECONDS.sleep(200);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	}
	FourthTask(){
		this.id=count++;

	}
}
