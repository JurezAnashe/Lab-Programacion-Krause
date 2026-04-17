public abstract class Producto3 {
    protected int codigo;
    private double precio;

    public Producto3(int codigo, double precio) {
        this.codigo = codigo;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public abstract double calcularPrecioFinal();
}