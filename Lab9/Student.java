package Lab9;

import java.io.*;

public class Student {
    String name;
    int id;
    double cgpa;
    public Student(String name,int id,double cgpa){
        this.name = name;
        this.id=id;
        this.cgpa = cgpa;
    }
    public static void main(String[] args) {
        try{
            //buffer
            FileWriter fileWriter = new FileWriter("Files/A.txt");
            BufferedWriter writer = new BufferedWriter(fileWriter);
            //BufferedWriter has less functionality
            //compared to PrintWriter, but it is faster
            writer.write("ABCD");
            writer.newLine();
            writer.write(65+"\n");



            //file
//            File file = new File("Files/B.txt");
//            PrintWriter out = new PrintWriter(file);
            Student[] s = new Student[3];
            s[0] = new Student("Arif", 100,3.55);
            s[1] = new Student("Adf", 130,4.55);
            s[2] = new Student("Araeeif", 104,3.2);
            for(Student ss:s){
                writer.write("Name : "+ ss.name+", ID: "+ss.id+", CGPA: "+ss.cgpa+"\n");
//                out.println("Name : "+ ss.name+", ID: "+ss.id+", CGPA: "+ss.cgpa);
                }
//            out.close();//writer object needs to be closed.
            writer.close();
        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
