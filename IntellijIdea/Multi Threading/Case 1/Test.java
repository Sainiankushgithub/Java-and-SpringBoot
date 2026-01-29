// 1.Performing single task from single thread
class MyThread extends Thread{
    public void run(){
        System.out.println("Task 1");
    }
}
public class Test {
    public static void main(String[] args) {
        System.out.println("Everything is working fine");
        MyThread thread1 = new MyThread();
        thread1.start();
    }
}
