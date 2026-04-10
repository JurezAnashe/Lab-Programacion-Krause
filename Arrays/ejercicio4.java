package tp;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] num = new int[10];

		for (int i = 0; i < 10; i++) {
			System.out.print("Ingrese un nuevo numero: ");
			num[i] = scanner.nextInt();

		}

		int prom = 0;
		for (int i = 0; i < 10; i++) {
			prom = prom + num[i];

		}

		System.out.println("El promedio es: " + prom / 10);
	}

}
