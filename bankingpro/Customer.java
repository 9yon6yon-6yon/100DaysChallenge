package bankingpro;

import bankingpro.Account;//importing the Account class 
public class Customer {
    public String name = "9yon6yon-6yon";

    public static void main(String[] args) {
        Account acc = new Account();//creating object for acccount class
        acc.showAccName();//calling the showAccName  method from Account class
        Customer cous = new Customer();//creating object for Customer class
        System.out.println(cous.name);//printing the value that is in the customer class

    }

}
