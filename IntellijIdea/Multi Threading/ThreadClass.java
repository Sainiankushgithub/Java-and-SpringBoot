public class ThreadClass extends Thread {
    public void run(){
        System.out.println("Threading is executing . . . ");
    }
    public static void main(String[] args) {
        ThreadClass tc = new ThreadClass();
        System.out.println("Hey ! This is a Thread class ");
         tc.start();
        // tc.start(); // Runtime exception

    }
}
