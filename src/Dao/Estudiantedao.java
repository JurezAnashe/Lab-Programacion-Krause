package src.Dao;

import java.util.List;

import src.model.Estudiante;

public interface Estudiantedao {
    void Crear(Estudiante e);

    void Actualizar(Estudiante e);

    void Eliminar(int id);

    Estudiante ListarPorId(int id);

    List<Estudiante> ListarTodo();

    java.sql.Connection ConexionBd() throws java.sql.SQLException;
}