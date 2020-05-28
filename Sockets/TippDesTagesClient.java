import java.io.*;
import java.net.*;

public class TippDesTagesClient {

    public void los() {
        try {
            Socket s = new Socket("127.0.0.1", 4243);

            BufferedReader reader = new BufferedReader(new InputStreamReader(s.getInputStream()));

            String tipp = reader.readLine();

            int i = 0;
            while (i < 3) {
                System.out.println("Tipp des Tages: " + tipp);
                i++;
            }

            reader.close();
            s.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        TippDesTagesClient client = new TippDesTagesClient();
        client.los();
    }
}