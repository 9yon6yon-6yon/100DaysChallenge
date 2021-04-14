public class Casting {
    public static void main(String[] args) {

        long bigValue = 99l;
        int smallValue = (int) bigValue;// casting
        System.out.println(smallValue);
        smallValue = 50;
        bigValue = smallValue;// auto casting
        System.out.println(bigValue);
    }

}
