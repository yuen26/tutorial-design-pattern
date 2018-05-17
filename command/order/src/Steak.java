public class Steak implements Order {

    private SteakChef chef;

    public Steak(SteakChef chef) {
        this.chef = chef;
    }

    @Override
    public void execute() {
    	chef.makeSteak();
    }
    
    @Override
	public String toString() {
		return "steak";
	}
    
}
