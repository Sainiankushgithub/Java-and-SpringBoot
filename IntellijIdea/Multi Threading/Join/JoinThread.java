class MyThread1 extends Thread{
    public void run(){
        try{
            for(int i=1;i<=5;i++){
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName()+" : "+i);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
class MyThread2 extends Thread{
    public void run(){
        try{
            for(int i=1;i<=5;i++){
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName()+" : "+i);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
public class JoinThread {
    public static void main(String[] args) throws Exception {
        MyThread1 thread1 = new MyThread1();
        MyThread2 thread2 = new MyThread2();
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        for(int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+" : "+i);
        }
        System.out.println("Both Threads Finished execution.");
    }
}
