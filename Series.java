public class Series {
    public static void main(String[] args) {
        int i;
        for (i = 1; i <= 50; i++) {
            System.out.print(i);
            if (i % 3 == 0 && i % 5 == 0)
                System.out.print(" - divisiable by 3 and 5");
            else if (i % 3 == 0)
                System.out.print(" - divisiable by 3");
            else if (i % 5 == 0)
                System.out.print(" - divisiable by 5");
            System.out.println();
        }

    }
}
