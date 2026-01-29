import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

class ReadWriteFile{
    void readFile() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("c:/GitHub/abc.txt");
        // statements
    }
    void writeFile()throws FileNotFoundException{
        FileOutputStream fos = new FileOutputStream("c:/GitHub/abc.txt");
        // statements
    }

}
public class ThrowsException {
    public static void main(String[] args) {
        ReadWriteFile rw = new ReadWriteFile();
        try{
            rw.readFile();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        System.out.println("Hey ! buddy . . . .");
        try{
            rw.writeFile();
            System.out.println("Successfully Wrote.");
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
