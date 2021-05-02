import java.io.*;
import java.util.Scanner;

public class SCannerInput {
    public static void main(String[] args) {

        try {
            System.out.println("Please Enter Something");

            Scanner sc = new Scanner(System.in);
            String s = sc.next();

            System.out.println(s);
            int num = sc.nextInt();
            System.out.println(num);
            sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
