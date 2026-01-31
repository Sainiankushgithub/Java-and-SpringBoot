// Real Application Example 1: Auto-Save Feature (Like Google Docs / IDE)
class AutoSave extends Thread{
    public void run(){
        while(true){
            try{
                Thread.sleep(3000);
                System.out.println("Auto saving . . . .");
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
public class AutoSaveApp {
    public static void main(String[] args) {
        AutoSave as = new AutoSave();
        as.setDaemon(true);
        as.start();
        for(int i=0;i<5;i++){
            try{
                System.out.println("User is working . . . ");
                Thread.sleep(2000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        System.out.println("Application is closed.");
    }
}
