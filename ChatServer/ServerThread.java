package ChatServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ServerThread implements Runnable {
    private Socket s;
    private String name;
    private BufferedReader serverIn;
    private BufferedReader userIn;
    private PrintWriter out;

    public ServerThread(Socket s, String name) {
        this.s = s;
        this.name = name;
    }

    public void run() {
        try {
            out = new PrintWriter(s.getOutputStream(), true);
            serverIn = new BufferedReader(new InputStreamReader(s.getInputStream()));
            userIn = new BufferedReader(new InputStreamReader(System.in));
            while (!s.isClosed()) {
                if (serverIn.ready()) {
                    String input = serverIn.readLine();
                    if (input != null) {
                        System.out.println(input);
                    }
                }
                if (userIn.ready()) {
                    out.println(name + " > " + userIn.readLine());
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
