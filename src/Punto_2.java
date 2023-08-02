import java.util.Scanner;

public class Punto_2 extends Taller_1 {

	public static void ejecutar() {

		Scanner scanner = new Scanner(System.in);

		imprimir("Ingrese un numero: ");

		int num = scanner.nextInt();

		if (num % 2 == 0) {
			imprimir("El numero es par");
		} else {
			imprimir("El numero es impar");
		}

		scanner.close();
	}

}
