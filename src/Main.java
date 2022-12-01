import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Voiture maFerrari = new Voiture("Renault","Twingo","Rouge",4, 3);
        System.out.printf("Ma voiture est une %s %s de %s avec %d places et %d roues.",maFerrari.Modele,maFerrari.Couleur, maFerrari.Marque,maFerrari.NbPlace,maFerrari.NbRoue);
        System.out.println();

        int nbMin = maFerrari.Avancer(25,80);
        System.out.println("il me faut "+nbMin+" minutes pour aller a TFTIC!");

        List<String> passagers = new ArrayList<>();
        passagers.add("Sam");
        passagers.add("Aude");
        passagers.add("Thierry");
        passagers.add("Michael");

        for (String passager : passagers) {
            maFerrari.AjouterPassager(passager);
        }

        /*while (maFerrari.AjouterPassager()){
            System.out.println("Il y a "+maFerrari.NbPassager+" passager(s) pour "+maFerrari.NbPlace+" places.");
        }*/

        Voiture laFraise = maFerrari;

        System.out.printf("Ma voiture est une %s %s de %s avec %d places et %d roues.",laFraise.Modele,laFraise.Couleur, laFraise.Marque,laFraise.NbPlace,laFraise.NbRoue);

        maFerrari.NbRoue = 3;
        System.out.println();
        System.out.printf("Ma voiture est une %s %s de %s avec %d places et %d roues.",laFraise.Modele,laFraise.Couleur, laFraise.Marque,laFraise.NbPlace,laFraise.NbRoue);

        Voiture v1 = new Voiture("Peugeot","406","blanche");
        v1.NbRoue = 5;
        v1.NbPlace = 5;
        System.out.println();
        System.out.printf("Ma voiture est une %s %s de %s avec %d places et %d roues.",v1.Modele,v1.Couleur, v1.Marque,v1.NbPlace,v1.NbRoue);

    }
}
