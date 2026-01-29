public class RunnableInterface implements Runnable {
    @Override
    public void run() {
        System.out.println("Threading is executing . . . . . ");
    }

    public static void main(String[] args) {
        RunnableInterface ri = new RunnableInterface();
        Thread th = new Thread(ri);
        th.start(); 
    }
}
