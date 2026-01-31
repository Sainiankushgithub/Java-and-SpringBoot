class MyThread extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getPriority()+" Priority");
    }
}
public class ThreadPriorities {
    public static void main(String[] args) {
        System.out.println("main thread priority : "+Thread.currentThread().getPriority());
        MyThread th1 = new MyThread();
        MyThread th2 = new MyThread();
        th1.setPriority(Thread.MIN_PRIORITY);
        th2.setPriority(Thread.MAX_PRIORITY);
        th1.start();
        th2.start();
    }
}
