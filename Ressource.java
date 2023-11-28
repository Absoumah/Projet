public abstract class Ressource {
    private String nom;
    private int qte;
    public Ressource(String nom, int qte){
        this.nom=nom;
        this.qte=qte;
    }

    public String getNom() {
        return nom;
    }

    public int getQte() {
        return qte;
    }
}