class MyThread1 extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+" : "+i);
        }
    }
}
public class YieldMethod {
    public static void main(String[] args) {
        MyThread1 thread1 = new MyThread1();
        thread1.start();
        Thread.yield();
        for(int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+" : "+i);
        }
    }
}
