import java.io.*;
import java.net.*;

public class TippDesTagesServer {

    String[] tippListe = { "Fasten", "Meditiern", "Lernen", "Programmieren", "Was besonderes kochen" };

    public void los() {
        try {
            ServerSocket serverSock = new ServerSocket(4243);

            while (true) {
                Socket sock = serverSock.accept();

                PrintWriter writer = new PrintWriter(sock.getOutputStream());

                System.out.println("Server running");

                int i = 1;
                while (i < 3) {
                    String tipp = getTipp();
                    writer.println(tipp);
                    System.out.println(tipp);
                    i++;
                }

                writer.close();
                sock.close();

                System.out.println("Server closed");

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String getTipp() {
        int zufallszahl = (int) (Math.random() * tippListe.length);
        return tippListe[zufallszahl];
    }

    public static void main(String[] args) {
        TippDesTagesServer server = new TippDesTagesServer();
        server.los();
    }
}