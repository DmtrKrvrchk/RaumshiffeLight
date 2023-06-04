/**
 * Klasse, um einen Gast zu definieren
 * @author d.krivoruchko
 */
public class Gast extends Ladung {

    /** Heimplanet des Gastes */
    private String heimplanet;
    /** Sprache des Gastes */
    private String sprache;
    /** Verpflegungsart des Gastes */
    private Verpflegungsart verpflegungsart;


    /**
     * Standartkonstruktor des Gastes
     */
    public Gast() {}

    /**
     * Konstruktor des Gastes
     * @param bezeichnung Gastbezeichnung
     * @param menge Anzahl der Gaeste
     * @param heimplanet Heimplanet des Gastes
     * @param sprache Sprache des Gastes
     * @param verpflegungsart Verpflegungsart des Gastes
     */
    public Gast(String bezeichnung, int menge, String heimplanet, String sprache, Verpflegungsart verpflegungsart) {
        super(bezeichnung, menge);
        this.heimplanet = heimplanet;
        this.sprache = sprache;
        this.verpflegungsart = verpflegungsart;
    }


    /**
     * Methode legt einen neuen Heimplanet des Gastes fest
     * @param heimplanet Neuer Heimplanet
     */
    public void setHeimplanet(String heimplanet) { this.heimplanet = heimplanet; }

    /**
     * Methode gibt den Heimplanet des Gastes zurueck
     * @return Heimplanet des Gastes
     */
    public String getHeimplanet() { return heimplanet; }

    /**
     * Methode legt eine neue Sprache des Gastes fest
     * @param sprache Neue Sprache
     */
    public void setSprache(String sprache) { this.sprache = sprache; }

    /**
     * Methode gibt die Sprache des Gastes zurueck
     * @return Sprache des Gastes
     */
    public String getSprache() { return sprache; }

    /**
     * Methode legt eine neue Verpflegungsart des Gastes fest
     * @param verpflegungsart Neue Verpflegungsart
     */
    public void setVerpflegungsart(Verpflegungsart verpflegungsart) { this.verpflegungsart = verpflegungsart; }

    /**
     * Methode gibt die verpflegungsart des Gastes zurueck
     * @return Verpflegungsart des Gastes
     */
    public Verpflegungsart getVerpflegungsart() { return verpflegungsart; }

    /**
     * Methode gibt die Information ueber den Gast in String-Form zurueck
     * @return Information ueber den Gast
     */
    @Override
    public String toString() {
        return "Gastbezeichnung: "+bezeichnung+", " +
                "Anzahl der Gaeste: "+menge+", Heimplanet: "+heimplanet+", " +
                "Sprache: "+sprache+", Verpflegung: "+verpflegungsart+".";
    }
}
