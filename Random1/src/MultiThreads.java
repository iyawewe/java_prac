class MyThread extends Thread {
    private String threadName;
    private static int count = 0;
    public MyThread(String name) {
        this.threadName = name;
    }
    public void run() {
        try {
            while (count<7) {
                System.out.println(threadName + " - Execution Count: " + ++count);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(threadName + " interrupted.");
        }
    }
}

public class MultiThreads {
    public static void main(String args[]) {
        MyThread CSthread = new MyThread("CSthreadLoveneet");
        MyThread ITthread = new MyThread("ITthreadNitin");

        CSthread.start();
        ITthread.start();
    }
}
