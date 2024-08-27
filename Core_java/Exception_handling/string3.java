package Java_Course;

public class string3 {
    public static void main(String[] args) {
        String s1=new String("Ankush");
        String s2= new String("Java");
        s1.concat(s2);
//        After concatinatioin it will display the Ankush only there object are immutable in the Heap
        System.out.println(s1);

//        System.out.println(s1.concat(s2));     // Output : AnkushJava

        String s3="Ankush";
        String s4=" Saini";
//        s3.concat(s4);
//        System.out.println(s3);
        System.out.println(s3.concat(s4));

        System.out.println(s3+10);  // Ankush10
        System.out.println(s3+10+20); // Ankush1020
        System.out.println(s3+20/2);  // Ankush10
        System.out.println(10+s3+20);  // 10Ankkush20
        System.out.println(10+20+s3);  // 30Ankush
        System.out.println(String.join(",",s1,s2,s3,s4));
        System.out.println("SubSequences : "+s1.subSequence(3,6)); // ush
        System.out.println("SubString : "+s1.substring(3));    // ush
        System.out.println("Sub String : "+s1.substring(3,6));          // ush

        System.out.println(s1.replace('n','N'));
        String s5="Ankush saini";
        System.out.println(s5.replace('i','I'));
        System.out.println(s5.replaceFirst("s","S"));
        String s6="    It's me Ankush saini    ";
        System.out.println(s6);
        System.out.println(s6.trim());
        System.out.println(s6.replaceAll(" ",""));
        System.out.println(s6.replaceAll("It's\\s+me","It'sme"));

//        SEARCH CHARACTER IN STRING
        String s7="Ankush saini is a Ankush saini";
        System.out.println(s7);
        System.out.println(s7.indexOf("saini"));
        System.out.println(s7.lastIndexOf("saini"));
        System.out.println(s7.contains(" sainib")); // false
        System.out.println(s7.contains("saini"));  // true

        System.out.println(s7.startsWith("s"));
        System.out.println(s7.endsWith("k"));

//        TYPE CONVERSION
//        1. VALUE OF()
//        2.toCharArray()
        System.out.println("..........................");
        String s8="Ankush";
        int a=10,b=20;
        String s=String.valueOf(a);
        String S=String.valueOf(b);
        System.out.println(" a and b = "+ s+S);
        char []c=s8.toCharArray();
        System.out.println(c);
        System.out.println(s);


    }
}

