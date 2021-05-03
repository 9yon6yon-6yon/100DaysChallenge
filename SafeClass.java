public class SafeClass {
    public static double sqrt(double number) throws Exception {
        if (number < 0)
            throw new Exception("Negative number");
        else
            return Math.sqrt(number);
    }

    public static void main(String[] args) throws Exception {//adding throws Exception to remove error
        System.out.println(sqrt(3));//Unhandled exception type Exception

    }

}
