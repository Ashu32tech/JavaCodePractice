package thread;
class Common {      
    public synchronized void synchronizedMethod1() {
        System.out.println("synchronizedMethod1 called");
        try {
            Thread.sleep(1000);
            } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("synchronizedMethod1 done");
    }
    public void method1() {
        System.out.println("Method 1 called");
        try {
            Thread.sleep(1000);
            } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Method 1 done");
    }
}



public class MyThreadAshu extends Thread {
    private int id = 0;
    private Common common;

    public MyThreadAshu(String name, int no, Common object) {
        super(name);
        common = object;
        id = no;
    }

    public void run() {
        System.out.println("Running Thread" + this.getName());
        try {
            if (id == 0) {
                common.synchronizedMethod1();
                } else {
                common.method1();
            }
            } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Common c = new Common();
        MyThreadAshu t1 = new MyThreadAshu("MyThread-1", 0, c);
        MyThreadAshu t2 = new MyThreadAshu("MyThread-2", 1, c);
        t1.start();
        t2.start();
    }
}