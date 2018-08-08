
public class Book {
	// Properties
	private int id;
	private String name;
	private double price;
	
	// Constructor
	public Book() {
	}
	
	// Overload
	public Book(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	// Methods
	// Method creation
	public static Book createNewBookWithName(String name) {
		Book book = new Book();
		book.name = name;
		book.price = 8;
		return book;
	}
	
	// Method creation
	public static Book createNewBookWithNameAndPrice(String name, double price) {
		Book book = new Book();
		book.name = name;
		book.price = price;
		return book;
	}

	// Setter
	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getPrice() {
		return this.price;
	}
	
}

// Builder pattern
class BookBuilder {
	private Book book = new Book();

	public BookBuilder setName(String name) {
		book.setName(name);
		return this;
	}

	public BookBuilder setPrice(int price) {
		book.setPrice(price);
		return this;
	}
	
	public Book build() {
		return book;
	}
}

class BookStore {
	public static void main(String[] args) {
		Book book1 = new BookBuilder()
				.setName("First")
				.setPrice(8)
				.build();
		System.out.println(book1);
	}
}
