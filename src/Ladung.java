/**
 * Klasse, um eine Ladung zu definieren
 * @author d.krivoruchko
 */
public class Ladung {

    /** Bezeichnung der Ladung */
    private String bezeichnung;

    /** Menge der Ladung */
    private int menge;


    /**
     * Standartkonstruktor der Ladung
     */
    //TODO warum gibts diesen Kontruktur, wenn er nirgends verwendet wird?
    public Ladung() {}


    /**
     * Konstruktor der Ladung
     * @param bezeichnung Bezeichnung der Ladung
     * @param menge Menge der Ladung
     */
    public Ladung(String bezeichnung, int menge) {
        this.bezeichnung = bezeichnung;
        this.menge = menge;
    }


    /**
     * Methode legt eine neue Bezeichnung für die Ladung fest
     * @param name Neue Bezeichnung
     */
    //TODO wird aktuell nicht genutzt
    public void setBezeichnung(String name) {
        bezeichnung = name;
    }


    /**
     * Methode gibt die Bezeichnung der Ladung zurück
     * @return Bezeichnung der Ladung
     */
    public String getBezeichnung() {
        return bezeichnung;
    }


    /**
     * Methode legt neue Menge der Ladung fest
     * @param menge Neue Menge
     */
    public void setMenge(int menge) {
        this.menge = menge;
    }


    /**
     * Methode gibt die Menge der Ladung zurück
     * @return Menge der Ladung
     */
    public int getMenge() {
        return menge;
    }


    /**
     * Methode gibt die Information über die Ladung in String-Form zurück
     * @return Information über die Ladung mit deren Bezeichnung und Ladung
     */
    @Override
    public String toString() {
        return "Bezeichnung der Ladung: "+bezeichnung+". Vorhandene Menge: "+menge;
    }
}
