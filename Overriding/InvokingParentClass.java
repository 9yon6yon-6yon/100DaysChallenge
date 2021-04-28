package Overriding; 
class Employee1 {
    public String name;
    public float salary;

    public Employee1(String name, float salary) {
        this.name = name;
        this.salary = salary;
    }

    public void showDetails() {
        System.out.println("Name: " + name + " Salary: " + salary);
    }
}

class Manager1 extends Employee1 {
    public String department;

    public Manager1(String department){
        super("Mahmud",50000F);
        this.department=department;
    }

    public void showDetails() {
        super.showDetails();
        System.out.println("Department: " + department);
    }
}
public class InvokingParentClass{
    public static void main(String[] args) {
        Manager1 m = new Manager1("Engineering");
        m.showDetails();
    }

}
