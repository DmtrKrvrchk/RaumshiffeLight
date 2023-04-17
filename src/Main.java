import java.util.Random;

public class Main {
    public static void main(String[] args) {
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

    }
}