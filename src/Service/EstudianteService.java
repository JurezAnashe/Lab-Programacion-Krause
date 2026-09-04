package src.Service;

import src.Dao.Estudiantedao;
import src.Dao.DaoImpl.EdaoImpl;
import src.model.Estudiante;

public class EstudianteService {

    private final Estudiantedao estudiantedao;

    public EstudianteService() {
        this.estudiantedao = new EdaoImpl();
    }

    public void registrarEstudiante(String nombre, String apellido, String dni, String curso) {

        Estudiante e = new Estudiante(nombre, apellido, dni, curso);
        this.estudiantedao.Crear(e);

    }

    public void listar() {
        estudiantedao.ListarTodo();
    }

    public void Registrar(String nombre, String apellido, int dni, String curso) {
        registrarEstudiante(nombre, apellido, String.valueOf(dni), curso);
    }

    public void Actualizar(int id, String nombre, String apellido, int dni, String curso) {
        Estudiante estudiante = new Estudiante(nombre, apellido, String.valueOf(dni), curso);
        estudiante.setId(id);
        estudiantedao.Actualizar(estudiante);
    }

    public void Eliminar(int id) {
        estudiantedao.Eliminar(id);
    }

    public Estudiante ListarPorId(int id) {
        return estudiantedao.ListarPorId(id);
    }

    public void ListarTodo() {
        estudiantedao.ListarTodo();
    }

}
