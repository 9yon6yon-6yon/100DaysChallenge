import java.util.Scanner;

public class exam {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // double array[] = new double[5];
        // double sum = 0;
        // for (int i = 0; i < array.length; i++) {
        // array[i] = s.nextDouble();
        // sum += array[i];
        // }
        // System.out.print("Array values :");
        // for (int i = 2; i < array.length; i++) {
        // System.out.print(" " + array[i]);

        // }
        // double avg = sum / array.length;

        // System.out.println("\nSum of array :" + sum);
        // System.out.println("Avarage of array :" + avg);
        double array[] = new double[7];
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = s.nextDouble();

        }
        for (int i = 4; i < array.length; i++) {
           System.out.println(array[i]);

        }
        // for (int i = 0; i < array.length; i += 2) {
        //     System.out.println("Value at index " + i + " is : " + array[i]);
        // }
        double ending = array[array.length-1];
        double max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }

        }
        sum = ending + max;
        System.out.println("Sum of last element + largest element is: " + sum);
        System.out.println(array[array.length / 2]);

    }
}