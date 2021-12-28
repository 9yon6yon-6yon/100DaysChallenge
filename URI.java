import java.io.IOException;
import java.util.Scanner;

public class URI {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            int n = sc.nextInt();
            if (n == 0)
                flag = false;

            for (int i = 1; i <= n; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print(i);
                }
                System.out.println();

            }

        }

    }

}
