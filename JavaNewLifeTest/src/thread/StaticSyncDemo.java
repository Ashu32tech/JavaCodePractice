package thread;

class Account{

	 synchronized static void showAccount(String accountName){
	     System.out.println("My account name is "+accountName+" Holder Name is "+Thread.currentThread().getName());
	     try{
	       Thread.sleep(500);
	     }catch(Exception e){}
	     System.out.println("My account name is "+accountName+" Holder Name is "+Thread.currentThread().getName());

	   }
	 
	 void addAccount(String accountName){
	     System.out.println("My account name is "+accountName+" Holder Name is "+Thread.currentThread().getName());
	     
	   }
	}

	class MyThread1 extends Thread{
	    public void run(){
	       Account.showAccount("Dineshonjava.com");
	  }
	}

	class MyThread2 extends Thread{
	    public void run(){
	       Account.showAccount("Linkedin.com");
	    }
	}

	class MyThread3 extends Thread{
	    public void run(){
	       Account.showAccount("Facebook.com");
	    }
	}

	class MyThread4 extends Thread{
	    public void run(){
	       Account.showAccount("Twitter.com");
	    }
	}

public class StaticSyncDemo{
	    public static void main(String t[]){
	       MyThread1 t1 = new MyThread1();
	       MyThread2 t2 = new MyThread2();
	 
	       t1.setName("DAV JavaServices");
	       t2.setName("Add Account");
	             
	       t1.start();
	       t2.start();
	      
	    }
	}