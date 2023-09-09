package Class.Lab_Asssignment_3;
import java.util.Scanner;

class Rectangle {
    private double length;
    private double breadth;

    Rectangle()
    {
        
    }
    public void read() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        length = scanner.nextDouble();
        System.out.print("Enter the breadth of the rectangle: ");
        breadth = scanner.nextDouble();
        scanner.close();
    }

    
    public double calculateArea() {
        return length * breadth;
    }

    
    public double calculatePerimeter() {
        return 2 * (length + breadth);
    }

    
    public void display() {
        double area = calculateArea();
        double perimeter = calculatePerimeter();
        System.out.println("Area of the rectangle: " + area);
        System.out.println("Perimeter of the rectangle: " + perimeter);
    }
}

class Main {
    public static void main(String[] args) {
        
        Rectangle rectangle = new Rectangle();

      
        rectangle.read();

        
        rectangle.display();
    }
}
