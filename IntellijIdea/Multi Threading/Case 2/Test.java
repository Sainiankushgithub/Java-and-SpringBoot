// 2.Performing single task from multiple thread
class MyThread extends Thread{
    static int task =0;
    public void run(){
        System.out.println("Thread task : "+task++);
    }
}
public class Test {
    public static void main(String[] args) {
        System.out.println("Performing single task from multiple thread");
        MyThread thread1 = new MyThread();
        thread1.start();
        MyThread thread2 = new MyThread();
        thread2.start();
        MyThread thread3 = new MyThread();
        thread3.start();
        MyThread thread4 = new MyThread();
        thread4.start();
    }
}
