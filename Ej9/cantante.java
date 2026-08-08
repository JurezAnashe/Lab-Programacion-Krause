public class cantante implements contratable {
    private String nombre;
    private String generoMusical;
    private int cachet;
    private int cancionesProgramadas;
    private String nombreManager;

    public cantante(String nombre, String generoMusical, int cachet, int cancionesProgramadas, String nombreManager) {
        this.nombre = nombre;
        this.generoMusical = generoMusical;
        this.cachet = cachet;
        this.cancionesProgramadas = cancionesProgramadas;
        this.nombreManager = nombreManager;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCancionesProgramadas() {
        return cancionesProgramadas;
    }

    public String getNombreManager() {
        return nombreManager;
    }

    @Override
    public void liquidarHonorarios(double impuestos) throws IllegalArgumentException {
        if (impuestos < 0 || impuestos > 100) {
            throw new IllegalArgumentException(
                    "El porcentaje de impuesto no puede ser negativo ni mayor que el 100%: " + impuestos);
        }
        double montoFinal = this.cachet - (this.cachet * (impuestos / 100.0));
        System.out.println(
                "Honorarios liquidados para " + nombre + ": $" + montoFinal + " Impuesto: " + impuestos + "%");
    }

    @Override
    public void asignarEscenario(String nombreEscenario) throws NullPointerException {
        if (nombreEscenario == null) {
            throw new NullPointerException("El nombre del escenario no puede ser nulo");
        }
        System.out.println("Artista " + nombre + " asignado al escenario: " + nombreEscenario);
    }

    public void mostrarInfoManager() {
        System.out.println("Manager de " + nombre + ": " + nombreManager.toUpperCase());
    }
}