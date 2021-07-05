import java.io.*;
import java.util.Scanner;

class menu {
    public void show() {
        System.out.println("==== Menu ====");
        System.out.println("1. Book list");
        System.out.println("2. Search Book");
        System.out.println("3. Show Users");
        System.out.println("4. View issued books");
        System.out.println("5. Issue Books");
        System.out.println("6. Add user");
        System.out.println("7. Delete user");
        System.out.println("8. Add Book");
        System.out.println("9. Return Book");
        System.out.println("10.Admin Pannel");
        Option o = new Option();
        o.Option();

    }
}

class Option {
    public void Option() {
        try {
            Scanner op = new Scanner(System.in);
            while (true) {
                System.out.print("Enter Option : ");

                int choice = op.nextInt();
                if (choice == 1) {
                    System.out.println("Book list");
                    Option1();

                } else if (choice == 2) {
                    System.out.println("Search Book");
                    Option2();

                } else if (choice == 3) {
                    System.out.println("Show Users");
                    Option3();

                } else if (choice == 4) {
                    System.out.println("View issued books");
                    Option4();

                } else if (choice == 5) {
                    System.out.println("Issue Books");
                    Option5();

                } else if (choice == 6) {
                    System.out.println("Add user");
                    Option6();

                } else if (choice == 7) {
                    System.out.println("Delete user");
                    Option7();

                } else if (choice == 8) {
                    System.out.println("Add Book");
                    Option8();

                } else if (choice == 9) {
                    System.out.println("Return Book");
                    Option9();

                } else if (choice == 10) {
                    System.out.println("Admin Pannel");
                    Option10();

                } else {

                    System.out.println("Invalid Input");

                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void Option1() {
        System.out.println("Function 1");
    }

    public void Option2() {
    }

    public void Option3() {
    }

    public void Option4() {
    }

    public void Option5() {
    }

    public void Option6() {
    }

    public void Option7() {
    }

    public void Option8() {
    }

    public void Option9() {
    }

    public void Option10() {
    }

}

public class lib {

    public static void main(String[] args) {

        try {
            Scanner admin = new Scanner(System.in);
            int i = 3;
            while (i > 0) {
                System.out.println("Enter user");
                String main = admin.nextLine();
                System.out.println("Enter Password");
                String pass = admin.nextLine();
                if (main.equals("admin") && pass.equals("admin")) {
                    System.out.println("Login Successful : " + main);
                    System.out.println("Login Successful : " + pass);
                    break;

                } else {
                    i--;
                    System.out.println(i + " Attemts remaining");

                }
            }
            menu m = new menu();
            m.show();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
// Question 1. Consider, library management system. Based on the system,
// write ten functional requirements(Marks:5) [This requirement should not match
// with your friends)

// Question 2. Based on the requirements(Question no.1), write three objects,
// two states and four
// behaviors of each object and also declare a class name for each object.
// (Marks:5)

// Question 3. Based on your object design(from Question no. 2), write a
// complete code.
// In the code, you also have to implement two user inputs, two exception
// handlings, two arrays.
// (user inputs, exception handling, arrays must be written based on the system)
// (Marks:10)