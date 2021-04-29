public class Overloading {
    int a, b, c;

    public Overloading() {
        a = 2;
        b = 4;
        c = 6;

    }

    public Overloading(int a) {
        this.a = a;
        b = 4;
        c = 6;
    }

    public Overloading(int a, int b) {
        this.a = a;
        this.b = b;
        c = 6;

    }

    public Overloading(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }
}