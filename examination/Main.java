package examination;
import java.io.*;
class Students {
    String name;
    int id;
    double cgpa;
    Students(String name, int id, double cgpa) {
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
    }
}
public class Main {
    public static void main(String[] args) {
        try {
            Students[] s = new Students[20];
            FileReader file1 = new FileReader("src/examination/input.txt");
            PrintWriter file2 = new PrintWriter("src/examination/output.txt");
            BufferedWriter writer = new BufferedWriter(file2);
            BufferedReader reader = new BufferedReader(file1);
            int index = 0;
            String line;
            double max = 0;
            double min = 10;
            double[] arr = new double[10];
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");
                s[index] = new Students(parts[0], Integer.parseInt(parts[1]), Double.parseDouble(parts[2]));
                arr[index] = Double.parseDouble(parts[2]);
                index++;
            }
            double sum = 0;
            writer.append("Max value of first 5 students: ");
            for (int i = 0; i < 5; i++) {
                if (max < arr[i]) {
                    max = arr[i];
                }
            }
            writer.append(String.valueOf(max));
            writer.append("\nMin value of first 5 students: ");
            for (int i = 0; i < 5; i++) {
                if (min > arr[i]) {
                    min = arr[i];
                }
            }
            writer.append(String.valueOf(min));
            for (int i = index - 1; i > index - 6; i--) {
                sum += arr[i];
            }
            writer.append("\nAvg cgpa of the last 5 students: ").append(String.valueOf(sum));

            reader.close();
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
