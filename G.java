class P {
    public int x;
}

class G {
    private P p;

    public G(P q) {
        p = q;
    }

    P getP() {
        return p;
    }

    int getX() {
        return p.x;
    }

    public static void main(String[] args) {
        P p = new P();
        G g = new G(p);
        P q = g.getP();
        q.x = 10;
        p.x = 15;
        System.out.println(q.x);
        q.x = 10;
        System.out.println(p.x);
        p.x = 15;
        System.out.println(g.getX());
    }
}