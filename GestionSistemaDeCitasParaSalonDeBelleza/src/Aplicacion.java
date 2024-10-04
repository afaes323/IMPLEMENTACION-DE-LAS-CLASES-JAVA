public class Aplicacion {
    public static void main(String[] args) {
        BaseDeDatos db = new BaseDeDatos("jdbc:mysql://localhost:3306/proyecto citas", "salon", "7654321");

        // ejemplo de la clase Cliente
        Cliente nuevoCliente = new Cliente();
        nuevoCliente.setNombre("Ramon Perez");
        nuevoCliente.setTelefono("123456789");
        nuevoCliente.setEmail("ramon_Perez@gmail.com");
        nuevoCliente.setPreferencias("Corte de cabello");

        db.agregarCliente(nuevoCliente); // agregar cliente

        Cliente clienteConsultado = db.obtenerCliente(1); // consultar cliente con ID 1
        if (clienteConsultado != null) {
            System.out.println("Cliente consultado: " + clienteConsultado.getNombre());
        } else {
            System.out.println("Cliente no encontrado.");
        }

        nuevoCliente.setTelefono("987654321");
        db.modificarCliente(nuevoCliente); // modificar cliente

        db.eliminarCliente(1); // eliminar cliente con ID 1

        db.cerrarConexion(); // cerrar conexion
    }
}
