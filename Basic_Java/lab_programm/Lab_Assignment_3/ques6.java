package Class.Lab_Assignment_3;
import java.util.*;

class rect {
    int area;
    int length;
    int breadth;

    rect() {
        length = 0;
        breadth = 0;
        area = 0;
    }

    public rect(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
        area = length * breadth;
        System.out.println("Area of a rectangle is : " + area);
    }

    public void display() {
        System.out.println("Area of a rectangle is : " + area);
    }
}

class ques6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Default Constructor : ");
        rect r = new rect();
        r.display();
        System.out.println("Parameterized Constructor : ");
        int length, breadth;
        System.out.println("Enter the length of a rectangle : ");
        length = sc.nextInt();
        System.out.println("Enter the breadth of a rectangle : ");
        breadth = sc.nextInt();
        rect re = new rect(length, breadth);
        re.display();
        sc.close();
    }
}
