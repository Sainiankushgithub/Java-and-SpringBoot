package Exam_preparation;
class Test
{
    void show()
    {
        System.out.println("1");
    }
    void show(int a)
    {
        System.out.println("2");
    }
    void show(int a,String b)
    {
        System.out.println("3");
    }
}
class test2 extends Test{
    void show()
    {
        System.out.println("4");
    }
}
public class ques2 {
    public static void main(String[] args) {
        Test t=new Test();
        t.show(1,"Ankush");
        test2 t2=new test2();
        t2.show();
        t2.show(4,"Soumya");
    }
}
