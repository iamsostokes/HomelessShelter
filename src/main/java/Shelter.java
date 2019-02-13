import java.util.ArrayList;

public class Shelter {

    private ArrayList<Resident> residents = new ArrayList<>();


    public void addResident(Resident resident) {
        residents.add(resident);
        //Todo add method to decrease funds from bank

    }

    public void removeResident(Resident resident) {
        residents.remove(resident);
    }

    public void showAllResidents() {
        for (Resident resident : residents) {
            resident.printDetails();
        }
    }

    public void viewPendingApplication() {
        for (Resident resident: residents) {
            if (resident.getResidentStatus().equalsIgnoreCase("pending")){
                System.out.println("     ");
                resident.printDetails();
            }
        }
    }

    public void changeApplicantStatus(int profileNumber) {
        for (int i = 0; i < residents.size(); i++) {
            if (profileNumber == residents.get(i).getProfileNumber()){
                residents.get(i).setResidentStatus("current");
            }
        }
    }

}
