public class Color {
    int red;
    static boolean blue;
    String green;

    void Color() {
        red = 10;
        blue = true;
        green = "GREEN";
    }

    void printColor() {
        System.out.println("red: " + red + " " + "green: " + green + " " + "blue: " + blue);
    }// end of printColor

    public static void main(String[] args) {
        Color color = new Color();
        color.printColor();
    }// end of main
}// end of Color