import java.util.Scanner;
public class ReadConsole{
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter_your_full_name:");//error//""
        String name = Scanner.nextLine();//error//Scanner and nextLine
        System.out.println("Enter your Zodiac Sign: ");
        String zodiac= Scanner.next();//error//Scanner
        System.out.println("Enter your weight(kg): ");
        double weight = Scanner.nextDouble();//error//Scanner
        System.out.println("Enter your lucky number: ");
        int LuckyNum = Scanner.nextInt();//error//Scanner
        System.out.println("Hello, "+name+".");//error//+name+
        System.out.println("Your lucky number is "+LuckyNum+".");
        System.out.println("your weight "+weight+"kg");
        System.out.println("Your Zodiac sign is "+zodiac+".");

        
    }
}