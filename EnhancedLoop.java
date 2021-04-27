public class EnhancedLoop {
    public static void main(String[] args) {
        int[] myArray = new int[5];
        int i;
        for (i = 0; i < 5; i++)
            myArray[i] = i + 11;
        // Enhanced for loop
        for (int element : myArray)
            System.out.println(element);

    }

}
