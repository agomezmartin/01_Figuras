package figuras;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class ProbarFigura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ENUNCIADO:
		// crear métodos propios en las clases HIJAS
		// ejecutar cada método propio de las clases HIJAS
		// utilizando un ARRAYLIST de FIGURAS haciendo CASTING para
		// elegir los métodos que queremos imprimir

		Circulo c = new Circulo("Verde", 4.5);
		Cuadrado cuad = new Cuadrado("Amarillo", 6.1);
		Triangulo t = new Triangulo("Naranja",5,3);
		
		ArrayList<Figura> listafiguras = new ArrayList<Figura>();
		listafiguras.add(t);
		listafiguras.add(cuad);
		listafiguras.add(c);

		System.out.println("\n--------\n");
		System.out.println("Se visualiza el método toString() de una figura usando el método GET de ArrayList:\n");
		System.out.println(listafiguras.get(2));
		

		System.out.println("\n--------\n");
		System.out.println("Se concatenan mensajes decodificados y polimorfismo que calcula el área de cada figura:\n");

		ResourceBundle resourceBundle = ResourceBundle.getBundle("figuras.resources");
		System.out.println(resourceBundle.getString("areaT") + t.area());
		System.out.println(resourceBundle.getString("areaC") + c.area());
		System.out.println(resourceBundle.getString("areaCuad") + cuad.area());
		
		
		System.out.println("\n--------\n");
		System.out.println("Se traduce a inglés los mensajes decodificados:\n");
		// la clase LOCALE permite ALMACENAR en un objeto el código del idioma
		Locale locale = new Locale("en","US");
		// la clase ResourceBundle permite SELECCIONAR el archivo que contiene las cadenas
		ResourceBundle resourceBundle_en_US = ResourceBundle.getBundle("figuras.resources", locale);

		System.out.println(resourceBundle_en_US.getString("areaCuad") + cuad.area());
		System.out.println(resourceBundle_en_US.getString("areaC") + c.area());
		System.out.println(resourceBundle_en_US.getString("areaT") + t.area());

		System.out.println("\n--------\n");
		System.out.println("Se aumenta el radio del círculo 5cm y se calcula el nuevo área:\n");
		c.aumentarArea(5);
		System.out.println(resourceBundle.getString("areaC") + c.area());

		System.out.println("\n--------\n");
		System.out.println("Se ejecuta desde el ArralyList el método Area() del Circulo:\n");

		System.out.println(resourceBundle.getString("areaT") + listafiguras.get(1).area());
		
		System.out.println("\n--------\n");
		System.out.println("Se ejecuta desde el ArralyList el método aumentarArea() del Circulo y se aumenta el área en 5cm:\n");

		System.out.println(resourceBundle.getString("areaNuevaC") + ((Circulo)listafiguras.get(2)).aumentarArea(5));

		System.out.println("\n--------\n");
		System.out.println("Se ejecuta desde el ArralyList el método cambiarColor() del Triángulo\nhaciendo casting ya que este método no es compartido por todas las clases\ny se traduce a inglés:\n");

		System.out.println(resourceBundle_en_US.getString("colorNuevoC") + ((Triangulo)listafiguras.get(0)).cambiarColor("light blue"));

		System.out.println("\n--------\n");
		System.out.println("Se ejecuta desde el ArralyList el método aumentarArea() del Circulo\nbuscando el método con un FOR:\n");

		System.out.println(resourceBundle_en_US.getString("colorNuevoC") + ((Triangulo)listafiguras.get(0)).cambiarColor("light blue"));

	}
}