/*Java Concurrency - Part 5 : Monitors (Locks and Conditions)
Baptiste Wicht 2010-09-06 07:13 28 Comments Source
After seeing how to synchronize code using semaphores, we'll see how to do that using monitors.

Monitors are an other mechanism of concurrent programming. It's a higher level mechanism than semaphores and also more powerful. A monitor is an instance of a class that can be used safely by several threads. All the methods of a monitor are executed with mutual exclusion. So at most one thread can execute a method of the monitor at the same time. This mutual exclusion policy makes easier to work with monitor and to develop the method content of the monitor.

Monitors have an other feature, the possibility to make a thread waiting for a condition. During the wait time, the thread temporarily gives up its exclusive access and must reacquire it after the condition has been met. You can also signal one or more threads that a condition has been met.

There is several advantages on using monitors instead of a lower-level mechanisms :

All the synchronization code is centralized in one location and the users of this code don�t need to know how it�s implemented.
The code doesn't depend on the number of processes, it works for as many processes as you want
You don�t need to release something like a mutex, so you cannot forget to do it
When we must describe a monitor, we simple use the monitor keyword and describe the methods as common methods :

monitor SimpleMonitor {
    public method void testA(){
        //Some code
    }

    public method int testB(){
        return 1;
    }
}
To describe a condition variable, we use the cond keyword. A condition variable is a kind of queue of process who are waiting on the same condition. You have several operations available on a condition, the most important is to signal a process waiting to be awaken and to wait on a condition. There are some similarities between signal/wait operations and P and V of semaphores, but this is a little different. The signal operation does nothing if the queue is empty and the wait operation put always the thread in the waiting queue. The process queue is served in a first come, first served mode. When a thread wakes up after waiting on a condition, it must reacquire the lock before continuing in the code.

Before going further, we must have more information about the signal operations. When writing monitors, you normally have the choice between several philosophies for the signaling operation :

Signal & Continue (SC) : The process who signal keep the mutual exclusion and the signaled will be awaken but need to acquire the mutual exclusion before going.
Signal & Wait (SW) : The signaler is blocked and must wait for mutual exclusion to continue and the signaled thread is directly awaken and can start continue its operations.
Signal & Urgent Wait (SU) : Like SW but the signaler thread has the guarantee than it would go just after the signaled thread
Signal & Exit (SX) : The signaler exits from the method directly after the signal and the signaled thread can start directly. This philosophy is not often used.
The available policies depends on the programming language, in Java, there is only one policy available, the SC one.

In Java there is no keyword to directly create a monitor. To implement a monitor, you must create a new class and use Lock and Condition classes. Lock is the interface is ReentrantLock is the main used implementation, this is the one that we'll learn to use in the current post. To create a ReentrantLock, you have two constructors, a default constructor and a constructor with a boolean argument indicating if the lock is fair or not. A fair lock indicates that the threads will acquire the locks in the order they ask for. Fairness is a little heavier than default locking strategies, so use it only if you need it. To acquire the lock, you just have to use the method lock and unlock to release it.

The explicit locks have the same memory semantics than the synchronized blocks. So the visibility of the changes is guarantee when you use lock()/unlock() blocks.

So to implement, the monitor example we've seen before, we just need to create a class and use the lock to make the mutual exclusion :

public class SimpleMonitor {
    private final Lock lock = new ReentrantLock();

    public void testA() {
        lock.lock();

        try {
            //Some code
        } finally {
            lock.unlock();
        }
    }

    public int testB() {
        lock.lock();

        try {
            return 1;
        } finally {
            lock.unlock();
        }
    }
}
The person who've already read the other parts of this post set will say that it will be easier to use the synchronized keyword on the two methods. But with synchronized, we will not have the condition variables. If you don't need condition variables but only locking, it will be easier to use the synchronized blocks instead of Locks.

You can create conditions using the newCondition method on the lock. A condition is a variable of type Condition. You can make the current thread wait on the condition using the await method (and its variant with timeout) and you can signal threads using signal and signalAll methods. The signalAll methods wakes up all the threads waiting on the condition variable.

Let's try with a simple common example : A bounded buffer. It's a cyclic buffer with a certain capacity with a start and an end.

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BoundedBuffer {
    private final String[] buffer;
    private final int capacity;

    private int front;
    private int rear;
    private int count;

    private final Lock lock = new ReentrantLock();

    private final Condition notFull = lock.newCondition();
    private final Condition notEmpty = lock.newCondition();

    public BoundedBuffer(int capacity) {
        super();

        this.capacity = capacity;

        buffer = new String[capacity];
    }

    public void deposit(String data) throws InterruptedException {
        lock.lock();

        try {
            while (count == capacity) {
                notFull.await();
            }

            buffer[rear] = data;
            rear = (rear + 1) % capacity;
            count++;

            notEmpty.signal();
        } finally {
            lock.unlock();
        }
    }

    public String fetch() throws InterruptedException {
        lock.lock();

        try {
            while (count == 0) {
                notEmpty.await();
            }

            String result = buffer[front];
            front = (front + 1) % capacity;
            count--;

            notFull.signal();

            return result;
        } finally {
            lock.unlock();
        }
    }
}
So some explications :

The two methods are protected with the lock to ensure mutual exclusion
Then we use two conditions variables. One to wait for the buffer to be not empty and an other one to wait for the buffer to be not full.
You can see that I have wrapped the await operation on a while loop. This is to avoid signal stealers problem that can occurs when using Signal & Continue
And that BoundedBuffer can be easily used with several threads with no problems.

As you can see, you can use monitors to solve a lot of concurrent programming problems and this mechanism is really powerful and performing.

I hope you found that article interesting and that this set of posts about Java concurrency brings you some stuff about Java.*/