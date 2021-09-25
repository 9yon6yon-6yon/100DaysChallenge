package Lab9;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
//java file writing
//PrintWriter
//BufferedWriter
public class FileWriting {
    public static void main(String[] args) {
        try{
            File file = new File("Files/A.txt");
            PrintWriter out = new PrintWriter(file);
            for(int i=0;i<10;i++)
            out.println("Hello world "+(i+1));
            out.close();//writer object needs to be closed.

        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
