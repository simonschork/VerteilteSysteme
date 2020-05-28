import java.io.*;

public class Team implements Serializable {
    String name;
    Spielfigur[] members;

    // Konstruktor für Team
    public Team(String n, Spielfigur[] m) {
        name = n;
        members = m;
    }

    // In print methode aufrufe für Name
    public String getName() {
        return name;
    }

    // In print methode aufrufe für Teammember (Instanzen von Spielfiguren als Array
    // in Instanz von Team)
    public String getMembers() {
        int i = 1;
        String memberListe = "";
        // Für jede SPielfigur in members wird die memberListe um den String hinter dem
        // += erweitert
        for (Spielfigur x : members) {
            memberListe += "Teammitglied '" + i + "' vom Typ " + x.typ + " mit: " + x.getWaffen() + ".....\n";
            i++;
        }
        return memberListe;
    }
}