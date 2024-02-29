package Validator;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Validator {
    Scanner sc = new Scanner(System.in);

    // Validators for books
    private static Pattern ID_PATTERN = Pattern.compile("^\\d{1,6}$");
    private static Pattern Title_Pattern = Pattern.compile("^[a-zA-Z ]+$");
    private static Pattern Name_Pattern = Pattern.compile("^[a-zA-Z ]+$");
    private static Pattern Matric_Pattern = Pattern.compile ("^[A-Z,0-9,-]{8}$");
    private static Pattern DateStart_Pattern = Pattern.compile("^\\d{6}$");
    private static Pattern DateEnd_Pattern = Pattern.compile("^\\d{6}$");

    // Validators for magazines
    private static Pattern Publisher_Pattern = Pattern.compile("^[a-zA-Z ]+$");
    private static Pattern PublishMonthYear_Pattern = Pattern.compile("^\\d{4}$");

    // Validators for theses
    private static Pattern University_Pattern = Pattern.compile("^[a-zA-Z ]+$");
    private static Pattern Supervisor_Pattern = Pattern.compile("^[a-zA-Z ]+$");

    public String validateId() {
        String id;

        while (true) {
            System.out.print("Enter ID(1-6): ");
            id = sc.nextLine();
            if (!ID_PATTERN.matcher(id).matches()) {
                System.out.println("SORRY! PLEASE ENTER VALID ID");
            } else {
                break;
            }
        }
        return id;
    }

    public String validateTitle() {
        String title;

        while (true) {
            System.out.print("Enter Title: ");
            title = sc.nextLine();
            if (!Title_Pattern.matcher(title).matches()) {
                System.out.println("SORRY! PLEASE ENTER VALID TITLE");
            } else {
                break;
            }

        }
        return title;
    }

    public String validateName() {
        String name;

        while (true) {
            System.out.print("Enter Name of Borrower: ");
            name = sc.nextLine();
            if (!Name_Pattern.matcher(name).matches()) {
                System.out.println("SORRY! PLEASE ENTER VALID NAME OF BORROWER");
            }else {
                break;
            }
        }
        return name;
    }

    public String validateMatric() {
        String matric;

        while (true) {
            System.out.print("Enter Matric Number of Borrower: ");
            matric = sc.nextLine();
            if (!Matric_Pattern.matcher(matric).matches()) {
                System.out.println("SORRY! PLEASE ENTER VALID MATRIC NUMBER");
            }else {
                break;
            }
        }
        return matric;
    }

    public String validateDateStart() {
        String dateStart;

        while (true) {
            System.out.print("Enter Date Start(DDMMYY): ");
            dateStart = sc.nextLine();
            if (!DateStart_Pattern.matcher(dateStart).matches()) {
                System.out.println("SORRY! PLEASE ENTER VALID DATE START");
            } else {
                break;
            }
        }
        return dateStart;
    }

    public String validateDateEnd() {
        String dateEnd;

        while (true) {
            System.out.print("Enter Date End(DDMMYY): ");
            dateEnd = sc.nextLine();
            if (!DateEnd_Pattern.matcher(dateEnd).matches()) {
                System.out.println("SORRY! PLEASE ENTER VALID DATE END");
            } else {
                break;
            }
        }
        return dateEnd;
    }

    public String validatePublisher() {
        String publisher;
        while (true) {
            System.out.print("Enter Publisher: ");
            publisher = sc.nextLine();
            if (!Publisher_Pattern.matcher(publisher).matches()) {
                System.out.println("SORRY! PLEASE ENTER VALID PUBLISHER");
            } else {
                break;
            }

        }
        return publisher;
    }

    public String validatePublishMonth() {
        String publishMonthYear;

        while (true) {
            System.out.print("Enter Publish Month and Year of Magazine (MMYY): ");
            publishMonthYear = sc.nextLine();
            if (!PublishMonthYear_Pattern.matcher(publishMonthYear).matches()) {
                System.out.println("SORRY! PLEASE ENTER VALID MONTH AND YEAR");
            } else {
                break;
            }
        }
        return publishMonthYear;
    }

    public String validateUniversity() {
        String university;

        while (true) {
            System.out.print("Enter University: ");
            university = sc.nextLine();
            if (!University_Pattern.matcher(university).matches()) {
                System.out.println("SORRY! PLEASE ENTER VALID UNIVERSITY");
            } else {
                break;
            }
        }
        return university;
    }

    public String validateSupervisor() {
        String supervisor;

        while (true) {
            System.out.print("Enter Supervisor: ");
            supervisor = sc.nextLine();
            if (!Supervisor_Pattern.matcher(supervisor).matches()) {
                System.out.println("SORRY! PLEASE ENTER VALID SUPERVISOR");
            } else {
                break;
            }
        }
        return supervisor;
    }

}
