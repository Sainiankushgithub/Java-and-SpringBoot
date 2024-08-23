package Java_Course;

public class string2 {
    public static void main(String[] args) {
        String name="Ankush saini";
        String email="ankush@gmail.com";
        String pass="anku@123";
        if(name.isEmpty()==true)
        {
            System.out.println("String is Empty()");
        }
        else
        {
            System.out.println("String is not Empty()");
        }
        System.out.println("Length of your name : "+name.length());

        System.out.println("Without spacing between the word ");
        String Modified=name.replaceAll("\\s+", "");
        System.out.println("Length : "+Modified.length());
//        Comparing the two string
        String s1="a";
        String s2="A";
        System.out.println(s1.compareTo(s2));
    }
}

