package PreviousFinal;

import java.util.Scanner;

public class abbc {
    private String Id, name;

    abbc() {
        Scanner s = new Scanner(System.in);
        name = s.nextLine();
        Id = s.nextLine();
        Inner inner = new Inner();
        inner.display();
    }

    class Inner {
        public void display() {
            System.out.println("Id is " + Id + ", name is: " + name);
        }
    }

    public static void main(String[] args) {
        new abbc();
    }

}
