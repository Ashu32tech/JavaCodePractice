package thread;

class MyThread extends Thread {
	 
    @Override
    public void run() {
           System.out.println("in run() method");
    }
    
    @Override
    public void start(){

           System.out.println("In start() method");
    
           super.start();
           }
    
}

/** Copyright (c), AnkitMittal JavaMadeSoEasy.com */ 
public class OverrideStartMethod {
    public static void main(String[] args) {
           System.out.println("main has started.");
           
           MyThread thread1=new MyThread();
           thread1.start();
           
           System.out.println("main has ended.");
    }
 
}
