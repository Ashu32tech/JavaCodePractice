package thread;

import java.util.ArrayList;
import java.util.List;

public class ProducerConsumerExampleWithWaitAndNotify{
	public static void main(String args[]){
	 List<Integer> taskQueue = new ArrayList<Integer>();
	   int MAX_CAPACITY = 3;
	  Thread tProducer = new Thread(new Producer(taskQueue,MAX_CAPACITY), "Producer");
	  Thread tConsumer = new Thread(new Consumer(taskQueue),"Consumer");
	  tProducer.start();
	  tConsumer.start();
	 //b.consume();
	}
}
class Producer implements Runnable{
	 List<Integer> taskQueue;
	 private final int           MAX_CAPACITY;
	 Producer(List<Integer> sharedQueue,int size){
		this.taskQueue=sharedQueue;
		this.MAX_CAPACITY=size;
	 }
	
	@Override
	public void run() {
		//int count=0;
		 for (int i = 1; i <= 10; i++) {
			try {
				produce(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		 }
		
	

	private void produce(int i)throws InterruptedException{
		synchronized (taskQueue) {
			while(taskQueue.size()==MAX_CAPACITY){
				 System.out.println("Queue is full " + 
			Thread.currentThread().getName() + " is waiting , size: " + taskQueue.size());
				 taskQueue.wait();	 
			}
			
		Thread.sleep(1000);
		taskQueue.add(i);	
		 System.out.println("Produced: " + i);
         taskQueue.notifyAll();
		} 
	 }

}
class Consumer implements Runnable{
	 List<Integer> taskQueue;
	 Consumer(List<Integer> sharedQueue){
		 this.taskQueue=sharedQueue;
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
	 void consumer()throws InterruptedException{
		 synchronized (taskQueue) {
			while(taskQueue.isEmpty()){
				  System.out.println("Queue is empty " + Thread.currentThread().getName() +
						  " is waiting , size: " + taskQueue.size());
		            taskQueue.wait();
			}
			Thread.sleep(1000);
	         int i = (Integer) taskQueue.remove(0);
	         System.out.println("Consumed: " + i);
	         taskQueue.notifyAll();
		}
	 }
	
}
