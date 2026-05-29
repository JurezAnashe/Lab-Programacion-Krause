import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nombre;
    private List<Estudiante> alumnos;

    public Curso(String nombre) {
        this.nombre = nombre;
        this.alumnos = new ArrayList<>();
    }

    public void inscribir(Estudiante estudiante) {
        alumnos.add(estudiante);
    }

    public int cantidadAlumnos() {
        return alumnos.size();
    }

    public void darDeBaja(int indice) {
        alumnos.remove(indice);
    }

    public void listarAlumnos() {
        for (Estudiante alumno : alumnos) {
            alumno.mostrarFicha();
        }
    }
}
