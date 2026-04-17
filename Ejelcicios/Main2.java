public class Main2 {
    public static void main(String[] args) {
        Empleado2 empleado1 = new Empleado2(123, 912);
        Operario2 operario1 = new Operario2(456, 18, 166);
        Gerente2 gerente1 = new Gerente2(789, 30, 12);

        System.out.println("Empleado: Legajo " + empleado1.legajo + " sueldo base " + empleado1.sueldoBase);
        System.out.println("Operario: Legajo " + operario1.legajo + " sueldo base " + operario1.sueldoBase
                + " valor hora extra " + operario1.ValorHoraExtra);
        System.out.println("Gerente: Legajo " + gerente1.legajo + " sueldo base " + gerente1.sueldoBase
                + " bono responsabilidad " + gerente1.BonoResponsabilidad);
    }
}
