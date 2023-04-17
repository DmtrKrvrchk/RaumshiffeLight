import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Logger;


/**
 * Klasse, um ein Raumschiff zu definieren
 * @author d.krivoruchko
 */
public class Raumschiff {

    /** Anzahl der Photonentorpedos */
    private int photonentorpedoAnzahl;

    /** Niveau der Energieversorgung in Prozent */
    private int energieversorgungInProzent;

    /** Zustand der Schilde in Prozent*/
    private int schildeInProzent;

    /** Zustand der Hülle in Prozent */
    private int huelleInProzent;

    /** Zustand der Lebenserhaltungssysteme in Prozent */
    private int lebenserhaltungssystemeInProzent;

    /** Anzahl der Androiden */
    private int androidenAnzahl;

    /** Name des Raumschiffes */
    private String schiffsname;

    /** Liste der Nachrichten im Broadcast */
    private static ArrayList<String> broadcastKommunikator = new ArrayList<>();

    /** Liste der Ladungen */
    private ArrayList<Ladung> ladungsverzeichnis;


    /**
     * Konstruktor der Raumschiffe
     * @param photonentorpedoAnzahl Anzahl der Photonentorpedos
     * @param energieversorgungInProzent Niveau der Energieversorgung in Prozent
     * @param zustandSchildeInProzent Zustand der Schilde in Prozent
     * @param zustandHuelleInProzent Zustand der Hülle in Prozent
     * @param zustandLebenserhaltungssystemeInProzent Zustand der Lebenserhaltungssysteme in Prozent
     * @param schiffsname Name des Raumschiffes
     * @param anzahlDroiden Anzahl der Androiden
     */
    public Raumschiff(int photonentorpedoAnzahl, int energieversorgungInProzent, int zustandSchildeInProzent,
                      int zustandHuelleInProzent, int zustandLebenserhaltungssystemeInProzent, String schiffsname, int anzahlDroiden) {
        if (photonentorpedoAnzahl < 0 || energieversorgungInProzent < 0 || zustandHuelleInProzent < 0 ||
        zustandSchildeInProzent < 0 || zustandLebenserhaltungssystemeInProzent < 0 || anzahlDroiden < 0 ||
        energieversorgungInProzent > 100 || zustandHuelleInProzent > 100 || zustandSchildeInProzent > 100 ||
        zustandLebenserhaltungssystemeInProzent > 100) {
            logger.info("Kein Parameter des Raumschiffes darf negativ sein! Alle Angaben in % dürfen nicht größer als 100% sein!");
        } else {
            this.photonentorpedoAnzahl = photonentorpedoAnzahl;
            this.energieversorgungInProzent = energieversorgungInProzent;
            schildeInProzent = zustandHuelleInProzent;
            huelleInProzent = zustandHuelleInProzent;
            lebenserhaltungssystemeInProzent = zustandHuelleInProzent;
            androidenAnzahl = anzahlDroiden;
            this.schiffsname = schiffsname;
            ladungsverzeichnis = new ArrayList<>();
        }
    }


    /**
     * Methode gibt die Anzahl der Photonentorpedos zurück
     * @return Anzahl der Photonentorpedos
     */
    public int getPhotonentorpedoAnzahl() {
        return photonentorpedoAnzahl;
    }


    /**
     * Methode legt die Anzahl der Photonentorpedos fest
     * @param photonentorpedoAnzahlNeu Anzahl der Photonentorpedos zum Festlegen
     */
    public void setPhotonentorpedoAnzahl(int photonentorpedoAnzahlNeu) {
        photonentorpedoAnzahl = photonentorpedoAnzahlNeu;
    }


    /**
     * Methode gibt den Zustand der Energieversorgung in Prozent zurück
     * @return Niveau der Energieversorgung in Prozent
     */
    public int getEnergieversorgungInProzent() {
        return energieversorgungInProzent;
    }


    /**
     * Methode legt den Zustand der Energieversorgung in Prozent fest
     * @param zustandEnergieversorgungInProzentNeu Niveau der Energieversorgung in Prozent zum Festlegen
     */
    public void setEnergieversorgungInProzent(int zustandEnergieversorgungInProzentNeu) {
        energieversorgungInProzent = zustandEnergieversorgungInProzentNeu;
    }


    /**
     * Methode gibt den Zustand der Schilde in Prozent zurück
     * @return Zustand der Schilde in Prozent
     */
    public int getSchildeInProzent() {
        return schildeInProzent;
    }


    /**
     * Methode legt den Zustand der Schilde in Prozent fest
     * @param zustandSchildeInProzentNeu Zustand der Schilde in Prozent zum Festlegen
     */
    public void setSchildeInProzent(int zustandSchildeInProzentNeu) {
        schildeInProzent = zustandSchildeInProzentNeu;
    }


    /**
     * Methode gibt den Zustand der Hülle in Prozent zurück
     * @return Zustand der Hülle in Prozent
     */
    public int getHuelleInProzent() {
        return huelleInProzent;
    }


    /**
     * Methode legt den Zustand der Hülle in Prozent fest
     * @param zustandHuelleInProzentNeu Zustand der Hülle zum Festlegen
     */
    public void setHuelleInProzent(int zustandHuelleInProzentNeu) {
        huelleInProzent = zustandHuelleInProzentNeu;
    }


    /**
     * Methode gibt den Zustand der Lebenserhaltungssysteme in Prozent zurück
     * @return Zustand der Lebenserhaltungssysteme
     */
    public int getLebenserhaltungssystemeInProzent() {
        return lebenserhaltungssystemeInProzent;
    }


    /**
     * Methode legt den Zustand der Lebenserhaltungssysteme in Prozent fest
     * @param zustandLebenserhaltungssystemeInProzentNeu Zustand der Lebenserhaltungssysteme zum Festlegen
     */
    public void setLebenserhaltungssystemeInProzent(int zustandLebenserhaltungssystemeInProzentNeu) {
        lebenserhaltungssystemeInProzent = zustandLebenserhaltungssystemeInProzentNeu;
    }


    /**
     * Methode gibt die Anzahl der Androiden zurück
     * @return Anzahl der Androiden
     */
    public int getAndroidenAnzahl() {
        return androidenAnzahl;
    }


    /**
     * Methode legt die Anzahl der Androiden fest
     * @param androidenAnzahl Anzahl der Androiden zum Festlegen
     */
    public void setAndroidenAnzahl(int androidenAnzahl) {
        this.androidenAnzahl = androidenAnzahl;
    }


    /**
     * Methode gibt den Namen des Schiffes zurück
     * @return Name des Schiffes
     */
    public String getSchiffsname() {
        return schiffsname;
    }


    /**
     * Methode legt den Namen des Schiffes fest
     * @param schiffsname Name des Schiffes
     */
    public void setSchiffsname(String schiffsname) {
        this.schiffsname = schiffsname;
    }


    /**
     * Methode fügt eine neue Ladung zum Ladungsverzeichnis hinzu
     * @param neueLadung Ladung zum Hinzufügen
     */
    public void addLadung(Ladung neueLadung) {
        this.ladungsverzeichnis.add(neueLadung);
    }


    /**
     * Methode, um ein anderes Raumschiff mit Photonentorpedos abzuschießen
     * @param r Raumschiff, das abgeschossen wird
     */
    public void photonentorpedoSchiessen(Raumschiff r) {
        if (getPhotonentorpedoAnzahl() == 0) {
            nachrichtAnAlle("-=*Click*=-");
        } else {
            photonentorpedoAnzahl--;
            nachrichtAnAlle("Photonentorpedo abgeschossen!");
            treffer(r);
        }
    }


    /**
     * Methode, um ein anderes Raumschiff aus Phaserkanone abzuschießen
     * @param r Raumschiff, das abgeschossen wird
     */
    public void phaserkanoneSchiessen(Raumschiff r) {
        if (getEnergieversorgungInProzent() < 50) {
            logger.info("-=*Click*=-");
        } else {
            energieversorgungInProzent -= 50;
            nachrichtAnAlle("Phaserkanone abgeschossen!");
            treffer(r);
        }

    }

    /**
     * Methode vermerkt einen Treffer
     * @param r Das getroffene Raumschiff
     */
    private void treffer(Raumschiff r) {
        if (r.getSchildeInProzent() >= 50) {
            r.schildeInProzent -= 50;
        } else if (r.getSchildeInProzent() < 50) {
            r.setSchildeInProzent(0);
            r.huelleInProzent -= 50;
            r.energieversorgungInProzent -= 50;
            if (r.getEnergieversorgungInProzent() < 0) {
                r.setEnergieversorgungInProzent(0);
            } else if (r.getHuelleInProzent() <= 0) {
                r.setHuelleInProzent(0);
                r.nachrichtAnAlle("Die Lebenserhaltungssysteme vernichtet worden!");
            }
        }
        logger.info(r.schiffsname + " wurde getroffen!");
    }


    /**
     * Methode, um eine Nachricht dem broadcastKommunikator hinzuzufügen
     * @param message Nachricht zum Hinzufügen
     */
    public void nachrichtAnAlle(String message) {
        broadcastKommunikator.add(message);
        logger.info(message);
    }


    /**
     * Methode gibt alle Nachrichten aus dem broadcastKommunikator zurück
     * @return alle Nachrichten aus dem broadcastKommunikator
     */
    public static ArrayList<String> eintrageLogbuchZurueckgeben() {
        return broadcastKommunikator;
    }


    /**
     * Methode, um Photonentorpedo(s) einzusetzen
     * @param anzahlTorpedos Anzahl der Photonentorpedo(s) zum Einsetzen
     */
    public void photonentorpedosLaden(int anzahlTorpedos) {
        for (Ladung ladung:ladungsverzeichnis) {
            if (ladung.getBezeichnung().equals("Photonentorpedos")) {
                if (anzahlTorpedos > ladung.getMenge()) {
                    photonentorpedoAnzahl += ladung.getMenge();
                    logger.info("Es gibt nur "+ladung.getMenge()+" Photonentorpedos in der Ladung. "+ladung.getMenge()+" Photonentorpedo(s) eingesetzt.");
                    ladung.setMenge(0);
                } else {
                    photonentorpedoAnzahl += anzahlTorpedos;
                    logger.info(anzahlTorpedos+" Photonentorpedo(s) eingesetzt.");
                    ladung.setMenge(ladung.getMenge() - anzahlTorpedos);
                }
            } else {
                logger.info("Keine Photonentorpedos gefunden!");
                nachrichtAnAlle("-=*Click*=-");
            }
        }
    }


    /**
     * Methode, um ein Raumschiff zu reparieren
     * @param schutzschilde True, wenn dessen Schutzschilde repariert werden müsse
     * @param energieversorgung True, wenn deren Energieversorgung repariert werden muss
     * @param schiffshuelle True, wenn deren Schiffshülle repariert werden muss
     * @param anzahlDroiden Eingesetzte zur Reparatur Androiden
     */
    public void reparaturDurchfuehren(boolean schutzschilde, boolean energieversorgung,
                                      boolean schiffshuelle, int anzahlDroiden) {
        int androidenImEinsatz = Math.min(anzahlDroiden, androidenAnzahl);

        int trueSchiffsstrukturen = 0;
        if (schutzschilde) { trueSchiffsstrukturen++; }
        else if (energieversorgung) { trueSchiffsstrukturen++; }
        else if (schiffshuelle) { trueSchiffsstrukturen++; }
        else {logger.info("Es muss mindestens eine Schiffsstruktur zum Reparieren eingesetzt werden!");}

        Random random = new Random();
        int zufallszahl = random.nextInt(100);
        if (schutzschilde) {
            schildeInProzent += zufallszahl*androidenImEinsatz/trueSchiffsstrukturen;
            if (getSchildeInProzent() > 100) {
                schildeInProzent = 100;
            }
        }

        if (energieversorgung) {
            energieversorgungInProzent += zufallszahl*androidenImEinsatz/trueSchiffsstrukturen;
            if (getEnergieversorgungInProzent() > 100) {
                energieversorgungInProzent = 100;
            }
        }

        if (schiffshuelle) {
            huelleInProzent += zufallszahl*androidenImEinsatz/trueSchiffsstrukturen;
            if (getHuelleInProzent() > 100) {
                huelleInProzent = 100;
            }
        }
    }


    /**
     * Methode gibt die Information über das Raumschiff aus
     */
    public void zustandRaumschiff() {
        logger.info("Der Kapitän und seine Crew heißen Sie Herzlich Willkommen an Bord des Schiffes "+schiffsname+
                " und informieren Sie über den Zustand des Schiffes."+
                "\r\n"+"Anzahl der Photonentorpedos: "+photonentorpedoAnzahl+";"+
                "\r\n"+"Energieversorgung: "+energieversorgungInProzent+"%;"+
                "\r\n"+"Zustand der Schilde: "+schildeInProzent+"%;"+
                "\r\n"+"Zustand der Hülle: "+huelleInProzent+"%;"+
                "\r\n"+"Zustand des Lebenserhaltungssystems: "+lebenserhaltungssystemeInProzent+"%;"+
                "\r\n"+"Anzahl der Androiden: "+androidenAnzahl+";");
    }


    /**
     * Methode listet Ladungsverzeichnis auf
     */
    public void ladungsverzeichnisAusgeben() {
        logger.info(ladungsverzeichnis.toString());
    }


    /**
     * Methode löscht eine Ladung aus dem Ladungsverzeichnis, wenn deren Menge ist 0
     */
    public void ladungsverzeichnisAufraeumen() {
        ladungsverzeichnis.removeIf(ladung -> ladung.getMenge() == 0);
    }

    /**
     * Logger-Objekt, um Meldungen zu protokollieren
     */
    Logger logger = Logger.getLogger(String.valueOf(Raumschiff.class));

}