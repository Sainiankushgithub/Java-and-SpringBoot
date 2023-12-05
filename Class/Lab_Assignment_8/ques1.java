package Class.Lab_Assignment_8;

import java.io.*;
import java.util.*;

class Student {
    int rollNo;
    String name;
    String subject;
    int marks;

    public Student(int rollNo, String name, String subject, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.subject = subject;
        this.marks = marks;
    }

    public String toString() {
        return "Roll No: " + rollNo + ", Name: " + name + ", Subject: " + subject + ", Marks: " + marks;
    }
}

public class ques1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        // Accepting student details
        while (true) {
            System.out.print("Enter Roll No (0 to stop): ");
            int rollNo = scanner.nextInt();
            if (rollNo == 0) {
                break;
            }
            scanner.nextLine(); // Consume newline
            System.out.print("Enter Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter Subject: ");
            String subject = scanner.nextLine();
            System.out.print("Enter Marks: ");
            int marks = scanner.nextInt();

            students.add(new Student(rollNo, name, subject, marks));
        }

        // Writing student details to a file
        try (PrintWriter writer = new PrintWriter("studentDetails.txt")) {
            for (Student student : students) {
                writer.println(student.rollNo + "," + student.name + "," + student.subject + "," + student.marks);
            }
            System.out.println("Student details saved to file.");
        } catch (FileNotFoundException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }

        // Reading from file and displaying content
        System.out.println("\nReading student details from file:");
        try (Scanner fileScanner = new Scanner(new File("studentDetails.txt"))) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] data = line.split(",");
                int rollNo = Integer.parseInt(data[0]);
                String name = data[1];
                String subject = data[2];
                int marks = Integer.parseInt(data[3]);

                Student student = new Student(rollNo, name, subject, marks);
                System.out.println(student);
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        }
    }
}