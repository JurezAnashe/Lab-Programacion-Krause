public class Gerente2 extends Empleado2 {
    protected double BonoResponsabilidad;

    public Gerente2(int legajo, double sueldoBase, double BonoResponsabilidad) {
        super(legajo, sueldoBase);
        this.BonoResponsabilidad = BonoResponsabilidad;
    }
}
