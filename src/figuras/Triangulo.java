package figuras;

public class Triangulo extends Figura {
	
	private double altura;
	private double base;
	
	public Triangulo(String color, double altura, double base) {
		super(color);
		this.altura=altura;
		this.base=base;
	}
	
	public double area() {
		double area = altura*base/2;
		return area;
	}
	
	public String toString() {
		return "El triángulo es:\n" + super.toString() + "\n Área: " + this.area();
	}	
}