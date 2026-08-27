import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class entidad {

    public static void insertar() {
        String sql = "INSERT INTO vendedores(id, nombre, apellido, dni, rubro, actual) VALUES(?, ?, ?, ?, ?, ?)";

        try (Connection cx = balerinacapuchina.conectar();
                PreparedStatement ps = cx.prepareStatement(sql)) {

            ps.setInt(1, 1);
            ps.setString(2, "Aaron");
            ps.setString(3, "Serrano");
            ps.setString(4, "12345678");
            ps.setString(5, "Farmeador de aura");
            ps.setBoolean(6, true);
            ps.executeUpdate();

            ps.setInt(1, 2);
            ps.setString(2, "Papu");
            ps.setString(3, "Gomez");
            ps.setString(4, "11223344");
            ps.setString(5, "Papeador");
            ps.setBoolean(6, true);
            ps.executeUpdate();

            ps.setInt(1, 3);
            ps.setString(2, "Messi");
            ps.setString(3, "Lionel");
            ps.setString(4, "9122018");
            ps.setString(5, "Sigma");
            ps.setBoolean(6, false);
            ps.executeUpdate();

            ps.setInt(1, 4);
            ps.setString(2, "Cristiano");
            ps.setString(3, "Ronaldo");
            ps.setString(4, "2662011");
            ps.setString(5, "Loly");
            ps.setBoolean(6, true);
            ps.executeUpdate();

            ps.setInt(1, 5);
            ps.setString(2, "Lucas");
            ps.setString(3, "Juarez");
            ps.setString(4, "49008231");
            ps.setString(5, "Futbol");
            ps.setBoolean(6, true);
            ps.executeUpdate();

            System.out.println("Registros insertados correctamente");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void actualizar() {
        String sql = "UPDATE vendedores SET apellido = ?, rubro = ? WHERE id = ?";

        try (Connection cx = balerinacapuchina.conectar();
                PreparedStatement ps = cx.prepareStatement(sql)) {

            ps.setString(1, "Gomez (modificado)");
            ps.setString(2, "Tartamudo");
            ps.setInt(3, 2);

            int filasAfectadas = ps.executeUpdate();
            System.out.println("Filas actualizadas: " + filasAfectadas);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void borrar() {
        String sql = "DELETE FROM vendedores WHERE id = ?";

        try (Connection cx = balerinacapuchina.conectar();
                PreparedStatement ps = cx.prepareStatement(sql)) {

            ps.setInt(1, 4);

            int filasAfectadas = ps.executeUpdate();
            System.out.println("Filas eliminadas: " + filasAfectadas);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void leer() {
        String query = "SELECT * FROM vendedores";

        try (Connection cx = balerinacapuchina.conectar();
                PreparedStatement ps = cx.prepareStatement(query);
                ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String dni = rs.getString("dni");
                String rubro = rs.getString("rubro");
                boolean actual = rs.getBoolean("actual");

                System.out
                        .println(id + " - " + nombre + " - " + apellido + " - " + dni + " - " + rubro + " - " + actual);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}