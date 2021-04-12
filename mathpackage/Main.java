package mathpackage;

public class Main{
    public static void main(String[] args) {
       System.out.println("Maximum value of 1 and 10 is = "+Math.max(1, 10));
       System.out.println("Minimum Value of 1 and 10 is = " +Math.min(1, 10));
       System.out.println("Absoulute vale of -10 = "+Math.abs(-10));
       System.out.println("Squre route of 10 = "+Math.sqrt(10));
       int randomNum = (int)(Math.random() * 101); 
       System.out.println("A random number from 1 to 100 is = "+randomNum+"(Number changes every time you run this programm)");
    }
  }
  