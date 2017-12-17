package thread;

import java.util.concurrent.TimeUnit;

public class FifthTest5 {
		public static void main(String args[]){
			Thread t1=new Thread(new Runnable(){

				@Override
				public void run() {
					for(int i=10;i>=1;i--){	
						System.out.println("Tick Tick"+i);
						try {
							TimeUnit.MILLISECONDS.sleep(200);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						}
					
				}
				
			});
			t1.start();
		}		
}
