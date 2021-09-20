public class thread{
    public static void main(String[] args) {
        A ob1 = new A();
        A ob2 = new A();

        Thread t1 = new Thread(ob1);
        Thread t2 = new Thread(ob2);

        t1.start();
        t2.start();
    }
}
class A extends Thread{
    public void run(){
        for(int i=1;i<=3;i++){
            System.out.println(Thread.currentThread().getName());
            System.out.println(i);
            try{
                Thread.sleep(2000);
                
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
}