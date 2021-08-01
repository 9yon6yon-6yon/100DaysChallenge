class Box {
    private double width;
    private double height;
    private double depth;

    Box(double width, double height, double depth) {
        width = height = depth;
    }
}

public class BOx {

    private static int width;
    private static int height;
    private static int depth;

    public static void main(String[] args) {
        Box b = new Box(1, 2, 3);
        double vol = width * height * depth;
        System.out.println("Volume of the first Box:" + vol);
        Box b2 = new Box(7, 7, 7);
        double vol2 = width * height * depth;
        System.out.println("Volume of the second Box:" + vol);
    }
}