package Library.Classes;

// Encapsulation (SuperClass)
public class Book {

    // Book Attributes
    // Private Variables so that they can only be accessed within the same class
    private String id;
    private String title;
    private String name;
    private String matric;
    private String dateStart;
    private String dateEnd;

    // No Arguments Constructor
    Book() {
        id = "0000";
        title = "DUMMYTEXT";
        name = "AAAAAA";
        matric = "AA000000";
        dateStart = "0000";
        dateEnd = "0000";
    }

    // Parameterized Constructor
    public Book(String id, String title, String name, String matric, String dateStart, String dateEnd) {
        this.id = id;
        this.title = title;
        this.name = name;
        this.matric = matric;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
    }
    // Mutators (Public Set Methods)
    public void setdateStart(String dateStart) {
        this.dateStart = dateStart;
    }
    public void setdateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
    }
    // Accessors (Public Get Methods)
    public String getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getName() {
        return name;
    }
    public String getMatric() {
        return matric;
    }
    public String getdateStart() {
        return dateStart;
    }
    public String getdateEnd() {
        return dateEnd;
    }
}

