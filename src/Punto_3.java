import java.util.Scanner;

public class Punto_3 extends Taller_1 {

	public static void ejecutar() {

		Scanner scanner = new Scanner(System.in);

		imprimir("Ingresa el radio del circulo: ");

		double radio = scanner.nextDouble();

		double area = Math.PI * Math.pow(radio, 2);
		double perimetro = 2 * Math.PI * radio;

		imprimir("El area del circulo es: " + area + "\n");
		imprimir("El perimetro del circulo es: " + perimetro);

		scanner.close();

	}
}
