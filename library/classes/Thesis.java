package Library.Classes;

// Thesis(Subclass) inherit from Book (Superclass)
public class Thesis extends Book {

	// Thesis Attributes
	// Private Variables so that they can only be accessed within the same class
	private String university;
	private String supervisor;

	// Default Constructor
	Thesis() {
	}

	// Parameterized Constructor
	public Thesis(String id, String title, String university, String supervisor, String name, String matric, String dateStart, String dateEnd) {
		super(id, title, name, matric, dateStart, dateEnd);
		this.university = university;
		this.supervisor = supervisor;
	}

	// Accessors
	public String getUniversity() {
		return university;
	}

	public String getSupervisor() {
		return supervisor;
	}
}
