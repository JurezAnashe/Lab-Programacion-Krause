import java.util.Random;
import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(10);
        }

        System.out.print("Los numeros son: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]);
        }
        System.out.println();

        System.out.println("\nTenes 2 segundos para memorizar los numeros...");
        Thread.sleep(2000);

        for (int i = 0; i < 50; i++) {
            System.out.println();
        }

        System.out.println("Ingresa los 5 numeros en el orden correcto:");

        int[] intentos = new int[5];
        boolean correcto = true;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            intentos[i] = scanner.nextInt();

            if (intentos[i] != numeros[i]) {
                correcto = false;
            }
        }

        System.out.print("Numeros originales: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]);
        }
        System.out.println();

        System.out.print("Tu respuesta:        ");
        for (int i = 0; i < intentos.length; i++) {
            System.out.print(intentos[i]);
        }
        System.out.println();

        if (correcto) {
            System.out.println("\nganaste el juego");
        } else {
            System.out.println("\nperdiste el juego");
        }

        scanner.close();
    }
}
