// package OOPS;

// import java.util.*;

// class Library {
//     private final int MAX_BOOK=100;
//     private String[] Available_Book;
//     private int N;

//     public Library(int n) {
//         this.N = n;
//         Available_Book = new String[MAX_BOOK];
//     }

//     public void AvailableBook() {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the names of the books available : ");
//         for (int i = 0; i < N; i++) {
//             Available_Book[i] = sc.nextLine();
//         }
//     }

//     public Boolean IssueBook(String name) {
//         for(int i=0;i<N;i++)
//         {
//             if(Available_Book[i].equals(name))
//             {
//                 return true;
//             }
//         }
//         return false;
//     }
//     public void AddBook(String name)
//     {
//         N++;
//         Available_Book[N-1]=name; 
//     }
//     public void display() {
//         for (int i = 0; i < N; i++) {
//             System.out.println(Available_Book[i]);
//         }
//     }
// }

// public class ques7 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int size, choice;
//         System.out.println("Enter the number of Available Books : ");
//         size = sc.nextInt();
//         Library l = new Library(size);
//         l.AvailableBook();
//         System.out.println("Enter 1 for show Available Books : ");
//         System.out.println("Enter 2 to issue the Book : ");
//         System.out.println("Enter 3 to add new book : ");
//         System.out.println("Enter 4 to return the book : ");
//         System.out.println("Enter 5 for exit : ");
//         do {
//             System.out.println("Enter your choice : ");
//             choice = sc.nextInt();
//             switch (choice) {
//                 case 1: {
//                     System.out.println("Available Books are : ");
//                     l.display();
//                     break;
//                 }
//                 case 2:
//                 {
//                     String name;
//                     l.display();
//                     System.out.println("Enter the Book name from given Above which you want to issue :");
//                     sc.nextLine();
//                     name=sc.nextLine();
//                     Boolean issue=l.IssueBook(name);
//                     if(issue==true)
//                     {
//                         System.out.println("Your Book issued : ");
//                     }
//                     else
//                     {
//                         System.out.println("You Entered wrong Book name : ");
//                     }
//                     break;
//                 }
//                 case 3:
//                 {
//                     String name;
//                     System.out.println("Enter the Book name you want to add : ");
//                     sc.nextLine();
//                     name=sc.nextLine();
//                     l.AddBook(name);
//                     System.out.println("Totals Books after Adding a new one : ");
//                     l.display();
//                     break;
//                 }
//                 case 4:
//                 {

//                 }
//             }

//         } while (choice != 5);
//         sc.close();
//     }
// }
