import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int[] arr1 = { 5, 6, 1, 2, 9, 9, 10 };// int [] arr1 = new int[5];
        // arr1[0] = sc.nextInt();

        // for (int i = 0; i < arr1.length; i++) {
        // System.out.println(arr1[i]);

        // }
        // // enhanced for loop or foreach loop

        // for (int val : arr1) {
        // System.out.println(val);
        // }
        Scanner sc = new Scanner(System.in);
        int[] arr2 = new int[6];
        System.out.println("Enter the array values");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        int max = arr2[0];//declaring the first value of array as  max value
        int min = arr2[0];//declaring the first value of array as  min value
        int sum = 0;
        for (int val : arr2) {//enhanced for loop
            sum += val;// sum = sum + val
            if (max < val) { //if max value is less than val value then 
                max = val;//max value is the val value
            }
            if (min > val) {//if min value is greater than val value then
                min = val;//min value is the val value
            }

        }
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
        System.out.println("Sum is: " + sum);

    }

}
