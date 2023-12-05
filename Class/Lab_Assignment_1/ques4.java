package Class.Lab_Assignment_1;

import java.util.Scanner;

class Palindrome
{
    int num;
    Palindrome(int num)
    {
        this.num=num;
    }
    boolean check(int num)
    {
        int temp=num;
        int sum=0;
        while(num!=0)
        {
            int r=num%10;
            sum=sum*10+r;
            num=num/10;
        }
        if(sum==temp)
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number to check whether entered number number is palindrome ");
        num=sc.nextInt();
        Palindrome p= new Palindrome(num);
        if(p.check(num)==true)
        {
            System.out.println("Entered number "+num+" is palindrome");
        }
        else
        {
            System.out.println("Entered number "+num+" is not palindrome");
        }
        sc.close();
    }
}
