/**
 * Abstrakte Klasse, um eine Ladung zu definieren
 * @author d.krivoruchko
 */
public abstract class Ladung {

    /** Bezeichnung der Ladung */
    protected String bezeichnung;

    /** Menge der Ladung */
    protected int menge;


    /**
     * Standartkonstruktor der Ladung
     */
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
     * Methode legt eine neue Bezeichnung der Ladung fest
     * @param name Neue Bezeichnung
     */
    public void setBezeichnung(String name) {
        bezeichnung = name;
    }

    /**
     * Methode gibt die Bezeichnung der Ladung zurueck
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
     * Methode gibt die Menge der Ladung zurueck
     * @return Menge der Ladung
     */
    public int getMenge() {
        return menge;
    }
}