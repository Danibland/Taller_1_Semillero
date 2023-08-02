import java.util.Random;
import java.util.Scanner;

public class Punto_8 extends Taller_1 {

	public static void ejecutar(){
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		int num = 0;
		int min = 1;
		int max = 100;
		int numrandom = random.nextInt(max - min + 1) + min;

		System.out.println(numrandom);

		do {

			imprimir("Ingrese un numero: ");

			num = scanner.nextInt();

			if (num > numrandom) {
				System.out.println("El numero ingresado es mayor");
			} else if (num < numrandom) {
				System.out.println("El numero ingresado es menor");
			}
		} while (num != numrandom);
		
		imprimir("Acertaste");

		scanner.close();

	}

}
