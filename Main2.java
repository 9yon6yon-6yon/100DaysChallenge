class Base2 {
    public void show() {//removing final modifier
        System.out.println("Base ::show() called");

    }
}

class Derived2 extends Base2 {
    public void show() {//Cannot override the final method from Base2
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
