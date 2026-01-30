// 4.Performing multiple task from multiple thread
class MyThread1 extends Thread{
    public void run(){
        System.out.println("Task 1");
    }
}
class MyThread2 extends Thread{
    public void run(){
        System.out.println("Task 2");
    }
}
class MyThread3 extends Thread{
    public void run(){
        System.out.println("Task 3");
    }
}
class MyThread4 extends Thread{
    public void run(){
        System.out.println("Task 4");
    }
}
public class Test {
    public static void main(String[] args) {
        System.out.println("Performing multiple task from multiple thread . . . ");
        MyThread1 thread1 = new MyThread1();
        MyThread2 thread2 = new MyThread2();
        MyThread3 thread3 = new MyThread3();
        MyThread4 thread4 = new MyThread4();
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
