public class festival {
    private String nombre;

    public festival(String nombre) {
        this.nombre = nombre;
    }

    public void realizarSoundcheck(cantante cantante) throws EspectaculoCortoException {
        if (cantante.getCancionesProgramadas() < 5) {
            throw new EspectaculoCortoException("El show de " + cantante.getNombre() +
                    " debe tener minimo 5 canciones. Canciones programadas: " + cantante.getCancionesProgramadas());
        }
        System.out.println(
                "Soundcheck aprobado para " + cantante.getNombre() + " con " + cantante.getCancionesProgramadas()
                        + " canciones programadas");
    }
}
