package task6;
public class LeafyGreen extends Vegetable {
	private String types;
	
	public LeafyGreen (double weight, double price, String types) {
		super(weight, price);
		this.setTypes(types);
	}
	public String getTypes() {
		return types;
	}
	public void setTypes(String types) {
		this.types = types;
	}
}
