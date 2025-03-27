package term2;

class CounterThread extends Thread {
    private int counter = 0;

    public CounterThread(String name, int priority) {
        super(name);  
        setPriority(priority);
    }

    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        while (System.currentTimeMillis() - startTime < 10) {
            counter++;  
        }
        System.out.println(getName() + " (Priority " + getPriority() + ") Count: " + counter);
    }
}

public class ThreadPriorityDemo {
    public static void main(String[] args) {
        
        CounterThread t1 = new CounterThread("Thread-1", 1);
        CounterThread t2 = new CounterThread("Thread-2", 3);
        CounterThread t3 = new CounterThread("Thread-3", 5);
        CounterThread t4 = new CounterThread("Thread-4", 7);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

    
        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All threads finished execution.");
    }
}

