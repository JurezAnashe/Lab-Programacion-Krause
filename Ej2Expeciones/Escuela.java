import java.util.ArrayList;

public class Escuela {
    private ArrayList<Alumno> listaAlumnos;

    public Escuela() {
        this.listaAlumnos = new ArrayList<>();
    }

    public void agregarAlumno(Alumno a) {
        listaAlumnos.add(a);
    }

    public void consultarAlumnoPorIndice(int i) {
        try {
            Alumno alu = listaAlumnos.get(i);
            System.out.println("El alumno esta en la posicion " + i + ": " + alu);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("La posicion " + i + " no existe");
        }
    }

    public void consultarTutorDelAlumno(int i) {
        try {
            Alumno alu = listaAlumnos.get(i);
            if (alu.getTutor() == null) {
                throw new NullPointerException("El alumno no tiene un tutor registrado");
            }
            System.out.println("Tutor de " + alu.getApellido() + ", " + alu.getNombre() + ": " + alu.getTutor());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Posicion fuera de rango al buscar tutor");
        }
    }

    public Alumno obtenerAlumno(int i) {
        if (i >= 0 && i < listaAlumnos.size()) {
            return listaAlumnos.get(i);
        }
        return null;
    }
}