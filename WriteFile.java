import java.io.*;

public class WriteFile {
    public static void main(String[] args) {
        File file = new File("/home/thebird/Desktop/100DaysChallenge", "NewFile.txt");
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader in = new BufferedReader(isr);
            PrintWriter out = new PrintWriter(new FileWriter(file));
            System.out.println("Write somethig: ");
            String str = in.readLine();
            out.println(str);
            in.close();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();

        }

    }

}
