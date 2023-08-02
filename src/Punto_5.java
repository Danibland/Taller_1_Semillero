import java.util.Scanner;

public class Punto_5 extends Taller_1 {

	public static void ejecutar(){

		Scanner scanner = new Scanner(System.in);

		int num1 = 0, num2 = 0;

		imprimir("Ingrese el primer numero: ");

		num1 = scanner.nextInt();

		imprimir("Ingrese el segundo numero: ");

		num2 = scanner.nextInt();

		if (num1 > num2) {
			imprimir("El numero mayor es:" + num1);
		} else {
			imprimir("El numero mayor es:" + num2);
		}
		scanner.close();

	}

}
