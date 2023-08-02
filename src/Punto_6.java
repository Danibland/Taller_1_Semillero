import java.util.Scanner;

public class Punto_6 extends Taller_1 {

	public static void ejecutar(){

		Scanner scanner = new Scanner(System.in);

		imprimir("ingrese un numero: ");

		int num = scanner.nextInt();

		if (num > 0) {
			System.out.println("El numero " + num + " es positivo.");
		} else if (num < 0) {
			System.out.println("El numero " + num + " es negativo.");
		} else {
			System.out.println("El numero es: " + num);
		}

		scanner.close();

	}
}
