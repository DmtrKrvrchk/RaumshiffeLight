/**
 * Klasse, um ein Transportgut zu definieren
 * @author d.krivoruchko
 */
public class Transportgut extends Ladung {

    /** Ladungslaenge */
    private double laengeMeter;
    /** Ladungsbreite */
    private double breiteMeter;
    /** Ladungshoehe */
    private double hoeheMeter;

    /**
     * Standartkonstruktor des Transportgutes
     */
    public Transportgut() {}

    /**
     * Konstruktor des Transportgutes
     * @param bezeichnung Bezeichnung des Transportgutes
     * @param menge Menge des Transportgutes
     * @param laengeMeter Laenge des Transportgutes
     * @param breiteMeter Breite des Transportgutes
     * @param hoeheMeter Hoehe des Transportgutes
     */
    public Transportgut(String bezeichnung, int menge, double laengeMeter, double breiteMeter, double hoeheMeter) {
        super(bezeichnung, menge);
        this.laengeMeter = laengeMeter;
        this.breiteMeter = breiteMeter;
        this.hoeheMeter = hoeheMeter;
    }

    /**
     * Methode legt eine neue Laenge des Transportgutes fest
     * @param laengeMeter Neue Laenge
     */
    public void setLaengeMeter(double laengeMeter) {
        this.laengeMeter = laengeMeter;
    }

    /**
     * Methode gibt die Laenge des Transportgutes zurueck
     * @return Laenge des Transportgutes
     */
    public double getLaengeMeter() {
        return laengeMeter;
    }

    /**
     * Methode legt eine neue Breite des Transportgutes fest
     * @param breiteMeter Neue Breite
     */
    public void setBreiteMeter(double breiteMeter) {
        this.breiteMeter = breiteMeter;
    }

    /**
     * Methode gibt die Breite des Transportgutes zurueck
     * @return Breite des Transportgutes
     */
    public double getBreiteMeter() {
        return breiteMeter;
    }

    /**
     * Methode legt eine neue Hoehe des Transportgutes fest
     * @param hoeheMeter Neue Hoehe
     */
    public void setHoeheMeter(double hoeheMeter) {
        this.hoeheMeter = hoeheMeter;
    }

    /**
     * Methode gibt die Hoehe des Transportgutes zurueck
     * @return Hoehe des Transportgutes
     */
    public double getHoeheMeter() {
        return hoeheMeter;
    }

    /**
     * Methode gibt die Information ueber das Transportgut in String-Form zurueck
     * @return Information ueber das Transportgut in String-Form
     */
    @Override
    public String toString() {
        return "Bezeichnung der Ladung: "+bezeichnung+", " +
                "Menge: "+menge+", Laenge: "+laengeMeter+", " +
                "Breite: "+breiteMeter+", Hoehe: "+hoeheMeter+".";
    }
}