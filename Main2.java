class Base2 {
    final public void show() {
        System.out.println("Base ::show() called");

    }
}

class Derived2 extends Base2 {
    public void show() {
        System.out.println("Derived :: show() called");
    }
}

class Main2 {
    public static void main(String[] args) {
        Base2 b = new Base2();
        ;
        b.show();
    }

}
