package javalecture13;//package must be declared as the folder name in which the java ile will call the package

public class Javalecture13 {
    public int[] arr = new int[5];

    public void setArr() {// void doesn't return any values

        for (int i = 0; i < arr.length; i++) {
            try {// trying to catch the error and print it to catch statement
                if (i == 2)
                    arr[i] = i + 10 / 0;
                // arr[i] = i + Integer.parseInt("10");
                // arr[i] = i + 10;
                else if (i == 3)

                    // arr[i] = i + "TEN";//getting an error because int value can't be calculated
                    // with char value
                    arr[i] = i + Integer.parseInt("TEN");// this will be a runtime error means
                // uncheck
                else
                    arr[i] = i + 10;
            } catch (ArithmeticException e1) {
                System.out.println(e1);
                arr[i] = 100;// changing the value if there is arithmetic exception

            } catch (NumberFormatException e2) {
                System.out.println(e2);
                arr[i] = 200;// changing the value fi there is number format exception

            }

            catch (Exception e3) {//can work for all check and uncheck exception
                // catch (NumberFormatException abc) {//same output as exception command in the
                // line before this line

                System.out.println(e3);
            }

        }
        for (int xyz : arr)// for loopto print array values
            System.out.print(xyz + "\t");// printing array values

    }

    public int sum() {// int to return values
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            sum = sum + arr[i];
        return sum;

    }

    public static void main(String[] args) {// main method //without main method the file won't run

        Javalecture13 romeo = new Javalecture13();
        romeo.setArr();
        System.out.println(" Total sum = " + romeo.sum());

    }
}
