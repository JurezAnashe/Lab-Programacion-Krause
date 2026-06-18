import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }

    public void agregarP(Producto p) {
        productos.add(p);
    }

    public void mostrarP() {
        for (Producto p : productos) {
            System.out.println("Nombre: " + p.nombre);
            System.out.println("Codigo: " + p.codigo);
            System.out.println("Precio: " + p.precio);
        }
    }

    public void cantidadP() {
        System.out.println("Productos: " + productos.size());
    }
}
