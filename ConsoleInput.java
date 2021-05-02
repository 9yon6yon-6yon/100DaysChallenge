import java.io.*;

public class ConsoleInput {
    public static void main(String[] args) {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(isr);
        try {
            System.out.println("Please Enter Something");
            String s = in.readLine();
            in.close();
            System.out.println(s);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
