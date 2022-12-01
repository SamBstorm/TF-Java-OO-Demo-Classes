public class Voiture {
    String Marque;
    String Modele;
    Integer NbPlace;
    Integer NbPassager = 0;
    Integer NbRoue;
    String Couleur;

    public int Avancer(int km, int vitesse){
        return (int)(((float)km / vitesse) * 60);
    }

    public boolean AjouterPassager(){
        /*if(NbPassager == NbPlace) return false;
        NbPassager++;
        return true;*/

        return this.AjouterPassager(1);
    }
    public boolean AjouterPassager(int NbPassager){
        if(this.NbPassager == NbPlace) return false;
        this.NbPassager+=NbPassager;
        return true;
    }

    public boolean AjouterPassager(String passagerName){
        if(this.AjouterPassager()){
            System.out.println("Bienvenu à bord "+passagerName+"!");
            return true;
        }
        System.out.println("Désolé, "+passagerName+", plus de place à bord!");
        return false;
    }
}
