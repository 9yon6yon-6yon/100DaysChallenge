public class HelloWorld {
    public static void main(String[] args){
        System.out.println("Hello World !");

        //print 1 to 100
        int a = 40;
        System.out.println(a);
        //print numbers fro 1 to 100
        for(int i=1;i<=100;i++){
            System.out.println(i);
        }
        //print the numbers ending with 3 and 7 between 1 to 500
        for(int i=1;i<=500;i++){
            if(i%10 == 3 || i%10 == 7){
                System.out.println(i);
            }

        }

    }
}
