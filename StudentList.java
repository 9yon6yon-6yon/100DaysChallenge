import java.io.*;
import java.util.*;

class Students {
    private int ID;
    private String Name;
    public int creditCompleted;
    private double cgpa;

    public Students(int ID, String Name, double cgpa, int creditCompleted) {
        this.ID = ID;
        this.Name = Name;
        this.cgpa = cgpa;
        this.creditCompleted = creditCompleted;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public int getcreditCompleted() {
        return creditCompleted;
    }

    public double getcgpa() {
        return cgpa;
    }
}

public class StudentList {
    public static void main(String[] args) throws IOException {
        int nStudent = 0;
        int ID;
        String Name;
        double cgpa;
        int creditCompleted;
        Students[] student = new Students[0];
        try {
            File Object = new File("info.txt");
            File Object2 = new File("result.txt");
            Scanner Reader = new Scanner(Object);
            Scanner Reader2 = new Scanner(Object2);

            if (Reader.hasNextLine() || Reader2.hasNextLine()) {
                nStudent = Reader.nextInt();
                String data = Reader.nextLine();
            }
            student = new Students[nStudent];

            for (int i = 0; Reader.hasNextLine(); i++) {
                if (nStudent <= i) {
                    break;
                }
                String data = Reader.nextLine();

                String[] in = data.split(" ");
                ID = Integer.parseInt(in[0]);
                Name = in[1];
                cgpa = Float.parseFloat(in[2]);
                creditCompleted = Integer.parseInt(in[3]);

                student[i] = new Students(ID, Name, cgpa, creditCompleted);
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
        Out = new BufferedWriter(new FileWriter("outputs.txt"));
        for (int i = 0; i < nStudent; i++) {

            ID = student[i].ID;
            cgpa = student[i].cgpa;
            creditCompleted = student[i].creditCompleted;
            String str = ID + " " + cgpa + " " + creditCompleted + "\n";
            Out.append(str);
        }
        Out.close();
    }
}