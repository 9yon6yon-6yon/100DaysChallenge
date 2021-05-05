import java.io.*;



public class ReadFile {
    public static void main(String[] args) {
        File file = new File("/home/thebird/Desktop/100DaysChallenge", "NewFile.txt");
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader in = new BufferedReader(new FileReader(file));
            String str = in.readLine();
            while (str != null) {
                System.out.println("\nRead: " + str);
                str = in.readLine();
            }
            in.close();
        } catch (FileNotFoundException e1) {
            System.out.println();

        } catch (IOException e2) {
            System.out.println("Input/ output problem");

        }

    }

}
