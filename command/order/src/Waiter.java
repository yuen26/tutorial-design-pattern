import java.util.ArrayList;
import java.util.List;

public class Waiter {

	private List<Order> orders = new ArrayList<>();
	
	public void takeOrder(Order order) {
		System.out.println("Waiter taked new order");
		orders.add(order);
		order.execute();
	}
	
}