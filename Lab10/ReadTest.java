package Lab10;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadTest {
    public static void main(String[] args) throws IOException {
        FileReader file = new FileReader("Files/B.txt");
        BufferedReader reader = new BufferedReader(file);
        Student[] st = new Student[10];
        int index = 0;
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(" ");
            st[index] = new Student(parts[0],
                    Integer.parseInt(parts[1]),
                    Double.parseDouble(parts[2]));
            index++;
        }
        reader.close();

//        Scanner sc = new Scanner(System.in);
//        Student[] s = new Student[10];
//        for (int i = 0; sc.hasNext(); i++) {
//            String name = sc.next();
//            int id = sc.nextInt();
//            double cgpa = sc.nextDouble();
//
//            s[i] = new Student(name, id, cgpa);
//        }
//        for(Student ss:s){
//            if(ss==null)break;
//            System.out.println(ss.name +" "+ss.id+""+ss.cgpa);
//        }
//        sc.close();
    }
}
