package figuras;

public class Circulo extends Figura {
	
	private double radio;
	
	public Circulo(String color, double radio) {

		super(color);
		this.radio=radio;			
		
	}
	
	public double area() {

			double area;
			area = Math.PI*radio*radio;

		
		return area;
	}
	
	public String toString() {
		return "El círculo es:\n" + super.toString() + "\nÁrea: " + this.area();
	}
	
	public double aumentarArea(double aumento) {
		
		double area;
		this.radio = radio + aumento;
		
		area = Math.PI*radio*radio;
		
		return area;
	}
	
	
}