
public class Test {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("JVM_Thread");
        try{
            System.out.println(100/0);
        }catch(Exception e){
            e.printStackTrace();
            System.out.println(Thread.currentThread().getName());
        }
        System.out.println("program successfully executed");
    }
}
