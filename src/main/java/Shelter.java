import java.util.ArrayList;

public class Shelter {

   private ArrayList<Resident> residents = new ArrayList<>();


   public void addResident(Resident resident){
      residents.add(resident);
      //Todo add method to decrease funds from bank

   }

   public void removeResident(Resident resident){
      residents.remove(resident);
   }

   public void showAllResidents(){
      for (Resident resident: residents) {
         resident.printDetails();
      }
   }
}
