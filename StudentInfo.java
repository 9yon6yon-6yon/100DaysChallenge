abstract class BankAccount {
    public String id;
    public double balance;

    public BankAccount(String id) {
        this.id = id;
    }

    public abstract double calcutaleInterest();
}

interface Taxable {

    void taxCharge(double amount);
}

class StudentAccount extends BankAccount implements Taxable {

    public StudentAccount(String id) {
        super(id);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void taxCharge(double amount) {
        // TODO Auto-generated method stub

    }

    @Override
    public double calcutaleInterest() {
        // TODO Auto-generated method stub
        return 0;
    }

}
