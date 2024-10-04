import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BaseDeDatos {
    private Connection conexion;

    public BaseDeDatos(String url, String user, String password) {
        try {
            this.conexion = DriverManager.getConnection(url, user, password);
            System.out.println("Conexión exitosa a la base de datos.");
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
        }
    }

    // metodos CRUD para Cliente
    public void agregarCliente(Cliente cliente) {
        String sql = "INSERT INTO Cliente (nombre, telefono, email, preferencias) VALUES (?, ?, ?, ?)";
        try (PreparedStatement pstmt = conexion.prepareStatement(sql)) {
            pstmt.setString(1, cliente.getNombre());
            pstmt.setString(2, cliente.getTelefono());
            pstmt.setString(3, cliente.getEmail());
            pstmt.setString(4, cliente.getPreferencias());
            pstmt.executeUpdate();
            System.out.println("Cliente agregado exitosamente.");
        } catch (SQLException e) {
            System.out.println("Error al agregar cliente: " + e.getMessage());
        }
    }

    public Cliente obtenerCliente(int idCliente) {
        String sql = "SELECT * FROM Cliente WHERE idCliente = ?";
        Cliente cliente = null;
        try (PreparedStatement pstmt = conexion.prepareStatement(sql)) {
            pstmt.setInt(1, idCliente);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                cliente = new Cliente();
                cliente.setIdCliente(rs.getInt("idCliente"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setTelefono(rs.getString("telefono"));
                cliente.setEmail(rs.getString("email"));
                cliente.setPreferencias(rs.getString("preferencias"));
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener cliente: " + e.getMessage());
        }
        return cliente;
    }

    public void modificarCliente(Cliente cliente) {
        String sql = "UPDATE Cliente SET nombre = ?, telefono = ?, email = ?, preferencias = ? WHERE idCliente = ?";
        try (PreparedStatement pstmt = conexion.prepareStatement(sql)) {
            pstmt.setString(1, cliente.getNombre());
            pstmt.setString(2, cliente.getTelefono());
            pstmt.setString(3, cliente.getEmail());
            pstmt.setString(4, cliente.getPreferencias());
            pstmt.setInt(5, cliente.getIdCliente());
            pstmt.executeUpdate();
            System.out.println("Cliente modificado exitosamente.");
        } catch (SQLException e) {
            System.out.println("Error al modificar cliente: " + e.getMessage());
        }
    }

    public void eliminarCliente(int idCliente) {
        String sql = "DELETE FROM Cliente WHERE idCliente = ?";
        try (PreparedStatement pstmt = conexion.prepareStatement(sql)) {
            pstmt.setInt(1, idCliente);
            pstmt.executeUpdate();
            System.out.println("Cliente eliminado exitosamente.");
        } catch (SQLException e) {
            System.out.println("Error al eliminar cliente: " + e.getMessage());
        }
    }


    // Cerrar conexion
    public void cerrarConexion() {
        try {
            if (conexion != null && !conexion.isClosed()) {
                conexion.close();
                System.out.println("Conexión cerrada.");
            }
        } catch (SQLException e) {
            System.out.println("Error al cerrar la conexión: " + e.getMessage());
        }
    }
}
