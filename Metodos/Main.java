public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso("5°2°");
        Estudiante estudiante1 = new Estudiante("Juan Elias Suarez Chavez", "12345678", 8.5);
        Estudiante estudiante2 = new Estudiante("Maria Lopez", "87654321", 9.0);
        Estudiante estudiante3 = new Estudiante("Carlos Perez", "11223344", 7.5);

        curso.inscribir(estudiante1);
        curso.inscribir(estudiante2);
        curso.inscribir(estudiante3);

        curso.darDeBaja(1);

        System.out.println("Cantidad de alumnos: " + curso.cantidadAlumnos());
        curso.listarAlumnos();
    }
}
