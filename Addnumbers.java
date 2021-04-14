public class Addnumbers {
    private int num1,num2,result;

    public Addnumbers(int num1,int num2){
        this.num1 =num1;
        this.num2 =num2;

    }
    public void add(){
        result = num1+num2;
        System.out.println("Result is = "+result);
    }
    public  static void main(String[] args) {
        Addnumbers addnum= new Addnumbers(10, 20);
        addnum.add();
        
    }
    
}
