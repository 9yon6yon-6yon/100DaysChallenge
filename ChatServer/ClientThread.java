package ChatServer;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientThread extends Server implements Runnable {
    private static final ClientThread[] clients = null;
    private Socket s;
    private BufferedReader in;
    private PrintWriter out;

    public ClientThread(Socket s) {
        this.s = s;

    }

    public void run() {
        try {
            out = new PrintWriter(s.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(s.getInputStream()));
            while (!s.isClosed()) {
                String input = in.readLine();
                if (input != null) {
                    for (ClientThread client : clients) {
                        client.getWriter().write(input);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public PrintWriter getWriter() {
        return out;
    }
}
