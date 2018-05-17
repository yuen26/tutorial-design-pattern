public class Customer {

    public static void main(String[] args) {
    	// Invoker
    	Waiter waiter = new Waiter();
    	
    	// Receivers
    	PizzaChef pizzaChef = new PizzaChef();
    	SteakChef steakChef = new SteakChef();
    	
    	// Commands
    	Order pizza = new Pizza(pizzaChef);
    	Steak steak = new Steak(steakChef);
    	
    	// Test
    	waiter.takeOrder(pizza);
    	waiter.takeOrder(steak);
    }
    
}