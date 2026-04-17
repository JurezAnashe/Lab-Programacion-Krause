public class Operario2 extends Empleado2 {
    protected double ValorHoraExtra;

    public Operario2(int legajo, double sueldoBase, double ValorHoraExtra) {
        super(legajo, sueldoBase);
        this.ValorHoraExtra = ValorHoraExtra;
    }
}
