import java.util.Random;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(String.valueOf(Main.class));
        Random random = new Random();
        Raumschiff klingonen = new Raumschiff(0, 100, 50,
                100, 100, "IKS Hegh'ta", 2);
        Raumschiff romulaner = new Raumschiff(2, 50, 50,
                100,100, "IRW Khazara", 2);
        Raumschiff vulkanier = new Raumschiff(3, random.nextInt(100), random.nextInt(100),
                random.nextInt(100), 100, "Ni'Var", 5);

        klingonen.addLadung(new Transportgut("Ferengi Schneckensaft", 200, .2, .2, .1));
        klingonen.addLadung(new Transportgut("Bat'leth Klingonen Schwert", 200, .8, .2, .1));
        klingonen.addLadung(new Gast("Borg", 200, "Delta-Quadrant", "irrelevant, alphanumerischer Code", Verpflegungsart.ALLES_INKLUSIVE));
        romulaner.addLadung(new Transportgut("Borg-Schrott", 5, .2, .5, .5));
        romulaner.addLadung(new Transportgut("Rote Materie", 2, 1, 1, 1));
        romulaner.addLadung(new Transportgut("Plasma-Waffe", 50, 1, 1, 1));
        vulkanier.addLadung(new Transportgut("Forschungssonde", 35, 100, 50, 25));
        vulkanier.addLadung(new Transportgut("Photonentorpedos", 20, 2, 2, 1));
        vulkanier.addLadung(new Gast("Ferengi", 10, "Ferenginar", "Ferengi", Verpflegungsart.VOLLPENSION));

        klingonen.photonentorpedoSchiessen(romulaner); // Die Klingonen schießen mit dem Photonentorpedo einmal auf die Romulaner.
        romulaner.phaserkanoneSchiessen(klingonen); // Die Romulaner schießen mit der Phaserkanone zurück.
        vulkanier.nachrichtAnAlle("Gewalt ist nicht logisch"); // Die Vulkanier senden eine Nachricht an Alle.
        klingonen.zustandRaumschiff(); // Die Klingonen rufen den Zustand Ihres Raumschiffes ab und...
        klingonen.ladungsverzeichnisAusgeben(); // ...geben Ihr Ladungsverzeichnis aus
        vulkanier.zustandRaumschiff();
        vulkanier.reparaturDurchfuehren(true, true, true, vulkanier.getAndroidenAnzahl()); // Die Vulkanier sind sehr sicherheitsbewusst und setzen alle Androiden zur Aufwertung ihres Schiffes ein.
        vulkanier.zustandRaumschiff();
        vulkanier.photonentorpedosLaden(20); // Die Vulkanier verladen Ihre Ladung Photonentorpedos in die Torpedoröhren Ihres Raumschiffes und...
        vulkanier.ladungsverzeichnisAusgeben();
        vulkanier.ladungsverzeichnisAufraeumen(); // ...räumen das Ladungsverzeichnis auf.
        vulkanier.ladungsverzeichnisAusgeben();
        klingonen.photonentorpedoSchiessen(romulaner); // Die Klingonen schießen mit zwei weiteren Photonentorpedo auf die Romulaner.
        klingonen.photonentorpedoSchiessen(romulaner); // Die Klingonen schießen mit zwei weiteren Photonentorpedo auf die Romulaner.
        klingonen.zustandRaumschiff(); // Die Klingonen, die Romulaner und die Vulkanier rufen jeweils den Zustand Ihres Raumschiffes ab und geben Ihr Ladungsverzeichnis aus.
        klingonen.ladungsverzeichnisAusgeben();
        romulaner.zustandRaumschiff();
        romulaner.ladungsverzeichnisAusgeben();
        vulkanier.zustandRaumschiff();
        vulkanier.ladungsverzeichnisAusgeben();
        Raumschiff.eintrageLogbuchZurueckgeben().forEach(logger::info); //Geben Sie den broadcastKommunikator aus.
    }
}