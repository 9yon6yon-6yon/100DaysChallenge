public class ClassArray {
    public static void main(String[] args) {
        Bird[] arr = new Bird[3];
        int i;
        for(i=0;i<3;i++)
        arr[i] = new Bird();
        for(i=0;i<3;i++)
        arr[i].fly();
        
    }
}
class Bird{
    public void fly(){
        System.out.println("Bird Can Fly");
    }
}
class Some extends Bird{

}