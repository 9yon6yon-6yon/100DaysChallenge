package Polymorphism;

class Man {
    public void fly() {
        System.out.println("Man can not fly");
    }
}

class SuperMan extends Man {
    public void fly() {
        System.out.println("Superman can fly");
    }
}

public class TestMan {
    public static void main(String[] args) {
        Man m = new SuperMan();// polymorphism
        m.fly();

    }

}
/*
 * Polymorphism is the technique of creating object of parent-class through the
 * constructor of child-class. Using polymorphism we can call or execute the
 * child-class overriding method by the parent-class object.
 */