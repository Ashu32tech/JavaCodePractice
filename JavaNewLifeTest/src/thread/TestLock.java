package thread;

public class TestLock {
	
		public static void main(String args[]){
			Table t=new Table();
			
			MyTest1 test1=new MyTest1(t);
			Thread thr1=new Thread(test1);
			Thread thr2=new Thread(test1);
			
			thr1.start();
			thr2.start();
			
		}
	
}

class Table{
	
	synchronized void printTable(int n){
			for(int i=1;i<=5;i++){
				System.out.println(i*n);
				try{
					Thread.sleep(400);
					}catch(Exception e){
						e.printStackTrace();
					}
			}	
	}
}

class MyTest1 implements Runnable{	
Table t;
 
		MyTest1(Table t){
	    this.t=t;
		}
public void run(){
	     t.printTable(5);
		}

}


/*class MyTest2 implements Runnable{	

Table t;

MyTest2(Table t){
	this.t=t;
}

public void run(){
	t.printTable(100);
}
}*/




/*class MyTest2 extends Thread{	

Table t;

MyTest2(Table t){
	this.t=t;
}

public void run(){
	t.printTable(100);
}
}*/



/*class MyTest1 extends Thread{
	Table t;
	 
	MyTest1(Table t){
		this.t=t;
	}
	public void run(){
		t.printTable(5);
	}
	
}*/

/*class MyTest2 extends Thread{	
	
	Table t;
	
	MyTest2(Table t){
		this.t=t;
	}
	
	public void run(){
		t.printTable(100);
	}
}*/