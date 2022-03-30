package figuras;

public class Cuadrado extends Figura {
	
	private double lado;
	
	public Cuadrado(String color, double lado) {
		super(color);
		this.lado=lado;
	}
	
	public double area() {
		double area;
		area=lado*lado;
		return area;
	}
	
	public String toString() {
		return "El cuadrado es:\n" + super.toString() + "\n Área: " + this.area();
	}
}