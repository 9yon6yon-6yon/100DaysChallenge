public class Shape {

    private float  length;
    private float  breadth;

    public Shape(float  length) {
        this.length = length;
    }

    public Shape(float  length, float  breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public float  Calculate_Area() {
        if (breadth != 0)
            return length * breadth;
        else
            return length * length;

    }

    public float  Calculate_Perimeter() {
        if (breadth != 0)
            return (2 * length) + (2 * breadth);
        else
            return 4 * length;

    }

    public static void main(String[] args) {
        float  length = (202902017 % 20 + 5);
        float  breadth = (202902017 % 10 + 3);

        Shape Rectangle = new Shape(length, breadth);
        Shape Square = new Shape(length);

        System.out.println(Rectangle.Calculate_Area());
        System.out.println(Rectangle.Calculate_Perimeter());
        
        System.out.println(Square.Calculate_Area());
        System.out.println(Square.Calculate_Perimeter());
        

    }

}