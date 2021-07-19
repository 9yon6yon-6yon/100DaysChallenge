public class twoNum {
    public static void main(String[] args) {
        int a = 2, b = 3, c = 4;
        if (a % 2 == 0 && b % 2 == 0) {

            System.out.println(a + " " + b + " -> " + "both are even");

        } else
            System.out.println(a + " " + b + " -> " + "both are not even");

        if (a % 2 == 0 && c % 2 == 0) {
            System.out.println(a + " " + c + " -> " + "both are even");

        } else
            System.out.println(a + " " + c + " -> " + "both are not even");

    }

}
