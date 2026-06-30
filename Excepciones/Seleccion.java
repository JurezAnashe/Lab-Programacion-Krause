// Clase Seleccion.java
public class Seleccion {
    private String nombre;
    private String continente;
    private int puntos;
    private int convocados;
    private String estadoClasificacion;
    private DirectorTecnico dt;

    public Seleccion(String nombre, String continente, int puntos, int convocados, String estadoClasificacion,
            DirectorTecnico dt) {
        this.nombre = nombre;
        this.continente = continente;
        this.puntos = puntos;
        validarConvocados(convocados);
        this.estadoClasificacion = estadoClasificacion;
        this.dt = dt;
    }

    private void validarConvocados(int convocados) {
        if (convocados < 1 || convocados > 26) {
            throw new IllegalArgumentException("Tiene que ser entre 1 y 26 jugadores");
        }
        this.convocados = convocados;
    }

    public void disputarPartido() throws ReproduccionException {
        if (this.convocados < 11) {
            throw new ReproduccionException(
                    "La seleccion " + nombre + " no puede jugar porque solo tiene " + convocados + " jugadores");
        }
        System.out.println(nombre + " esta jugando el partido");
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public DirectorTecnico getDt() {
        return dt;
    }

    @Override
    public String toString() {
        return "Seleccion: " + nombre + " Continente: " + continente + " Puntos: " + puntos +
                " Convocados: " + convocados + " Estado: " + estadoClasificacion;
    }
}