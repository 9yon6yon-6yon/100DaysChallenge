package Assignment2;

import java.util.*;
import java.io.*;

public class file {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a file name:(e.g. input.txt) ");
        System.out.flush();
        String infilename = scanner.nextLine();
        File sourcefile = new File(infilename);
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Enter a file name:(e.g. output.txt) ");
        System.out.flush();
        String outfilename = scanner2.nextLine();
        File file2 = new File(outfilename);
        try {
            FileInputStream fis = new FileInputStream(sourcefile);
            BufferedReader in = new BufferedReader(new InputStreamReader(fis));
            FileWriter fw = new FileWriter(file2, true);
            BufferedWriter out = new BufferedWriter(fw);
            String str = null;
            while ((str = in.readLine()) != null) {
                out.write(str.concat("\n"));
                out.newLine();
            }
            in.close();
            out.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
/*
 * Take two filenames as input from the console and copy the contents of the
 * first file to the second file after adding an extra newline after every line
 * of the source file except for the last line as shown below:
 * Source                     Generated
 * this is the first line.  this is the first line.
 * this is 2nd 
 * this is 3rd              this is 2nd 
 * 
 * another line.            this is 3rd 
 * 
 * 
 * 
 *                          another line.
 */