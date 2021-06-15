package PreviousFinal;

interface A {
    void msg1();
}

public class B implements A {
    public void msg1() {
        System.out.println("In msg1: B");
    }

    public void msg2() {
        System.out.println("In msg2: B");
    }
}
