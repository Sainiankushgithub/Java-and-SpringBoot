public class CompileTimePolymorphism {
    // Method Overloading
    int add(int a, int b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println("This is working fine here  . . . . .");
        CompileTimePolymorphism c = new CompileTimePolymorphism();
        System.out.println("Sum of two numbers: " + c.add(5, 10));
        System.out.println("Sum of three numbers: " + c.add(5, 10, 15));
    }
}
