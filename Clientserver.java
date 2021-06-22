import java.io.*;
import java.net.*;

public class Clientserver {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 6666);//replace localhost with your ip (find ip using 'ipconfig' or 'ifconfig' in terminal)
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            dout.writeUTF("Hello Server");
            dout.flush();
            dout.close();
            s.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}