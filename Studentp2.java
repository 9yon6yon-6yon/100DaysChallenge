import java.io.*;
import java.util.Scanner;

class Student {
    public int id;
    public String name;
    private double physicsMarks;
    private double chemistryMarks;
    private double mathMarks;

    public Student(int id, String name, double physicsMarks, double chemistryMarks, double mathMarks) {
        this.id = id;
        this.name = name;
        this.physicsMarks = physicsMarks;
        this.chemistryMarks = chemistryMarks;
        this.mathMarks = mathMarks;
    }

    public double getPhysicsMarks() {
        return physicsMarks;
    }

    public void setPhysics(double physicsMarks) {
        this.physicsMarks = physicsMarks;
    }

    public double getChemistry() {
        return chemistryMarks;
    }

    public void setChemistry(double chemistryMarks) {
        this.chemistryMarks = chemistryMarks;
    }

    public double getMath() {
        return mathMarks;
    }

    public void setMath(double mathMarks) {
        this.mathMarks = mathMarks;
    }
}

public class Studentp2 {
    public static void main(String[] args) throws IOException {
        int nStudent = 0;

        int id;
        String name;
        double physicsMarks;
        double chemistryMarks;
        double mathMarks;
        Student[] student = new Student[0];
        try {
            File Object = new File("input1.txt");
            Scanner Reader = new Scanner(Object);

            if (Reader.hasNextLine()) {
                nStudent = Reader.nextInt();
                String data = Reader.nextLine();
            }
            student = new Student[nStudent];

            for (int i = 0; Reader.hasNextLine(); i++) {
                if (nStudent <= i) {
                    break;
                }
                String data = Reader.nextLine();

                String[] in = data.split(" ");
                id = Integer.parseInt(in[0]);
                name = in[1];
                physicsMarks = Integer.parseInt(in[2]);
                chemistryMarks = Integer.parseInt(in[3]);
                mathMarks = Integer.parseInt(in[4]);

                student[i] = new Student(id, name, physicsMarks, chemistryMarks, mathMarks);
            }
            Reader.close();

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        Writer Out;
        Out = new BufferedWriter(new FileWriter("output1.txt"));
        for (int i = 0; i < nStudent; i++) {
            id = student[i].id;
            name = student[i].name;
            physicsMarks = student[i].getPhysicsMarks();
            chemistryMarks = student[i].getChemistry();
            mathMarks = student[i].getMath();
            int totalMark = (int) (physicsMarks + chemistryMarks + mathMarks);
            String str = "StudentName: " + name + " ID: " + id + " Total_marks: " + totalMark + "\n";
            Out.append(str);
        }
        Out.close();
    }

}