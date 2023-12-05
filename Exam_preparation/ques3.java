package Exam_preparation;

class Test {
    void show() {
        System.out.println("1");
    }

    void show(int a) {
        System.out.println("a: " + a);
        System.out.println("2");
    }
}

class test2 extends Test {
    void show() {
        super.show(4);
        System.out.println("3");
    }
}

public class ques3 {
    public static void main(String[] args) {
        Test t = new Test();
        t.show(5); // Provide an integer argument
        test2 t2 = new test2();
        t2.show();
    }
}
