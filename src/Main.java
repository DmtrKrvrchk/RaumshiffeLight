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

        Ladung ladung = new Ladung("Ferengi Schneckensaft", 200);
        Ladung ladung1 = new Ladung("Borg-Schrott", 5);
        Ladung ladung2 = new Ladung("Rote Materie", 2);
        Ladung ladung3 = new Ladung("Forschungssonde", 35);
        Ladung ladung4 = new Ladung("Bat'leth Klingonen Schwert", 200);
        Ladung ladung5 = new Ladung("Plasma-Waffe", 50);
        Ladung ladung6 = new Ladung("Photonentorpedos", 20);

        klingonen.addLadung(ladung);
        klingonen.addLadung(ladung4);
        romulaner.addLadung(ladung1);
        romulaner.addLadung(ladung2);
        romulaner.addLadung(ladung5);
        vulkanier.addLadung(ladung3);
        vulkanier.addLadung(ladung6);

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