package term2;

class MyTask implements Runnable {
    private String taskName;

    public MyTask(String name) {
        this.taskName = name;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(taskName + " - Count: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(taskName + " interrupted.");
            }
        }
        System.out.println(taskName + " finished execution.");
    }
}


public class RunnableDemo {
    public static void main(String[] args) {

        Runnable task1 = new MyTask("Thread-1");
        Runnable task2 = new MyTask("Thread-2");


        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);


        t1.start();
        t2.start();

        System.out.println("Main thread finished execution.");
    }
}

