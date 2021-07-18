import java.util.Scanner;

public class exam {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double array[] = new double[5];
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = s.nextDouble();
            sum += array[i];
        }
        System.out.print("Array values :");
        for (int i = 2; i < array.length; i++) {
            System.out.print(" " + array[i]);

        }
        double avg = sum / array.length;

        System.out.println("\nSum of array :" + sum);
        System.out.println("Avarage of array :" + avg);

    }
}
