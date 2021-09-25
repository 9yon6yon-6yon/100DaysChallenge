package Lab11;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;

class Std {
    String name;
    int id;
    double cgpa;

    Std(String name, int id, double cgpa) {
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
    }
}

public class ArrayListTest {
    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
//        int a = 30;
//        list.add(100);
//        list.add(a);
//        list.add(4400);
//
//        System.out.println(list.get(1));
//
//        list.add(1, 400);
//        System.out.println(list.get(1));
//        list.set(2, 102);
//        list.remove(0);
////        for (int v:list
////             ) {
////            System.out.print(v+" ,");
////
////        }
//        for (int i = 0; i < list.size(); i++)
//            System.out.print(list.get(i) + ",");
//        System.out.println(list);


        ArrayList<Std> s = new ArrayList<>();
        try {
            FileReader fr = new FileReader(
                    "src/Lab11/students.txt");
            BufferedReader reader = new BufferedReader(fr);
            PrintWriter pw = new PrintWriter(
                    "src/Lab11/students2.txt");
            BufferedWriter w = new BufferedWriter(pw);
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");
                int id = Integer.parseInt(parts[1]);
                Std st = new Std(parts[0], id,
                        Double.parseDouble(parts[2]));
                s.add(st);}
                //sort by id, Ascending
//                s.sort(new Comparator<Std>() {
//                    @Override
//                    public int compare(Std std, Std t1) {
//                        if (std.id < t1.id)
//                            return -1;
//                        if (std.id > t1.id) return 1;
//                        return 0;
//                        //if return is negative std goes before t1
//                        //if return is positive std goes after t1
//                    }
//                });
                s.sort(new Comparator<Std>() {
                    @Override
                    public int compare(Std std, Std t1) {
                        String name1 = std.name;
                        String name2 = t1.name;
                        return name2.compareTo(name1);
                    }
                });
            for (Std std : s
            ) {
                w.write(std.name + " " + std.id + " " + std.cgpa + "\n");
            }

            reader.close();
            w.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
