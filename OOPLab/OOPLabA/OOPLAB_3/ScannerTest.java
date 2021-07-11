
import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// sc = refarence //new creates an object

        // int a1 = sc.nextInt();// sc.nextInt() method
        // System.out.println("Value of a1: " + a1);
        // // long l1 = sc.nextLong();
        // // System.out.println("Value of l1: " + l1);
        // // float f1 = sc.nextFloat();
        // // System.out.println("Value of f1: " + f1);
        // // double d1 = sc.nextDouble();
        // // System.out.println("Value of d1: " + d1);
        // // boolean b1 = sc.nextBoolean();
        // // System.out.println("Value of b1: " + b1);
        // // String s1 = sc.next();
        // // System.out.println("Value of s1: " + s1);
        // sc.nextLine();//discard the new line character
        // String s2 = sc.nextLine();
        // System.out.println("Value of s2: " + s2);

        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if (a > b && c < a) {
            System.out.println("The lagest: " + a);
            if (b >= c) {
                System.out.println("The 2nd lagest: " + b);
                System.out.println("The smallest: " + c);
            } else {
                System.out.println("The 2nd lagest: " + c);
                System.out.println("The smallest: " + b);
            }
        } else if (b > a && c < b) {
            System.out.println("The lagest: " + b);
            if (a >= c) {
                System.out.println("The 2nd lagest: " + a);
                System.out.println("The smallest: " + c);
            } else {
                System.out.println("The 2nd lagest: " + c);
                System.out.println("The smallest: " + a);
            }
        } else {
            System.out.println("The lagest: " + c);
            if (a >= b) {
                System.out.println("The 2nd lagest: " + a);
                System.out.println("The smallest: " + b);

            } else {
                System.out.println("The 2nd lagest: " + b);
                System.out.println("The smallest: " + a);
            }
        }
    }
}
