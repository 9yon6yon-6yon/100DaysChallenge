public class Pyramid {
    public static void main(String[] args) {
        int n = 9;
        int i, j, k, p;
        for (i = 1; i <= n; i++) {//running loop for n times

            for (j = n - i; j >= 1; j--)
                System.out.print("  ");//(8,7,6,5,4,3,2,1) every time the space will be reduced by 1 value...first time 8 then 2nd time 7 like that

            for (k = 1; k <= i; k++)
                System.out.print(k + " ");//(printing the values..when i=1 prints 1,when i=2 prints 1 space 2, when i=3 prints 1 space 2 space 3)

            for (p = i - 1; p >= 1; p--)
                System.out.print(p + " ");// here when i =1 prints nothing ,when 2 prints 1 and it will print after the k values with space every time

            System.out.println();//prints new line after a line is done or 1 loop is completed
        }
    }
}
