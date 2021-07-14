
/*Write a Java program that will show the following
output (You have to take an integer as the row number
from the user):
Enter the number of rows: 4
A B C D
A B C
A B
A*/
import java.util.Scanner;

public class ABCD {
    public static void main(String[] args) {

        int i, j;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int n = sc.nextInt();
        char[] arr = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S',
                'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
        for (i = 0; i <= n; i++) {
            for (j = 0; j < i; j++) {
                System.out.print(arr[j]);
            }
            System.out.println(" ");

        }
        System.out.println("As asked in the question");
        for (i = n; i >= 0; i--) {
            for (j = 0; j < i; j++) {
                System.out.print(arr[j]);

            }
            System.out.println(" ");

        }
    }
}