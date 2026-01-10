public class RunTimeException {
    static void recursive(){
        System.out.println(1);
        recursive();
    }
    public static void main(String[] args) {
        /* Handling the RunTimeException */
        String name = null;
        // Here we'll get the runtime exception
        // System.out.println(name.length());
        try{
            System.out.println(name.length());
        }catch(NullPointerException npe){
            System.out.println(npe);
        }
        // Simple Error of stack over flow 
        try{
            recursive();
        }catch (Error e){
            System.out.println(e);
        }
    }
}
