public class Alumno {
    private String dni;
    private String nombre;
    private String apellido;
    private String curso;
    private int inasistencias;
    private String estadoAcademico;
    private Tutor tutor;

    private final int faltas = 15;

    public Alumno(String dni, String nombre, String apellido, String curso, Tutor tutor) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.inasistencias = 0;
        this.estadoAcademico = "Regular";
        this.tutor = tutor;
    }

    public void registrarInasistencias(int cantidad) throws IllegalArgumentException, ReproduccionException {
        if (cantidad < 0) {
            throw new IllegalArgumentException("No pueden haber faltas negativas");
        }

        this.inasistencias += cantidad;

        if (this.inasistencias > faltas) {
            this.estadoAcademico = "Libre";
            throw new ReproduccionException(
                    "El alumno " + apellido + "" + nombre + " supero el limite de faltas q son:"
                            + faltas);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getInasistencias() {
        return inasistencias;
    }

    public String getEstadoAcademico() {
        return estadoAcademico;
    }

    public Tutor getTutor() {
        return tutor;
    }

    @Override
    public String toString() {
        return "Alumno: " + apellido + ", " + nombre + " DNI: " + dni + " Curso: " + curso +
                " Inasistencias: " + inasistencias + " Estado: " + estadoAcademico;
    }
}