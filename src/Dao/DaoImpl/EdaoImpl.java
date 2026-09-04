package src.Dao.DaoImpl;

import src.Dao.Estudiantedao;
import src.model.Estudiante;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EdaoImpl implements Estudiantedao {

    private static final String url = "jdbc:mysql://localhost:3306/ej12";
    private static final String user = "root";
    private static final String password = "usbw";

    @Override
    public Connection ConexionBd() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }

    @Override
    public void Crear(Estudiante e) {
        String sql = "INSERT INTO estudiante (nombre, apellido, dni, curso) VALUES (?, ?, ?, ?)";

        try (Connection cx = ConexionBd();
                PreparedStatement ps = cx.prepareStatement(sql)) {

            ps.setString(1, e.getNombre());
            ps.setString(2, e.getApellido());
            ps.setString(3, e.getDni());
            ps.setString(4, e.getCurso());

            ps.executeUpdate();
            System.out.println("Estudiante guardado correctamente con el ID: " + e.getId());

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public Estudiante ListarPorId(int id) {
        String sql = "SELECT id, nombre, apellido, dni, curso FROM estudiante WHERE id = ?";
        Estudiante estudiante = null;

        try (Connection cx = ConexionBd();
                PreparedStatement ps = cx.prepareStatement(sql)) {

            ps.setInt(1, id);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    estudiante = new Estudiante(
                            rs.getString("nombre"),
                            rs.getString("apellido"),
                            rs.getString("dni"),
                            rs.getString("curso"));
                }
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return estudiante;
    }

    @Override
    public List<Estudiante> ListarTodo() {
        String sql = "SELECT id, nombre, apellido, dni, curso FROM estudiante";
        List<Estudiante> lista = new ArrayList<>();

        try (Connection cx = ConexionBd();
                PreparedStatement ps = cx.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Estudiante estudiante = new Estudiante(
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getString("dni"),
                        rs.getString("curso"));
                lista.add(estudiante);
            }

            for (Estudiante e : lista) {
                System.out.println(e);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return lista;
    }

    @Override
    public void Actualizar(Estudiante e) {
        String sql = "UPDATE estudiante SET nombre = ?, apellido = ?, dni = ?, curso = ? WHERE id = ?";

        try (Connection cx = ConexionBd();
                PreparedStatement ps = cx.prepareStatement(sql)) {

            ps.setString(1, e.getNombre());
            ps.setString(2, e.getApellido());
            ps.setString(3, e.getDni());
            ps.setString(4, e.getCurso());
            ps.setInt(5, e.getId());

            int filas = ps.executeUpdate();
            if (filas > 0) {
                System.out.println("Estudiante con ID " + e.getId() + " actualizado con éxito.");
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void Eliminar(int id) {
        String sql = "DELETE FROM estudiante WHERE id = ?";

        try (Connection cx = ConexionBd();
                PreparedStatement ps = cx.prepareStatement(sql)) {

            ps.setInt(1, id);

            int filas = ps.executeUpdate();
            if (filas > 0) {
                System.out.println("Estudiante con elID " + id + " eliminado.");
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}