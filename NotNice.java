class Nice {
    public int x;
}

class NotNice {
    // final Nice n;//this is an error
    Nice n;

    public NotNice() {
        n = new Nice();
    }

    public void callMe() {
        n.x = 13;
    }

    public void callMe(Nice n) {
        this.n = n;
    }

    public static void main(String args[]) {
        NotNice nn = new NotNice();
        Nice n = new Nice();
        nn.callMe();
        nn.callMe(n);
    }
}