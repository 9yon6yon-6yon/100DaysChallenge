import java.io.IOException;
import java.util.Scanner;

public class URI {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i, j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= 2; j++) {
                if (j == 1) {
                    System.out.println(i + " " + (i * i) + " " + (i * i * i));
                } else {
                    System.out.println(i + " " + ((i * i) + 1) + " " + ((i * i * i) + 1));
                }break;
            }
        }

    }

}
