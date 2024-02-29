package Services;

// Import validator
import Validator.Validator;

// Import all classes
import Library.Classes.*;

// Import java.util packages
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// ServiceImpl implements the ServiceInterface
public class ServiceImpl implements ServiceInterface {

        // Validator(make sure input is correct)
        Validator validator = new Validator();

        // Creating arrayList for resizable array for elements
        // Declaring arrayList of Magazine type and Thesis Type Respectively
        List<Magazine> magazinesList = new ArrayList<>();
        List<Thesis> thesesList = new ArrayList<>();

        // To get user input
        Scanner sc = new Scanner(System.in);

        // Add borrowed book method (Implementation of addBorrowedBook abstract method)
        public void addBorrowedBook() {

                // Obtain correct inputs from user
                String id = validator.validateId();
                String title = validator.validateTitle();
                String name = validator.validateName();
                String matric = validator.validateMatric();
                String dateStart = validator.validateDateStart();
                String dateEnd = validator.validateDateEnd();
                char ch;

                // Ensure that there is no incorrect inputs
                do {
                        System.out.println("\n\nM = Magazine\n" +
                                        "T = Thesis\n");
                        System.out.print("Enter Type of Book(M/T): ");

                        ch = sc.next().charAt(0);

                        if (ch != 'M' && ch != 'T') {
                                System.out.println("\nPlease Enter Valid Choice\n");
                        }

                } while (ch != 'M' && ch != 'T');

                switch (ch) {

                        // Add Magazine
                        case 'M':
                                String publisher = validator.validatePublisher();
                                String publishMonth = validator.validatePublishMonth();

                                // Create object of class "Magazine"
                                // Parameterized constructor call
                                // Class variables are instantly initialized
                                Magazine magazine = new Magazine(id, title, publisher, publishMonth, name, matric,
                                                dateStart, dateEnd);

                                // Object is added into the arrayList, "magazinesList"
                                magazinesList.add(magazine);
                                System.out.println("\nBook Added Successfully !!!\n");
                                break;

                        // Add Thesis
                        case 'T':
                                String university = validator.validateUniversity();
                                String supervisor = validator.validateSupervisor();

                                // Create object of class "Thesis"
                                // Parameterized constructor call
                                // Class variables are instantly initialized
                                Thesis thesis = new Thesis(id, title, university, supervisor, name, matric, dateStart,
                                                dateEnd);

                                // Object is added into the arrayList, "thesesList"
                                thesesList.add(thesis);
                                System.out.println("\nBook Added Successfully !!!\n");
                                break;
                }
        }

        // Show all borrowed book method (Implementation of showAllBorrowedBook abstract
        // method)
        public void showAllBorrowedBook() {

                boolean storageTheses = false;
                boolean storageMagazines = false;

                // Show Magazines
                // Printing out all the Magazines in magazineList
                System.out.println("\n\n\nMAGAZINES");
                System.out.println(
                                "\n-------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.format("%-8s | %-20s | %-20s | %-20s | %-20s | %-15s | %-20s | %-8s", "ID", "TITLE", "PUBLISHER",
                                "PUBLISHED(MMYY)", "BORROWER NAME", "MATRIC NUMBER", "DATE START(DDMMYY)",
                                "DATE END(DDMMYY)\n");

                // Traversing through the arrayList, "magazinesList"
                for (Magazine magazine : magazinesList) {
                        System.out.println(
                                "-------------------------------------------------------------------------------------------------------------------------------------------------------------------");

                        // Read all Magazines class attributes of magazine using accessors
                        System.out.format("%-8s | %-20s | %-20s | %-20s | %-20s | %-15s | %-20s | %-8s",
                                        magazine.getId(), magazine.getTitle(),
                                        magazine.getPublisher(), magazine.getpublishMonthYear(), magazine.getName(),
                                        magazine.getMatric(), magazine.getdateStart(),
                                        magazine.getdateEnd());

                        System.out.println("\n");
                        storageMagazines = true;
                }
                System.out.println(
                        "-------------------------------------------------------------------------------------------------------------------------------------------------------------------");

                if (storageMagazines == false) {
                        System.out.println("\nThere are no Magazines Borrowed\n");
                        System.out.println(
                                "\n-------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                }

                // Show Theses
                // Printing out all the Thesis in thesesList
                System.out.println("\n\n\nTHESIS");
                System.out.println("\n-------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.format("%-8s | %-20s | %-20s | %-20s | %-20s | %-15s | %-20s | %-8s", "ID", "TITLE", "UNIVERSITY",
                                "SUPERVISOR", "BORROWER NAME", "MATRIC NUMBER", "DATE START(DDMMYY)",
                                "DATE END(DDMMYY)\n");

                // Traversing through the arrayList, "thesesList"
                for (Thesis thesis : thesesList) {
                        System.out.println(
                                        "\n-------------------------------------------------------------------------------------------------------------------------------------------------------------------");

                        // Read all Thesis class attributes of thesis using accessors
                        System.out.format("%-8s | %-20s | %-20s | %-20s | %-20s | %-15s | %-20s | %-8s", thesis.getId(),
                                        thesis.getTitle(),
                                        thesis.getUniversity(), thesis.getSupervisor(), thesis.getName(),
                                        thesis.getMatric(), thesis.getdateStart(),
                                        thesis.getdateEnd());

                        System.out.println("\n");
                        storageTheses = true;
                }
                System.out.println(
                                "-------------------------------------------------------------------------------------------------------------------------------------------------------------------");

                // If arrayList, "thesesList" is empty
                if (storageTheses == false) {
                        System.out.println("\nThere are no Thesis Borrowed\n");
                        System.out.println(
                                        "\n-------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                }
        }

        // Return borrowed book method (Implementation of returnBook abstract method)
        public void returnBook() {

                char ch;

                System.out.println("Please enter the type of the book to return : ");
                do {
                        System.out.println("\n\nM = Magazine\n" +
                                        "T = Thesis\n");
                        System.out.print("Enter Type of Book(M/T): ");

                        ch = sc.next().charAt(0);

                        if (ch != 'M' && ch != 'T') {
                                System.out.println("\nPlease Enter Valid Choice\n");
                        }

                } while (ch != 'M' && ch != 'T');

                switch (ch) {

                        // Remove Magazine
                        case 'M':
                                boolean availableMagazine = false;
                                int i = 0;

                                String magazineCheck = validator.validateId();

                                // Traversing through the arrayList, "magazinesList"
                                for (Magazine magazine : magazinesList) {
                                        if (magazine.getId().equals(magazineCheck)) {
                                                int j = i;
                                                System.out.println(
                                                        "\n-------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                System.out.format("%-8s | %-20s | %-20s | %-20s | %-20s | %-15s | %-20s | %-8s",
                                                                magazine.getId(),
                                                                magazine.getTitle(),
                                                                magazine.getPublisher(),
                                                                magazine.getpublishMonthYear(),
                                                                magazine.getName(),
                                                                magazine.getMatric(),
                                                                magazine.getdateStart(),
                                                                magazine.getdateEnd());

                                                System.out.println("\n");
                                                availableMagazine = true;

                                                // Removing element at j th position from magazinesList
                                                magazinesList.remove(j);
                                                System.out.println("Magazine has been returned successfully.\n");
                                                break;
                                        } else
                                                i++;
                                }
                                System.out.println(
                                                "\n-------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                if (availableMagazine == false) {
                                        System.out.println("\nThe magazine is not returnable.\n");
                                        System.out.println(
                                                        "\n-------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                }
                                break;

                        // Remove Thesis
                        case 'T':
                                boolean availableThesis = false;
                                int k = 0;

                                String thesisCheck = validator.validateId();
                                for (Thesis thesis : thesesList) {
                                        if (thesis.getId().equals(thesisCheck)) {
                                                int l = k;
                                                System.out.println(
                                                                "\n-------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                System.out.format("%-8s | %-20s | %-20s | %-20s | %-20s | %-15s | %-20s | %-8s", thesis.getId(),
                                                                thesis.getTitle(),
                                                                thesis.getUniversity(),
                                                                thesis.getSupervisor(),
                                                                thesis.getName(),
                                                                thesis.getMatric(),
                                                                thesis.getdateStart(),
                                                                thesis.getdateEnd());
                                                System.out.println("\n");
                                                availableThesis = true;

                                                // Removing element at l th position from thesesList
                                                thesesList.remove(l);
                                                System.out.println("Thesis has been returned successfully.\n");
                                                break;
                                        } else
                                                k++;
                                }
                                System.out.println(
                                                "\n-------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                if (availableThesis == false) {
                                        System.out.println("\nThe thesis is not returnable.\n");
                                        System.out.println(
                                                        "\n-------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                }
                                break;
                }
        }

        // Renew borrowed book's due date method (Implementation of returnBook abstract
        // method)
        public void renewDate() {

                char ch;

                System.out.println("Please enter the type of the book to renew due date : ");
                do {
                        System.out.println("\n\nM = Magazine\n" +
                                        "T = Thesis\n");
                        System.out.print("Enter Type of Book(M/T): ");

                        ch = sc.next().charAt(0);

                        if (ch != 'M' && ch != 'T') {
                                System.out.println("\nPlease Enter Valid Choice\n");
                        }

                } while (ch != 'M' && ch != 'T');

                switch (ch) {

                        // renew Magazine's Borrow Due
                        case 'M':
                                boolean availableMagazine = false;
                                int i = 0;

                                String magazineCheck = validator.validateId();

                                // Traversing through the arrayList, "magazinesList"
                                for (Magazine magazine : magazinesList) {
                                        if (magazine.getId().equals(magazineCheck)) {
                                                int j = i;
                                                System.out.println(
                                                                "\n-------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                System.out.format("%-8s | %-20s | %-20s | %-20s | %-20s | %-15s | %-20s | %-8s", magazine.getId(),
                                                                magazine.getTitle(),
                                                                magazine.getPublisher(),
                                                                magazine.getpublishMonthYear(),
                                                                magazine.getName(),
                                                                magazine.getMatric(),
                                                                magazine.getdateStart(),
                                                                magazine.getdateEnd());

                                                System.out.println("\n");
                                                availableMagazine = true;

                                                // Updating element at j th position from magazinesList
                                                magazinesList.get(j);

                                                // Using Setters to Update
                                                magazine.setdateStart(validator.validateDateStart());
                                                magazine.setdateEnd(validator.validateDateEnd());

                                                System.out.println(
                                                                "Magazine's borrow due has been renewed successfully.\n");
                                                break;
                                        } else
                                                i++;
                                }
                                System.out.println(
                                                "\n-------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                if (availableMagazine == false) {
                                        System.out.println("\nThe magazine's borrow due is not renewable.\n");
                                        System.out.println(
                                                        "\n-------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                }
                                break;

                        // renew Thesis's Borrow Due
                        case 'T':
                                boolean availableThesis = false;
                                int k = 0;

                                String thesisCheck = validator.validateId();
                                for (Thesis thesis : thesesList) {
                                        if (thesis.getId().equals(thesisCheck)) {
                                                int l = k;
                                                System.out.println(
                                                                "\n-------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                System.out.format("%-8s | %-20s | %-20s | %-20s | %-20s | %-15s | %-20s | %-8s", thesis.getId(),
                                                                thesis.getTitle(),
                                                                thesis.getUniversity(),
                                                                thesis.getSupervisor(),
                                                                thesis.getName(),
                                                                thesis.getMatric(),
                                                                thesis.getdateStart(),
                                                                thesis.getdateEnd());
                                                System.out.println("\n");
                                                availableThesis = true;

                                                // Removing element at l th position from thesesList
                                                thesesList.get(l);

                                                // Using Setters to Update
                                                thesis.setdateStart(validator.validateDateStart());
                                                thesis.setdateEnd(validator.validateDateEnd());

                                                System.out.println(
                                                                "Thesis's borrow due has been renewed successfully.\n");
                                                break;
                                        } else
                                                k++;
                                }
                                System.out.println(
                                                "\n-------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                if (availableThesis == false) {
                                        System.out.println("\nThe thesis's borrow due is not renewable.\n");
                                        System.out.println(
                                                        "\n-------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                }
                                break;
                }
        }
}
