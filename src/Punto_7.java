import java.util.Scanner;

public class Punto_7 extends Taller_1 {

	public static void ejecutar(){

		Scanner scanner = new Scanner(System.in);

		imprimir("Ingrese un numero: ");

		int num = scanner.nextInt();

		int mult = 0;

		for (int i = 1; i <= 10; i++) {
			mult = num * i;
			
			imprimir(num + " x " + i + " = " + mult);

		}

		scanner.close();
	}

}
