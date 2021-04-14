public class SwitchCase {

    public void mySwitch(int x){
        switch(x){
            case 1: System.out.println("Case 1 : Value of x is = "+x);
            break;
            case 2: System.out.println("Case 2 : Value of x is = "+x);
            break;
            case 3: System.out.println("Case 3 : Value of x is = "+x);

        }

    }
    public static void main(String[] args){
        SwitchCase st =new SwitchCase();
        st.mySwitch(2);
    }
}
