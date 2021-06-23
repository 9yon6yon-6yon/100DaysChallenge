package ChatServer;

import java.net.Socket;
import java.util.Scanner;
import java.io.IOException;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Socket s = null;
        System.out.println("Please input username");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        scan.close();
        int port = 8080;
        try {
            s = new Socket("10.0.0.106", port);
            Thread.sleep(1000);
            Thread server = new Thread(new ServerThread(s, name));
            server.start();

        } catch (IOException e) {
            System.err.println("Fatal connection error!");
            e.printStackTrace();
        } catch (InterruptedException e) {
            System.err.println("Fatal connection error! with interruption");
            e.printStackTrace();
        }

    }
}
