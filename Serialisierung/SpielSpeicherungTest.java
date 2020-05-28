import java.io.*;

public class SpielSpeicherungTest {
    public static void main(String[] args) {
        Spielfigur eins = new Spielfigur(50, "Elb", new String[] { "Bogen", "Schwert", "Staub" });
        Spielfigur zwei = new Spielfigur(200, "Troll", new String[] { "bloße Hände", "große Axt" });
        Spielfigur drei = new Spielfigur(120, "Zauberer", new String[] { "Zaubersprüche", "Unsichtbarkeit" });

        Team dasTeam = new Team("TeamTeam", new Spielfigur[] { eins, zwei, drei });

        // Testcode für Spielfigur ALTER CODE
        /*
         * try { ObjectOutputStream os = new ObjectOutputStream(new
         * FileOutputStream("Spiel.ser")); os.writeObject(eins); os.writeObject(zwei);
         * os.writeObject(drei); os.close(); } catch (IOException e) {
         * e.printStackTrace(); } eins = null; zwei = null; drei = null;
         * 
         * try { ObjectInputStream is = new ObjectInputStream(new
         * FileInputStream("Spiel.ser")); Spielfigur einsWiederhergestellt =
         * (Spielfigur) is.readObject(); Spielfigur zweiWiederhergestellt = (Spielfigur)
         * is.readObject(); Spielfigur dreiWiederhergestellt = (Spielfigur)
         * is.readObject(); is.close();
         * 
         * System.out.println("Typ 1. Figur: " + einsWiederhergestellt.getTyp());
         * System.out.println("Typ 2. Figur: " + zweiWiederhergestellt.getTyp());
         * System.out.println("Typ 3. Figur: " + dreiWiederhergestellt.getTyp()); }
         * catch (Exception e) { e.printStackTrace(); }
         */

        // Testcode für Team
        try {
            // Serialisierung von Team-Instanz "dasTeam" in Spiel.ser
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("Spiel.ser"));
            os.writeObject(dasTeam);
            os.close();
        } catch (IOException e) {
            // Wenn nicht funktioniert Stacktrace ausgeben
            e.printStackTrace();
        }
        dasTeam = null;

        try {
            // Deserialisierun von Spiel.ser in wiederhergestellte Team-Instanz
            // "dasTeamWiederhergestellt"
            ObjectInputStream is = new ObjectInputStream(new FileInputStream("Spiel.ser"));
            Team dasTeamWiederhergestellt = (Team) is.readObject();
            is.close();

            // Ausgeben verschiedener Instanzvariablen um erfolgreiche
            // Serialisierung/Deserialisierung zu testen
            System.out.println(
                    dasTeamWiederhergestellt.getName() + " besteht aus:\n" + dasTeamWiederhergestellt.getMembers());
        } catch (Exception e) {
            // Wenn nicht funktioniert Stacktrace ausgeben
            e.printStackTrace();
        }
    }
}