import java.util.Scanner;

public class Admin {

    Scanner scan = new Scanner(System.in);
    int adminInput;


    public void adminMenu(Shelter shelter) {


        System.out.println("Welcome Admin");
        System.out.println("What would you like to do?");

        System.out.println(
                "1. View pending applications or approve pending applications.\n" +
                        "2. View all current residents.\n" +
                        "3. View all employees.\n" +
                        "4. View all volunteers.\n" +
                        "5. View the current budget.\n" +
                        "6. Return to main menu");

        adminInput = scan.nextInt();

        do {
            switch (adminInput) {
                case 1:
                    System.out.println("Here is a list of the pending applicants.");
                    shelter.viewPendingApplication();

                    System.out.println("Are there any applicants you would like to approve?  \n" +
                            "____________________________Enter 1 for yes or 2 for no___________________________________");
                    adminInput = scan.nextInt();
                    if (adminInput == 1) {

                        System.out.println("If you please enter the Profile Number of the applicant you would like to update.");
                        adminInput = scan.nextInt();
                        shelter.changeApplicantStatus(adminInput);

                    } else {
                        System.out.println("We can't find that resident!");
                    }


                    break;
                case 2:
                    System.out.println("Here is a list of all the current residents.");
                    shelter.viewCurrentResident();

                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                default:
                    System.out.println("sorry that is a invalid option.");
                    break;
            }
        } while (false);

    }


}

