public class Array {
    public static void main(String[] args) {
        int[] arr1 = new int[10];
        float[] arr2 = new float[10];
        //printing integer number
        for (int i = 0; i < 10; i++) {
            arr1[i] = 1 + i;

            System.out.println(arr1[i]);//by using println no need to add new line ,it's by default
        }
        System.out.println("\n");
        //printing floating point number
        for (int j = 0; j < 10; j++) {
            arr2[j] = 1 + j;
            System.out.print(arr2[j]+" ");//print uses no new line by default
        }
        System.out.println("\n");
        //array
    }

}