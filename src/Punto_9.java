import java.util.Scanner;

public class Punto_9 extends Taller_1 {

	public static void ejecutar() {

		int num = 0;

		int factorial = 1;

		Scanner scanner = new Scanner(System.in);

		imprimir("Ingrese un numero: ");

		num = scanner.nextInt();

		for (int i = 1; i <= num; i++) {

			factorial *= i;
		}

		imprimir("El factorial de " + num + " es: " + factorial);
		
		scanner.close();

	}

}
