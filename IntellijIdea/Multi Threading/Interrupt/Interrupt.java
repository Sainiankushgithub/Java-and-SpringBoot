class MyThread extends Thread{
    public void run(){
        try {
            for(int i=1;i<=5;i++){
                System.out.println(Thread.currentThread().getName()+"   : "+i);
                Thread.sleep(1000);
            }
        }catch (Exception e){
            System.out.println("Exception : "+e);
        }
    }
}
class MyThread2 extends Thread{
    public void run(){
        try {
            for(int i=1;i<=5;i++){
                System.out.println(Thread.currentThread().getName()+"   : "+i);
                Thread.sleep(1000);
            }
        }catch (Exception e){
            System.out.println("Exception : "+e);
        }
    }
}
public class Interrupt {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
        t1.interrupt();
        MyThread2 t2 = new MyThread2();
        t2.start();
    }
}
