public class PrintTest {
    public static void main(String[] args) {
        int a1 = 20;
        int a2 = 30;
        long l1 = 999999999999999999L;

        float f1 = 3.45F;
        double d1 = 4.5;

        boolean b1 = true;
        char c1 = 'A';
        String s1 = "abcde";

        System.out.println("Value of a1: " + a1);
        System.out.println(a1 + " " + a2 + " ");// 20 30
        System.out.println(" " + a1 + a2);// 2030
        System.out.println(" " + (a1 + a2));// 50
        System.out.println("Value of l1: " + l1);
        System.out.println("Value of f1: " + f1);
        System.out.println("Value of d1: " + d1);
        System.out.println("Value of b1: " + b1);
        System.out.println("Value of c1: " + c1);
        System.out.println("Value of s1: " + s1);

    }

}
