interface calculate {
    void cal(int item);
}

class display implements calculate {
    int x;

    void cal(int item) {
        x = item * item;
    }
}

class interfaces {
    public static void main(String args[]) {
        display arr = new display();
        arr.x = 0;
        arr.cal(2);
        System.out.print(arr.x);

    }
}
