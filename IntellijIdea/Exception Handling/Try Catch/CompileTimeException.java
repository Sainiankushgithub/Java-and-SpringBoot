import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CompileTimeException {
    public static void main(String[] args) {
        // Compile Time Exception :
        // FileInputStream fis = new FileInputStream("C:/GitHub/Java & SpringBoot/IntellijIdea/Exception Handling/abc.txt");
        /*  Handling the compile time exception using try catch */
        try{
            FileInputStream fis = new FileInputStream("C:/GitHub/Java & SpringBoot/IntellijIdea/Exception Handling/abc.txt");
            System.out.println("File found yeah ! ");
        }catch(FileNotFoundException fne){
            System.out.println("File Not Found ! "+fne);
        }
    }
}
