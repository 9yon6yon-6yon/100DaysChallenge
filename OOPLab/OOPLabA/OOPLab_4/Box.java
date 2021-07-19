package OOPLab.OOPLabA.OOPLab_4;

public class Box {
    double height;
    double width;
    double density;

    Box(double a, double b, double c) {
        this.height = a;
        this.width = b;
        this.density = c;
        System.out.println(a + " " + b + " " + c);
    }

    Box() {

    }

    double getArea() {
        return height * width;
    }

    void printAll() {
        System.out.println("Height is : " + height);
        System.out.println("width is : " + width);
        System.out.println("Density is : " + density);

    }

    public static void main(String[] args) {
        Box b1 = new Box(10.5, 20, 50);
        b1.printAll();
       
        double area1 = b1.getArea();
        System.out.println(area1);

        Box b2 = new Box(20.5, 2, 5);
        b2.printAll();
       
        double area2 = b2.getArea();
        System.out.println(area2);

    }

}
