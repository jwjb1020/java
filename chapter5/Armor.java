package chapter5;

public class Armor {
	private int height;
	private String name;
	private int weight;
	private String color;
	private boolean isFly;

	public void setName() {
		String value = "mark6";
		name = value;
	}

	public String getName() {
		if(name == null) {
			return "NO Name";
		}
		return name;
		
	}
}
