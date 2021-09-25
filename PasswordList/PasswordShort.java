package PasswordList;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PasswordShort {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("PasswordList/pass8to20.txt");
            BufferedReader br = new BufferedReader(fr);
//            PrintWriter pr = new PrintWriter("src/PasswordList/pass8to20.txt");
//            BufferedWriter bw = new BufferedWriter(pr);
//            PrintWriter pr2 = new PrintWriter("src/PasswordList/pass1to8.txt");
//            BufferedWriter bw2 = new BufferedWriter(pr2);
//            PrintWriter pr3 = new PrintWriter("src/PasswordList/passAnother.txt");
//            BufferedWriter bw3 = new BufferedWriter(pr3);
            String line;
            while ((line = br.readLine()) != null) {
//                if (line.length() >= 8 && line.length() <= 32) {
////                    bw.append(line).append("\n");
//                    bw.write(line + "\n");
//                }
//                else if (line.length() < 8) {
//                    bw2.write(line + "\n");
////                    bw2.append(line).append("\n");
//                }
//                else bw3.write(line + "\n");
////                    bw3.append(line).append("\n");
                System.out.println(line);
            }
            br.close();
//            bw.close();
//            bw2.close();
//            bw3.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
