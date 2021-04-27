package Overriding;

class Employee {
    public String name = "Mahmud";
    public float salary = 50000;

    public void showDetails() {
        System.out.println(name + " " + salary);

    }
}

class Manager extends Employee {
    public String department = "Engineering";

    public void showDetails() {
        super.showDetails();
        System.out.println(" " + department);
    }
}

public class InvokeOverriding {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.showDetails();

    }
}
