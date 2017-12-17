package thread;

import java.util.concurrent.TimeUnit;

public class SecondTest2 {
		public static void main(String args[]){
			new SecondTask().start();;
			Thread t=new SecondTask();
			t.start();
		}		
}
class SecondTask extends Thread{
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
	SecondTask(){
		this.id=count++;
		//this.start();
	}
}
