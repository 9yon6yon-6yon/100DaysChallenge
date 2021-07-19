public class shortarray {
    public static void main(String[] args) {
        int array[] = { 2, 13, 5, 8, 13, 51, 35, 19, 15, 30, 14 };
        int i, j, temp;

        for (i = 0; i < array.length; i++) {
            for (j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {

                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;

                }
            }

        }
        System.out.print("Shorted array : ");
        for (i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}