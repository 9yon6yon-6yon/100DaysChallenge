package Lab10;

import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class GenarateRandomStudentData {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(new File("Files/B.txt"));
            Random random = new Random();

        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
