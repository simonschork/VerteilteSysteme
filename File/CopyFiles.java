import java.io.*;

public class CopyFiles {
    public static void main(String[] args) throws IOException {

        try {
            // Lesen
            File textDatei = new File("Name.txt");
            BufferedReader reader = new BufferedReader(new FileReader(textDatei));

            File textDateiKopie = new File("name_kopie.txt");
            textDateiKopie.createNewFile();
            BufferedWriter writer = new BufferedWriter(new FileWriter(textDateiKopie));

            String zeile;

            while ((zeile = reader.readLine()) != null) {
                writer.write(zeile);
                writer.newLine();

            }

            reader.close();
            writer.flush();
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}