import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int total = 0;
		int[] num = new int[10];
		for (int i = 0; i < 10; i++) {
			System.out.println("Ingrese un numero: ");
			num[i] = scanner.nextInt();

		}

		for (int i = 0; i < 10; i++) {

			total = total + num[i];

		}
		System.out.println("La suma es: " + total);

		scanner.close();

	}

}
