class MyThread1 extends Thread{
    public void run(){
        try{
            System.out.println("Interrupted ? : "+Thread.interrupted());
            for(int i=1;i<=5;i++){
                System.out.println(Thread.currentThread().getName()+" : "+i);
                Thread.sleep(1000);
                System.out.println("Interrupted ? : "+Thread.interrupted());
                if(!Thread.interrupted()){
                    Thread.currentThread().interrupt();
                }
            }
        }catch (Exception e){
            System.out.println("Exception : "+e);
        }
    }
}
public class Interrupted {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        t1.start();
        t1.interrupt();
    }
}
