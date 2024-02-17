package Initial;

import java.util.Scanner;

public class HomeSelectHotelType {
    public static void main(String[] args) {
        displayOption();
        Util util = new Util();
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Create an account");
        System.out.println("2. Exit");
        System.out.print("Enter your choice: ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:System.out.println("welcome To Registration ");
                util.registerAccount();
                break;
            case 2:
                System.out.println("Exiting the program.");
                break;
            default:
                System.out.println("Invalid choice. Exiting the program.");
        }

        scanner.close();
    }


    public static void displayOption() {
        System.out.println("        1. Register an Account");
        System.out.println("        2. Book Reservation");
        System.out.println("        3. Generate Bill");
        System.out.println("        4. Feedback");
        System.out.println("        5. Exit");
        System.out.println("Please Select Your Preferred Choice:");
        //hello


    }
}


