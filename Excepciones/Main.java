import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Mundial miMundial = new Mundial();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Selecciones");
        DirectorTecnico scaloni = new DirectorTecnico("Scaloni");
        Seleccion argentina = new Seleccion("Argentina", "Sudamerica", 9, 26, "Clasificado", scaloni);
        miMundial.agregarSeleccion(argentina);

        DirectorTecnico pele = new DirectorTecnico("Pele");
        Seleccion equipoChico = new Seleccion("Peru", "Sudamerica", 1, 12, "Fase de Grupos", pele);
        miMundial.agregarSeleccion(equipoChico);

        System.out.println("Convocados: ");
        try {
            Seleccion invalida = new Seleccion("Haiti", "Africa", 0, 67, "Eliminado", null);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Posicion: ");
        miMundial.consultarPorPosicion(1);
        miMundial.consultarPorPosicion(5);

        System.out.println("Partidos: ");

        for (Seleccion s : miMundial.getSelecciones()) {
            try {
                s.disputarPartido();
            } catch (ReproduccionException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
