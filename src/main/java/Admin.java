import java.util.Scanner;

public class Admin {

    Scanner scan = new Scanner(System.in);
    int adminInput;



    public void adminMenu(Shelter shelter) {


        System.out.println("Welcome Admin");
        System.out.println("What would you like to do?");

        System.out.println("1. Update resident status.\n" +
                "2. View pending applications.\n" +
                "3. View all residents.\n" +
                "4. View all employees.\n" +
                "5. View all volunteers.\n" +
                "6. View the current budget.\n" +
                "7. Return to main menu");

        adminInput = scan.nextInt();

        do {
            switch (adminInput) {
                case 1:
                    System.out.println("Here is a list of the pending applicants.");

                    break;
                case 2:
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
        } while (true);

    }

}
