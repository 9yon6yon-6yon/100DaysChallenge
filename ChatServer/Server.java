package ChatServer;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server {

    public static void main(String[] args) throws IOException {
        int port = 4444;

        while (true) {
            try {
                ServerSocket ss = new ServerSocket(port);
                ArrayList<ClientThread> clients = new ArrayList<ClientThread>();
                Socket s = ss.accept();
                ClientThread client = new ClientThread(s);
                Thread thread = new Thread(client);
                thread.start();
                clients.add(client);
            } catch (IOException e) {
                System.out.println("Accept failed on :" + port);
            }

        }
    }

}
