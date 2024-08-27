
//   MULTIDIMENSIONAL ARRAY IN JAVA 

package Java_By_CWH;
import java.util.*;
public class ques4 {
    static void display(int mat[][],int row,int column)
    {
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int row,column;
    System.out.println("Enter the number of rows ");
    row=sc.nextInt();
    System.out.println("Enter the number of columns ");
    column=sc.nextInt();
    int [][] mat;
    mat=new int[row][column];
    for(int i=0;i<row;i++)
    {
        System.out.println("Enter the elements of "+(i+1)+" row ");
        for(int j=0;j<column;j++)
        {
            mat[i][j]=sc.nextInt();
        }
    }
    System.out.println("Dispalying your matrix elements ");
    display(mat,row,column);
    sc.close();
    }
}
