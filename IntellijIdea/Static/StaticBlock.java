class Test{
    static {
        System.out.println("I am static that executes automatically when Test class loaded in a memory and I don't need an object");
    }
}
public class StaticBlock {
    public static void main(String[] args) {
        Test t = new Test();
        System.out.println("I am main method");
    }
}
