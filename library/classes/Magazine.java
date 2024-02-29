package Library.Classes;

// Magazine(Subclass) inherit from Book (Superclass)
public class Magazine extends Book {
	
	//Magazine Attributes
	// Private Variables so that they can only be accessed within the same class
	private String publisher;
	private String publishMonthYear;

	// Default Constructor
	Magazine() {
	}

	// Parameterized Constructor
	public Magazine(String id, String title,  String publisher, String publishMonthYear, String name, String matric, String dateStart, String dateEnd) {
		super(id, title, name, matric, dateStart, dateEnd);
		this.publisher = publisher;
		this.publishMonthYear = publishMonthYear;
	}

	// Accessors
	public String getPublisher() {
		return publisher;
	}

	public String getpublishMonthYear() {
		return publishMonthYear;
	}

}
