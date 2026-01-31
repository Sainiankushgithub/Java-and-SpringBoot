class MyThread2 extends  Thread{
    public void run(){
        if(Thread.currentThread().isDaemon()){
            System.out.println("Daemon Thread");
        }else{
            System.out.println("Child Thread");
        }
    }
}
public class DaemonThread {
    public static void main(String[] args) {
        // case 1 : If there is nothing in main method to execute than daemon thread will not execute because it run in background
        // case 2 :
        // Thread.currentThread().setDaemon(true); // Throws exception because we can't create it daemon thread after it has started
        System.out.println(Thread.currentThread().getName()+" thread");
        MyThread2 thread2 = new MyThread2();
        thread2.setDaemon(true);
        thread2.start();
        try {
            thread2.setDaemon(true);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
