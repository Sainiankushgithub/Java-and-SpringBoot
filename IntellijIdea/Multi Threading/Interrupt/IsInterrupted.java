class MyThread3 extends  Thread{
    public void run(){
        try{
            System.out.println("IsInterrupted ? " + Thread.currentThread().isInterrupted());
            // IsInterrupted Doesn't clear the flag , it remains true 
            for(int i=1;i<=5;i++){
                System.out.println(Thread.currentThread().getName()+" : "+i);
                System.out.println("IsInterrupted ? : "+Thread.currentThread().isInterrupted());
                Thread.sleep(1000);
            }
        }catch (Exception e){
            System.out.println("Exception : "+e);
        }
    }
}
public class IsInterrupted {
    public static void main(String[] args) {
        MyThread3 t = new MyThread3();
        t.start();
        t.interrupt();
    }
}
