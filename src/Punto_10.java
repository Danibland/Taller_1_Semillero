
public class Punto_10 extends Taller_1 {

	public static void ejecutar() {

		int num1 = 0, num2 = 1, num3;
		
		System.out.print(num1 + " " + num2);
		
		for (int i = 2; i < 20; i++) {
			
			num3 = num1 + num2;
			
			System.out.print(" " + num3);
			
			num1 = num2;
			num2 = num3;
		}

	}

}
