package OOPLab.OOPLabA.OOPLab5;

// class ClassA {
//     private int var1;

//     void setVar(int var1) {
//         this.var1 = var1;

//     }

//     int getVar1() {
//         return var1;
//     }

//     void func1() {
//         System.out.println(var1);
//     }
// }

// class ClassB extends ClassA { 
//     int var2;
//     void func2() {
//         System.out.println(getVar1());
//         System.out.println(var2);
//     }
// }

// public class Inheritance {
//     public static void main(String[] args) {
//         ClassB objB = new ClassB();
//         objB.var2 = 20;
//         objB.setVar(10);
//         objB.func1();
//         objB.func2();

//     }

// }

class ClassA {
    int var1;

    void func1() {
        System.out.println(var1);
    }
}

class ClassB extends ClassA {
    int var1;
    int var2;

    void func2() {
        func1(); // same as: super.func1();
        //but if there is a fun1() in classB then super is necessary to call the ClassA func1()
        System.out.println(this.var1);//var1 in class B
        System.out.println(super.var1);//var1 in classA
        System.out.println(var2);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        ClassB objB = new ClassB();
        objB.var2 = 20;
        objB.func1();
        objB.func2();

    }

}
