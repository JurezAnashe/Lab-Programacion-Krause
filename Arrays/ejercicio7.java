package tpn1;

import java.util.Scanner;

public class ejercicio7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int usuario;
        int maquina;

        while (true) {
            maquina = (int) (Math.random() * 3) + 1;

            System.out.println("1 piedra 2 papel 3 tijera");
            System.out.println("ingrese una opcion");
            usuario = sc.nextInt();

            if (usuario == maquina) {
                System.out.println("empate");
                continue;
            } else if ((usuario == 1 && maquina == 3) ||
                    (usuario == 2 && maquina == 1) ||
                    (usuario == 3 && maquina == 2)) {
                System.out.println("ganaste");
                break;
            } else {
                System.out.println("perdiste");
                break;
            }
        }

        sc.close();
    }
}
