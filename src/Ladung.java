import java.util.logging.Logger;

public class Ladung {

    private String bezeichnung;

    private int menge;


    public Ladung(String bezeichnung, int menge) {
        this.bezeichnung = bezeichnung;
        this.menge = menge;
    }

    public void setBezeichnung(String name) {

    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setMenge(int menge) {
        this.menge = menge;
    }

    public int getMenge() {
        return menge;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    Logger logger = Logger.getLogger(String.valueOf(Ladung.class));
}
