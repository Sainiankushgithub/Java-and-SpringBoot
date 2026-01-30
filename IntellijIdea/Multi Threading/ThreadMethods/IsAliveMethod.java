class MyThread extends Thread{
    public void run(){
        System.out.println("Thread1 is executed by : "+Thread.currentThread().getName());
        System.out.println(Thread.currentThread().isAlive());
    }
}
public class IsAliveMethod {
    public static void main(String[] args) {
        System.out.println("Hello is executed by : "+Thread.currentThread().getName());
        MyThread thread1 = new MyThread();
        thread1.start();
        if(Thread.currentThread().isAlive()){
            System.out.println("Main Thread is Alive.");
        }else{
            System.out.println("Main thread is dead.");
        }
        if(thread1.isAlive()){
            System.out.println("Thread 1 is alive.");
        }else{
            System.out.println("Thread1 is dead.");
        }
        System.out.println(thread1.isAlive());
    }
}
