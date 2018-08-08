
public class OrderItem {
	// Properties
	private int id;
	private Book book;
	private int quantity;
	
	public OrderItem() {
	}

	public OrderItem(Book book, int quantity) {
		this.book = book;
		this.quantity = quantity;
	}

	public Book getBook() {
		return this.book;
	}
}
