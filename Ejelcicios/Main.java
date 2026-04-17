public class Main {
    public static void main(String[] args) {
        Libro3 libro1 = new Libro3(101, 2500, "Aura");
        ArticuloPapeleria hojas = new ArticuloPapeleria(202, 5000, "Papel");

        System.out.println("Precio final del libro: $" + libro1.calcularPrecioFinal());
        System.out.println("Precio final de la papeleria: $" + hojas.calcularPrecioFinal());
        System.out.println("Codigo del libro: " + libro1.codigo);
    }
}