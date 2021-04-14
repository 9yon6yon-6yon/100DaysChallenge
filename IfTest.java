public class IfTest {
    public static void main(String[] args) {

        int x = (int) (Math.random() * 100);
        System.out.println(x);
        if (x > 100)
            System.out.println("x > 100");
        else
            System.out.println("x < 100 ");
    }

}
