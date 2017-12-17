package thread;

import java.util.concurrent.TimeUnit;

public class ThirdTest3 {
		public static void main(String args[]){
			new ThirdTask();
			new ThirdTask();
		}		
}
class ThirdTask implements Runnable{
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
	ThirdTask(){
		this.id=count++;
		new Thread(this).start();;
	}
}
