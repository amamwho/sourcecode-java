import java.util.Date;

class Order2 {
	// Properties
	private int id;
	double totalPrice = 0;
	double discountPrice;
	double netPrice;
	private OrderItem[] items = new OrderItem[2];
	private Date orderDate;
	private int counter;
	
	public void addItem(OrderItem item) {
		this.items[counter++] = item;
	}

	public OrderItem[] getItems() {
		return this.items;
	}
	
	public void calTotalPrice() {
		for(OrderItem orderItem : this.items ) {
			Book book = orderItem.getBook();
			this.totalPrice += book.getPrice();
		}
	}

	public void calDiscountPrice() {
	}

	public void calNetPrice() {
	}
}


class OrderBuilder {
	Order2 order = new Order2();
	
	public OrderBuilder addItem(OrderItem item) {
		order.addItem(item);
		return this;
	}

	public Order2 build() {
		return order;
	}
	
}

public class Order {
	public static void main(String[] args) {
		Order2 order = new OrderBuilder()
				.addItem(new OrderItem(new Book("First", 8), 1))
				.addItem(new OrderItem(new Book("Second", 8), 1))
				.build();
		
		order.calTotalPrice();
		order.calDiscountPrice();
		order.calNetPrice();
		
		System.out.println(order.totalPrice);
		System.out.println(order.discountPrice);
		System.out.println(order.netPrice);
	}
}