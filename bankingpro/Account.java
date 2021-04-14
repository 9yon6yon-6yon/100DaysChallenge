package bankingpro;

public class Account {
    
    public String accountName= "Savings Account";

    public void showAccName(){
        System.out.println(accountName);
    }
    public static void main(String[] args){
        Account acc = new Account();
        acc.showAccName();
    }
}
