package Java_Course;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
class ReadAndWrite
{
    void ReadFile() throws FileNotFoundException
    {
        FileInputStream fis=new FileInputStream("Window c:/abc.txt");
    }
    void WriteFile() throws FileNotFoundException
    {
        FileOutputStream fos=new FileOutputStream("C:/Java Programming/Java_Course/Throws2.java");
    }
}
public class Throws1 {
    public static void main(String[] args) {
        ReadAndWrite rw=new ReadAndWrite();
        try
        {
            rw.ReadFile();
        }
        catch(FileNotFoundException fe)
        {
            System.out.println("File not found exception ");
        }
        try
        {
            rw.WriteFile();
        }
        catch(FileNotFoundException fe)
        {
            fe.printStackTrace();
        }
        System.out.println("Successfully Executed ");
    }
}
