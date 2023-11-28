public class Personne {
    private static int ID = 0;
    private int id;
    private String status;

    public Personne(String status){
        this.id= ++ID;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }
}
