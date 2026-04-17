public class Libro3 extends Producto3 {
    private String autor;

    public Libro3(int codigo, double precio, String autor) {
        super(codigo, precio);
        this.autor = autor;
    }

    @Override
    public double calcularPrecioFinal() {
        return getPrecio();
    }
}