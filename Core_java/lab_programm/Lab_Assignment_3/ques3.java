package Class.Lab_Assignment_3;
import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    double cgpa;

    public Student(int rollNo, String name, double cgpa) {
        this.rollNo = rollNo;
        this.name = name;
        this.cgpa = cgpa;
    }
}

public class ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        Student[] s = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for student " +(i + 1)+ " : ");
            System.out.print("Roll No: ");
            int rollNo = sc.nextInt();
            sc.nextLine(); 
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("CGPA: ");
            double cgpa = sc.nextDouble();

            s[i] = new Student(rollNo, name, cgpa);
        }
        double lcgp = s[0].cgpa;
        String lcgps = s[0].name;
        for (int i = 1; i < n; i++) {
            if (s[i].cgpa < lcgp) {
                lcgp = s[i].cgpa;
                lcgps = s[i].name;
            }
        }
        System.out.println("\nStudent Details:");
        for (int i = 0; i < n; i++) {
            System.out.println("Roll No: " + s[i].rollNo);
            System.out.println("Name: " + s[i].name);
            System.out.println("CGPA: " + s[i].cgpa);
            System.out.println();
        }
        System.out.println("Student with the lowest CGPA: " + lcgps);

        sc.close();
    }
}
