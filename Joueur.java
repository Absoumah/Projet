public class Joueur {
    private String nom;
    private Commande ajouterBat;
    private Commande ajouterWorker;


    public Joueur(String nom){
        this.nom = nom;
        ajouterBat = new AjouterBat();
        ajouterWorker = new AjouterWorker();
    }

    public void AjouterBat(){
        ajouterBat.execute();
    }

    public void ajouterWorker(){
        ajouterWorker.execute();
    }



}
