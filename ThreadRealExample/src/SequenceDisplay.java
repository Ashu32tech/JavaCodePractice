

public class SequenceDisplay {

 /**
  * devinline.com
  */
 public static void main(String[] args) {

	 SequenceDisplayImpl  monitor1=new SequenceDisplayImpl();
	 
  Thread t1 = new Thread(new ThreadOne(monitor1));
  Thread t2 = new Thread(new ThreadTwo(monitor1));
  Thread t3 = new Thread(new ThreadThree(monitor1));
  t3.start();
  t2.start();
  t1.start(); 


 }
}
class ThreadOne implements Runnable{
	 SequenceDisplayImpl  monitor1;
	public ThreadOne(SequenceDisplayImpl monitor1) {
		this.monitor1=monitor1;
	}

	@Override
	public void run() {
		try {
			while(true){monitor1.print1();}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
class ThreadTwo implements Runnable{
	 SequenceDisplayImpl  monitor1;
	public ThreadTwo(SequenceDisplayImpl monitor1) {
		this.monitor1=monitor1;
	}

	@Override
	public void run() {
		try {
			while(true){monitor1.print2();}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
class ThreadThree implements Runnable{
	 SequenceDisplayImpl  monitor1;
	public ThreadThree(SequenceDisplayImpl monitor1) {
		this.monitor1=monitor1;
	}

	@Override
	public void run() {
		
		try {
			while(true){monitor1.print3();}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}


class SequenceDisplayImpl {
	// static Object monitor = new Object();

	 static boolean one = true;
	 static boolean two = false;
	 static boolean three = false;
	 
	 

	  /*SequenceDisplayImpl(int threadId) {
	   this.threadId = threadId;
	  }*/

	  void print1() throws InterruptedException{
	
		  synchronized (this) {
			    
			       if (!one) {
			        this.wait();
			       } else {
			        System.out.println(1);
			       
			        one = false;
			        two = true;
			        three = false;
			        Thread.sleep(1000);
			        this.notifyAll();
			       }
			   
		 
	  }
		   }
	  
	  void print2() throws InterruptedException{
			  
		  synchronized (this) {
			       if (!two) {
			        this.wait();
			       } else {
			    
			        System.out.println(2);
			        
			        one = false;
			        two = false;
			        three = true;
			        Thread.sleep(1000);
			        this.notifyAll();
			       }
			      
		  }
	  }
	  
	  void print3() throws InterruptedException{
		  
		  synchronized (this) {
		       if (!three) {
		        this.wait();
		       } else {
		     
		        System.out.println(3);
		        one = true;
		        two = false;
		        three = false;
		        Thread.sleep(1000);
		        this.notifyAll();
		       }
		      
		  }
	  }
	  
	  
	  
	 /* private void print() {
	   try {
	    while (true) {
	     Thread.sleep(500);
	  
	  
	    
	     }
	    }
	   } catch (InterruptedException e) {
	    e.printStackTrace();
	   }

	  }*/

	 }