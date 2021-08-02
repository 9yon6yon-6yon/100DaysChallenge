public class Book {
    private String BookName;
    private int ISBN;
    private String AurthorName;
    private String Publisher;
    private float Price;
    private float UpdatePrice;

    public String BookName() {
        return BookName;

    }

    public int ISBN() {
        return ISBN;

    }

    public String AurthorName() {
        return AurthorName;

    }

    public String Publisher() {
        return Publisher;

    }

    public float Price() {
        return Price;

    }

    public float UpdatePrice() {
        return UpdatePrice;

    }

    public void getBookISBN(String BookName, int ISBN) {
        this.BookName = BookName;
        this.ISBN = ISBN;

    }

    public void getAurthorPP(String AurthorName, String Publisher, float Price) {
        this.AurthorName = AurthorName;
        this.Publisher = Publisher;
        this.Price = Price;

        if (Price < 200)
            this.UpdatePrice = (float) (Price + Price * 0.05);
        if (Price >= 200)
            this.UpdatePrice = (float) (Price + Price * 0.03);
    }

    public static void main(String[] args) {
        Book[] book = new Book[10];
        for (int i = 0; i < book.length; i++)
            book[i] = new Book();
        book[0].getBookISBN("Bangla", 100);
        book[0].getAurthorPP("ganja ganja", "Govt", 100);
        book[1].getBookISBN("English", 101);
        book[1].getAurthorPP("ganja ganja", "Govt", 200);
        book[2].getBookISBN("Math", 102);
        book[2].getAurthorPP("ganja ganja", "Govt", 400);
        book[3].getBookISBN("Islam", 103);
        book[3].getAurthorPP("ganja ganja", "Govt", 100);
        book[4].getBookISBN("socity", 104);
        book[4].getAurthorPP("ganja ganja", "Govt", 300);
        book[5].getBookISBN("Science", 105);
        book[5].getAurthorPP("ganja ganja", "Govt", 700);
        book[6].getBookISBN("ICT", 106);
        book[6].getAurthorPP("ganja ganja", "Govt", 550);
        book[7].getBookISBN("Sports", 107);
        book[7].getAurthorPP("ganja ganja", "Govt", 100);
        book[8].getBookISBN("eng2", 108);
        book[8].getAurthorPP("ganja ganja", "Govt", 1000);
        book[9].getBookISBN("Bangla2", 109);
        book[9].getAurthorPP("ganja ganja", "Govt", 150);

        System.out.println("Book name\t\tISBN number\tAurthor name\t\tPublisher\tPrice\t\tUPdatePrice ");
        for (int i = 0; i < book.length; i++)
            book[i].displayTabular();

    }

    public void displayTabular() {
        System.out.println(BookName + "\t\t\t" + ISBN + "\t\t" + AurthorName + "\t\t" + Publisher + "\t\t" + Price
                + "\t\t" + UpdatePrice);
    }

}