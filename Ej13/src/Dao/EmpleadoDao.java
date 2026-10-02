package src.Dao;

import src.model.Empleado;
import java.util.List;

public interface EmpleadoDao {
    void Crear(Empleado empleado);

    Empleado BuscarPorDni(String dni);

    List<Empleado> ListarTodo();

    java.sql.Connection ConexionBd() throws java.sql.SQLException;
}