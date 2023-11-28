import java.util.ArrayList;

public abstract class Building{
    private static int ID = 0;
    private int id;
    private String nom;
    private int population;
    private int travailleurs;
    private ArrayList<Ressource> listeRessource;
    private ArrayList<Personne> listePersonne;
    private ArrayList<Personne> listeTravailleurs;

    public Building(String nom, int population, int travailleurs){
        this.id=++ID;
        this.nom=nom;
        this.population=population;
        this.travailleurs=travailleurs;
        listeRessource = new ArrayList<>();
        listeRessource.initialiserListeRessource();
        listePersonne = new ArrayList<>();
        listePersonne.initialiserListePers();

    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public int getPopulation() {
        return population;
    }

    public int getTravailleurs() {
        return travailleurs;
    }

    public ArrayList<Personne> getListePersonne() {
        return listePersonne;
    }

    public ArrayList<Ressource> getListeRessource() {
        return listeRessource;
    }


}