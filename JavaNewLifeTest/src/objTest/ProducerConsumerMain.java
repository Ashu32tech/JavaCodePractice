package objTest;

import java.util.ArrayList;
import java.util.List;

public class ProducerConsumerMain {
	public static void main(String args[]) throws InterruptedException{
		List<Integer> shareQueue =new ArrayList<>();
		int MAX_SIZE=3;	

		Thread task1=new Thread(new ProducerImpl(shareQueue,MAX_SIZE),"Producer");
		Thread task2=new Thread(new ConsumerImpl(shareQueue),"Consumer");
		
		task1.start();
		task2.start();
		
		task1.join();
		task2.join();
	}
}

class ProducerImpl implements Runnable{
	List<Integer> shareQueue;
	int MAX_SIZE;
	public ProducerImpl(List<Integer> shareQueue, int MAX_SIZE) {
		this.shareQueue=shareQueue;
		this.MAX_SIZE=MAX_SIZE;
	}

	@Override
	public void run() {
	for(int i=0;i<=10;i++){
		try {
			producer(i);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	}
	private void producer(int i) throws InterruptedException{
		System.out.println(i);
			synchronized (shareQueue) {
				while(shareQueue.size()==MAX_SIZE){
					System.out.println(Thread.currentThread()+" now full"+" please wait"+
					" current size="+shareQueue.size());
					shareQueue.wait();
				}
				Thread.sleep(1000);
				shareQueue.add(i);
				System.out.println("Produces :"+i);
				shareQueue.notifyAll();
			}
		}
	} 


class ConsumerImpl implements Runnable{
	List<Integer> shareQueue;
	public ConsumerImpl(List<Integer> shareQueue) {
		this.shareQueue=shareQueue;
	}

	@Override
	public void run() {
			while(true){
				try {
				consumer();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			}
	}
	void consumer() throws InterruptedException{
		
			synchronized (shareQueue) {
				while(shareQueue.isEmpty()){
					System.out.println(Thread.currentThread()+" now empty"+" please wait");
					shareQueue.wait();
				}
				Thread.sleep(1000);
				int k=shareQueue.remove(0);
				System.out.println("Consume :"+k);
				shareQueue.notifyAll();
			}
	}
	
}