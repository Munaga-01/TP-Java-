// Interface Vehicule
interface Vehicule {
    void demarrer(); // Méthode pour démarrer le véhicule
    void arreter();  // Méthode pour arrêter le véhicule
    int getVitesseMax(); // Méthode pour retourner la vitesse maximale du véhicule (en km/h)
}

// Classe Voiture qui implémente l'interface Vehicule
class Voiture implements Vehicule {
    private int vitesseMax;

    public Voiture(int vitesseMax) {
        this.vitesseMax = vitesseMax;
    }

    @Override
    public void demarrer() {
        System.out.println("La voiture démarre.");
    }

    @Override
    public void arreter() {
        System.out.println("La voiture s'arrête.");
    }

    @Override
    public int getVitesseMax() {
        return vitesseMax;
    }
}

// Classe Velo qui implémente l'interface Vehicule
class Velo implements Vehicule {
    private int vitesseMax;

    public Velo(int vitesseMax) {
        this.vitesseMax = vitesseMax;
    }

    @Override
    public void demarrer() {
        System.out.println("Le velo démarre.");
    }

    @Override
    public void arreter() {
        System.out.println("Le velo s'arrête.");
    }

    @Override
    public int getVitesseMax() {
        return vitesseMax;
    }
}

// Classe Moto qui implémente l'interface Vehicule
class Moto implements Vehicule {
    private int vitesseMax;

    public Moto(int vitesseMax) {
        this.vitesseMax = vitesseMax;
    }

    @Override
    public void demarrer() {
        System.out.println("La moto démarre.");
    }

    @Override
    public void arreter() {
        System.out.println("La moto s'arrête.");
    }

    @Override
    public int getVitesseMax() {
        return vitesseMax;
    }
}

// Classe principale pour tester les objets
public class TestVehicule {
    public static void main(String[] args) {
        Vehicule voiture = new Voiture(200);
        Vehicule velo = new Velo(30);
        Vehicule moto = new Moto(180);

        // Tester la voiture
        voiture.demarrer();
        System.out.println("Vitesse max: " + voiture.getVitesseMax() + " km/h");
        voiture.arreter();
        System.out.println("            ");

        // Tester le velo
        velo.demarrer();
        System.out.println("Vitesse max: " + velo.getVitesseMax() + " km/h");
        velo.arreter();
        System.out.println("            ");

        // Tester la moto
        moto.demarrer();
        System.out.println("Vitesse max: " + moto.getVitesseMax() + " km/h");
        moto.arreter();
        System.out.println("         ");
        System.out.println("MERCI BCP POUR L'ATTENTION ACCORDEE");
        System.out.println("code signé Samuel MUNAGA");
    }
}
