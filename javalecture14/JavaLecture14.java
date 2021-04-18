package javalecture14;

public class JavaLecture14 {

    public void a() {
        System.out.println("Return value from b(): " + b());// calling b method in print

    }

    public int b() {

        int x = c();// calling c method
        return x;
    }

    public int c() {
        int x = 10 / 0;
        return x;//returning value of x

    }

    public static void main(String[] args) {
        JavaLecture14 obj1 = new JavaLecture14();//creating object 
        obj1.a();//calling a method 
    }

}