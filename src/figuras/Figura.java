package figuras;

public class Figura {
	
	private String color;
	
	public Figura() {
		
	}
	
	public Figura(String color) {
		this.color = color;
	}
	
	public void setColor(String color) {
		this.color=color;
	}
	
	public String toString() {
		return "Color: " + this.color;
	}
	
	public double area() {
		return 0;
	}
}
