class OnlineTimer extends Thread{
    public void run(){
       try{
           for(int i=0;i<5;i++){
               System.out.println("Timer is running. . . . .");
               Thread.sleep(4000);
           }
       }catch (Exception e){
           e.printStackTrace();
       }
    }
}
class AutoSave extends Thread{
    public void run(){
        try{
            while(true){
                System.out.println("Auto Saving . . . . .");
                Thread.sleep(3000);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
public class OnlineExamSystem {
    public static void main(String[] args) {
        try{
            AutoSave as = new AutoSave();
            as.setName("AutoSave");
            as.setDaemon(true); // background service provider
            as.setPriority(Thread.NORM_PRIORITY);
            OnlineTimer ot = new OnlineTimer();
            ot.setName("OnlineTimer");
            ot.setPriority(Thread.MAX_PRIORITY);
            as.start();
            ot.start();
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            System.out.println("Application closed.");
        }
    }
}
