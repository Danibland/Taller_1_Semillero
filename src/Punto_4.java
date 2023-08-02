import java.util.Scanner;

public class Punto_4 extends Taller_1 {

	public static void ejecutar() {

		Scanner scanner = new Scanner(System.in);

		imprimir("Ingrese su edad: ");

		int edad = scanner.nextInt();

		if (edad >= 18) {
			imprimir("Eres mayor de edad");
		} else {
			imprimir("Eres menor de edad");
		}

		scanner.close();

	}

}
