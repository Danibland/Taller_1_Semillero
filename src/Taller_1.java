import java.util.Scanner;

public class Taller_1 {

	public static void imprimir(String dato) {
		System.out.println(dato);
	}

	public static void main(String[] args) {

		imprimir(
				"1. Realiza un programa que solicite al usuario dos números enteros y muestre su suma, resta, multiplicación y división.");
		imprimir("2. Escribe un programa que pida al usuario un número entero y determine si es par o impar.");
		imprimir(
				"3. Crea un programa que calcule y muestre el área y el perímetro de un círculo. El usuario debe proporcionar el radio del círculo.");

		imprimir("4. Pide al usuario su edad y muestra un mensaje indicando si es mayor de edad o menor de edad.");
		imprimir(
				"5. Realiza un programa que solicite al usuario dos números enteros y determine cuál es el mayor de ellos.");
		imprimir("6. Escribe un programa que pida al usuario un número y verifique si es positivo, negativo o cero.");
		imprimir(
				"7. Crea un programa que pida al usuario un número entero positivo y muestre su tabla de multiplicar hasta el 10.");
		imprimir(
				"8. Realiza un programa que simule un juego de adivinar un número. El programa debe generar un número aleatorio entre 1 y 100, y el usuario debe adivinarlo. El programa debe indicar si el número ingresado es mayor o menor que el número a adivinar.");
		imprimir("9. Escribe un programa que solicite al usuario un número entero positivo y calcule su factorial.");
		imprimir(
				"10. Crea un programa que muestre los primeros 20 números de la serie Fibonacci. La serie Fibonacci se forma sumando los dos números anteriores para obtener el siguiente número: 0, 1, 1, 2, 3, 5, 8, 13, …");
		imprimir(
				"11. Escribe un programa que calcule el área de un triángulo utilizando la fórmula de Herón. El usuario debe ingresar las longitudes de los tres lados.");
		imprimir(
				"12. Realiza un programa que pida al usuario un número entero y determine si es un número primo o no.");
		imprimir(
				"13. Pide al usuario un número decimal y muestra su valor redondeado a un número específico de decimales.");
		imprimir(
				"14. Escribe un programa que solicite al usuario un número entero positivo y verifique si es un número perfecto. Un número perfecto es aquel cuya suma de sus divisores propios (excluyendo al propio número) es igual al número.");
		imprimir(
				"15. Crea un programa que pida al usuario un número entero y determine si es un número capicúa. Un número capicúa es aquel que se lee igual de izquierda a derecha que de derecha a izquierda.");
		imprimir(
				"16. Realiza un programa que calcule e imprima la serie de Fibonacci hasta un número dado ingresado por el usuario.");
		imprimir(
				"17. Pide al usuario dos números enteros y muestra todos los números primos que se encuentran en ese rango.");
		imprimir(
				"18. Crea un programa que genere una contraseña aleatoria de 8 caracteres que contenga letras mayúsculas, letras minúsculas y dígitos. Puedes utilizar la clase Math para generar números aleatorios y la clase String para manipular la contraseña.");
		imprimir(
				"19. Escribe un programa que solicite al usuario su nombre y luego lo imprima en mayúsculas y minúsculas");
		imprimir("20. Realiza un programa que solicite al usuario una cadena y luego invierta su orden");
		imprimir("21. Pide al usuario una cadena y muestra cuántas veces aparece una letra específica en ella \n");

		try (Scanner scanner = new Scanner(System.in)) {

			System.out.print("Ingrese la opcion: ");

			int opc = scanner.nextInt();

			switch (opc) {
			case 1: {

				Punto_1.ejecutar();
				break;

			}
			case 2: {
				Punto_2.ejecutar();
				break;
			}
			case 3: {
				Punto_3.ejecutar();
				break;
			}
			case 4: {
				Punto_4.ejecutar();
				break;
			}
			case 5: {
				Punto_5.ejecutar();
				break;
			}
			case 6: {
				Punto_6.ejecutar();
				break;
			}
			case 7: {
				Punto_7.ejecutar();
				break;
			}
			case 8: {
				Punto_8.ejecutar();
				break;
			}
			case 9: {
				
				Punto_9.ejecutar();
				break;
			}
			case 10: {
				
				Punto_10.ejecutar();
				break;
			}
			


			}
		}

	}

	

}
