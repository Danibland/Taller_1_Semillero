import java.util.Scanner;

public class Punto_1 extends Taller_1 {

	public static void ejecutar(){

		Scanner scanner = new Scanner(System.in);

		int num1 = 0, num2 = 0, suma = 0, resta = 0, mult = 0, div;

		imprimir("Ingrese el primer numero: ");

		num1 = scanner.nextInt();

		imprimir("Ingrese el segundo numero: ");

		num2 = scanner.nextInt();

		suma = num1 + num2;
		resta = num1 - num2;
		mult = num1 * num2;
		div = num1 / num2;

		imprimir("El resultado de la suma es: " + suma);
		imprimir("El resultado de la resta es: " + resta);
		imprimir("El resultado de la multiplicacion es: " + mult);
		imprimir("El resultado de la division es: " + div);

		scanner.close();
		
		
	}


}
