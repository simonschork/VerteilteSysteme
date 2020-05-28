import java.io.*;

public class Spielfigur implements Serializable {
    int starke;
    String typ;
    String[] waffen;

    // Konstruktor für Spielfigur
    public Spielfigur(int s, String t, String[] w) {
        starke = s;
        typ = t;
        waffen = w;
    }

    // In print methode aufrufe für Stärke
    public int getStaerke() {
        return starke;
    }

    // In print methode aufrufe für Typ
    public String getTyp() {
        return typ;
    }

    // In print methode aufrufe für Waffenliste
    public String getWaffen() {
        String waffenListe = "";
        for (int i = 0; i < waffen.length; i++) {
            waffenListe += waffen[i] + " ";
        }
        return waffenListe;
    }
}
