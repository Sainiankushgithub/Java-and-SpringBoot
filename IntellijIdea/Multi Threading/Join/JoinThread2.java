class MyThread extends Thread{
    Thread mainThread;
    public void run(){
        try{
            mainThread.join();
            for(int i=1;i<=5;i++){
                System.out.println(Thread.currentThread().getName()+" : "+i);
                Thread.sleep(1500);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
public class JoinThread2 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.mainThread = Thread.currentThread();
        t1.start();
        try{
            for(int i=1;i<=5;i++){
                System.out.println(Thread.currentThread().getName()+" : "+i);
                Thread.sleep(2000);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
