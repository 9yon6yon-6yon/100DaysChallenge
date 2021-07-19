package OOPLab.OOPLabA.OOPLab_4;

public class Rectangle {
    // instance variables
    double height;
    double width;

    // non parameterized constructur
    Rectangle() {

    }

    // constructor with parameter
    Rectangle(double height, double width) {
        this.height = height;
        this.width = width;// in java this is a ref

    }

    double getArea() {
        return height * width;
    }

    void printAll() {
        System.out.println("Height is : " + height);
        System.out.println("width is : " + width);

    }

    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle(10.5, 4);
        rec1.printAll();

        double area1 = rec1.getArea();
        System.out.println(area1);
        Rectangle rec2 = new Rectangle(5, 10);
        rec2.printAll();

        double area2 = rec2.getArea();
        System.out.println(area2);

        Rectangle[] rectangles = new Rectangle[3];

        rectangles[0] = new Rectangle(4, 5);
        rectangles[1] = new Rectangle(1, 4);
        rectangles[2] = new Rectangle(5, 6);
        for (Rectangle rec : rectangles) {
            System.out.println(rec.getArea());
        }

        // Rectangle rec3 = rec1;
        // rec3.height = 30;
        // System.out.println(rec3.height);

        // System.out.println(rec2.height);
        // rec3 = rec2;
        // rec3.height = 200;
        // System.out.println(rec2.height);
        // rec1.height = 20;
        // rec1.width = 30;

    }

}
