import java.util.Scanner;

public class HomelessShelterDemo {
    public static void main(String[] args) {
        Shelter shelter = new Shelter();
        Scanner scan = new Scanner(System.in);
        int userInput;
        String adminPassword = "1234";
        Boolean running = false;
        int profileNumber = 100;


        System.out.println("Welcome to the Homeless Shelter");
        System.out.println("Are you a future resident or a donor? Enter 1 for Resident or 2 for Donor");
        userInput = scan.nextInt();
        scan.nextLine();



        do {

            switch (userInput) {
                case 1:

                    System.out.println("We would love to have you in our shelter.  Please fill out this information: ");
                    System.out.println("What is your first name?");
                    String fName = scan.nextLine();

                    System.out.println("What is your last name?");
                    String lName = scan.nextLine();

                    System.out.println("What is your age?");
                    int age = scan.nextInt();

                    System.out.println("Is there any additional information we should know?");
                    scan.nextLine();
                    String additionalInfo = scan.nextLine();

                    Resident newResident = new Resident(fName, lName, age, additionalInfo, profileNumber);
                    profileNumber++;

                    shelter.addResident(newResident);
                    shelter.showAllResidents();

                    break;
                case 2:
                    break;
                default:
                    System.out.println("Sorry not a valid option.");
                    break;
            }

        } while (!running);
    }

}
