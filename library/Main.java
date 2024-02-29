package Library;

import Services.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner choice = new Scanner(System.in);


        ServiceInterface service = new ServiceImpl();

        do {
            System.out.println("\n\nWelcome to Tunku Tun Aminah Library\n");
            System.out.println("1. Add Borrowed Book\n" +
                    "2. Show All Borrowed Books\n" +
                    "3. Return Book\n" +
                    "4. Renew Date\n" +
                    "5. Exit");

            System.out.print("Enter Your Choice: ");
            int ch = choice.nextInt();

            switch (ch) {

                // Add Borrowed Book
                case 1:
                    service.addBorrowedBook();
                    break;

                // Show all Borrowed Book
                case 2:
                    service.showAllBorrowedBook();
                    break;

                // Return Book
                case 3:
                    service.returnBook();
                    break;

                // Update Date
                case 4:
                    service.renewDate();
                    break;

                // Exit System
                case 5:
                    System.out.println("\nThank you for Using System !!");
                    choice.close();
                    System.exit(0);

                // 
                // Invalid Input
                default:
                    System.out.println("\nPlease Enter Valid Choice\n");

            }
        } while (true);
    }
}