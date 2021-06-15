package PreviousFinal;

public class abcc {
    public static void main(String[] args) {
        A ref = new A() {
            public void msg1() {
                System.out.println("In msg1: anonymous class");
            }
        };
        ref.msg1();
        // ref.msg2();
    }

}
