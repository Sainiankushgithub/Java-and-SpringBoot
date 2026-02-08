class FoodPreparation extends Thread{
    public void run(){
        try{
            System.out.println("Food preparation started . . .");
            Thread.sleep(3000);
            System.out.println("Food is ready . . . .");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
class DeliveryAssignment extends Thread{
    public void run(){
        try {
            System.out.println("Searching for delivery person...?");
            Thread.sleep(2000);
            System.out.println("Delivery person assigned !");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
class PaymentProcessing extends Thread{
    public void run(){
        try{
            System.out.println("Processing payment. . .");
            Thread.sleep(1500);
            System.out.println("Payment Successful!");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
public class FoodOrderApp {
    public static void main(String[] args)throws Exception {
        System.out.println("Order placed!");
        FoodPreparation t1 = new FoodPreparation();
        PaymentProcessing t2 = new PaymentProcessing();
        DeliveryAssignment t3 = new DeliveryAssignment();

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println("Order processing completed. . . ");
    }
}
