package HospitalManagementSystem;

public class Main {
    public static void main(String[] args) {
        doctors d = new doctors();
        d.showDoctors_wlist("masud", 3);
        d.showDoctors_hlist("Asif", 4);
        treatment t = new treatment();
        t.show_treatment();
        employee e = new employee();
        e.showlist();
        Treatmenttypes tt = new Treatmenttypes();
        tt.showtreatment();

    }

}
