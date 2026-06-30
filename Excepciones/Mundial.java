import java.util.ArrayList;

public class Mundial {
    private ArrayList<Seleccion> Selecciones;

    public ArrayList<Seleccion> getSelecciones() {
        return Selecciones;
    }

    public Mundial() {
        this.Selecciones = new ArrayList<>();
    }

    public void agregarSeleccion(Seleccion s) {
        Selecciones.add(s);
    }

    public void consultarPorPosicion(int indice) {
        try {
            Seleccion s = Selecciones.get(indice);
            System.out.println("La seleccione esta en la posicion" + indice + ":" + s);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("La posicion " + indice + " no existe en el sistema.");
        } finally {
            System.out.println();
        }
    }
}