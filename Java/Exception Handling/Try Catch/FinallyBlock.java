import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FinallyBlock {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(
                    "C:/GitHub/Java & SpringBoot/IntellijIdea/Exception Handling/test.txt"
            );
        } catch (FileNotFoundException fnfe) {
            System.out.println(fnfe.toString());
        } finally {
            System.out.println("Finally block execution...");
            if (fis != null) {
                try {
                    fis.close();
                    System.out.println("File Closed.");
                } catch (IOException e) {
                    System.out.println(e.toString());
                }
            }
        }
    }
}
