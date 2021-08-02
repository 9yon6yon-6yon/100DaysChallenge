import java.util.Scanner;
class sem1 {
    float GPA_S1() {
        System.out.println("Enter GPA1: ");

        Scanner gpa = new Scanner(System.in);
        float gpa_1 = gpa.nextFloat();
        return gpa_1;

    }
}

class sem2 extends sem1 {
    float GPA_S2() {
        System.out.println("Enter GPA2: ");

        Scanner gpa = new Scanner(System.in);
        float gpa_2 = gpa.nextFloat();
        return gpa_2;
    }
}

class sem3 extends sem2 {
    float GPA_S3() {
        System.out.println("Enter GPA3: ");
        
        Scanner gpa = new Scanner(System.in);
        float gpa_3 = gpa.nextFloat();
        return gpa_3;

    }
}
class GPA {
    void SGPA() {
        sem3 g = new sem3();
        float avg_gpa = (g.GPA_S1() + g.GPA_S2() + g.GPA_S3()) / 3;
        System.out.println("SGPA is : " + avg_gpa);

    }
}
public class SGPA {
    public static void main(String[] args) {
        GPA id = new GPA();
        id.SGPA();

    }

}