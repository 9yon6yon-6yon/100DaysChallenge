package OOPLab.OOPLabA.LabCLassTest;

class Book {
    private String title;
    private String aurthor;
    private double price;
    private String publication;

    public String title() {
        return title;

    }

    public String aurthor() {
        return aurthor;

    }

    public double price() {
        return price;

    }

    public String publication() {
        return publication;

    }

    Book(String title, String aurthor, double price, String publication) {

        this.title = title;
        this.aurthor = aurthor;
        this.price = price;
        this.publication = publication;

    }

}

class StroyBook extends Book {
    StroyBook(String title, String aurthor, double price, String publication) {
        super(title, aurthor, price, publication);
       
    }

    String genre = "Horror";

    double getPrice() {
        return 0.15 * price();

    }

    public void printinfo() {
        System.out.println("Title : " + title());
        System.out.println("Aurthor : " + aurthor());
        System.out.println("Actual Price: " + price());
        System.out.println("Publication : " + publication());
        System.out.println("Genre : " + genre);

    }

}

class AcademicBook extends Book {
    AcademicBook(String title, String aurthor, double price, String publication) {
        super(title, aurthor, price, publication);
       
    }

    int edition = 5;

    double getPrice() {
        if (edition <= 3) {
            return price() - 100;
        } else
            return price() - 50;

    }

    public void printinfo() {
        System.out.println("Title : " + title());
        System.out.println("Aurthor : " + aurthor());
        System.out.println("Actual Price: " + price());
        System.out.println("Publication : " + publication());
        System.out.println("Edition : " + edition);
    }

}

public class Mains {
    public static void main(String[] args) {
        // Book B = new Book("title", "Aurthor", 500.00, "Loura");

        StroyBook s = new StroyBook("title", "Aurthor", 500.00, "Loura");
        s.printinfo();
        System.out.println("\n");
        AcademicBook a = new AcademicBook("title", "Aurthor", 500.00, "Loura");
        a.printinfo();
    }
}