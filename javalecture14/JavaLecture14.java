package javalecture14;

public class JavaLecture14 {

    /*
     * public void a() { System.out.println("Return value from b(): " + b());//
     * calling b method in print
     * 
     * }
     * 
     * public int b() {
     * 
     * int x = c();// calling c method return x; }
     * 
     * public int c() { int x = 10 / 0; return x;//returning value of x
     * 
     * }
     * 
     * public static void main(String[] args) { JavaLecture14 obj1 = new
     * JavaLecture14();//creating object obj1.a();//calling a method }
     * 
     * }
     */

    public void sum() throws ArithmeticException {
        int x = 10;
        int y = 10 / 0;// This will through an exception
        int z = x + y;
        System.out.println("Sum = " + z);

    }

    public static void main(String[] args) throws Exception {
        JavaLecture14 abc = new JavaLecture14();
        try {
            abc.sum();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}