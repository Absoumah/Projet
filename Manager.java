import java.util.ArrayList;

public class Manager implements Listener {

   private ArrayList<Building> listeBatiment;

   public Manager(){
    this.listeBatiment = new ArrayList<>();
   }

   public ArrayList<Building> getListeBatiment() {
       return listeBatiment;
   }

   @Override
   public void update() {
       // TODO Auto-generated method stub
       
   }

}
