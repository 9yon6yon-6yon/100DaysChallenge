package Constructor;

public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate() {
        day = 1;
        month = 6;
        year = 1999;
    }

    public void showDate() {
        System.out.println("Day: " + day);
        System.out.println("Month: " + month);
        System.out.println("Year: " + year);

    }

   public static void main (String[] args) {
        MyDate date = new MyDate();
        date.showDate();
    }

}
