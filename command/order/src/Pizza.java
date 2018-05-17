public class Pizza implements Order {

    private PizzaChef chef;

    public Pizza(PizzaChef chef) {
        this.chef = chef;
    }

    @Override
    public void execute() {
        chef.makePizza();
    }

	@Override
	public String toString() {
		return "pizza";
	}
    
}