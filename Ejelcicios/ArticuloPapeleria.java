public class ArticuloPapeleria extends Producto3 {
    private String tipoMaterial;

    public ArticuloPapeleria(int codigo, double precio, String tipoMaterial) {
        super(codigo, precio);
        this.tipoMaterial = tipoMaterial;
    }

    @Override
    public double calcularPrecioFinal() {
        return getPrecio() * 1.21;
    }
}