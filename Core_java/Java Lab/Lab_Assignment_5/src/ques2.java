
interface Motor {
    int capacity = 5;

    void run();
    void consume();
}
class WashingMachine implements Motor {
    public void run() {
        System.out.println("Washing machine is running.");
    }
    public void consume() {
        System.out.println("Washing machine is consuming electricity.");
    }
    public void displayCapacity() {
        System.out.println("Capacity of the washing machine: " + capacity + " kg");
    }
}
public class ques2 {
    public static void main(String[] args) {
        WashingMachine myWashingMachine = new WashingMachine();
        myWashingMachine.run();
        myWashingMachine.consume();
        myWashingMachine.displayCapacity();
    }
}

