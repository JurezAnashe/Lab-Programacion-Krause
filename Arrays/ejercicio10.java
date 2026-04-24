import java.util.Random;
import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        String[] palabras = { "benedetto", "pavon", "cristiano", "messi", "maradona", "pele", "ronaldo", "zidane" };

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        String palabra = palabras[random.nextInt(palabras.length)];
        char[] descubierta = new char[palabra.length()];

        descubierta[0] = palabra.charAt(0);
        for (int i = 1; i < palabra.length(); i++) {
            descubierta[i] = '_';
        }

        int errores = 0;
        int erroresmax = 9;

        System.out.println("adivina la palabra");
        System.out.println("tenes " + errores + " intentos");

        while (errores < erroresmax) {
            System.out.print("palabra: ");
            for (int i = 0; i < descubierta.length; i++) {
                System.out.print(descubierta[i] + " ");
            }
            System.out.println("  (" + errores + " intentos)");

            boolean gano = true;
            for (int i = 0; i < descubierta.length; i++) {
                if (descubierta[i] == '_') {
                    gano = false;
                    break;
                }
            }

            if (gano) {
                System.out.println("\nadivinaste la palabra: " + palabra);
                break;
            }

            System.out.print("escribi una letra: ");
            String entrada = scanner.next();

            char letra = entrada.charAt(0);
            boolean acierto = false;

            for (int i = 0; i < palabra.length(); i++) {
                if (palabra.charAt(i) == letra && descubierta[i] == '_') {
                    descubierta[i] = letra;
                    acierto = true;
                }
            }

            if (acierto) {
                System.out.println("la letra " + letra + " esta en la palabra\n");
            } else {
                errores++;
                System.out.println("la letra " + letra + " no esta en la palabra\n");
            }
        }

        if (errores >= erroresmax) {
            System.out.println("\nno tenes mas intentos, la palabra era: " + palabra);
        }

        scanner.close();
    }
}
