public class Cliente {
    private int idCliente;
    private String nombre;
    private String telefono;
    private String email;
    private String preferencias;

    public void registrarCliente() {
        // registrar un cliente
    }

    public void modificarCliente() {
        // modificar un cliente
    }

    public int consultarCliente() {
        // consultar un cliente
        return idCliente;
    }

    public void eliminarCliente() {
        // eliminar un cliente
    }

    // getters y setters
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPreferencias() {
        return preferencias;
    }

    public void setPreferencias(String preferencias) {
        this.preferencias = preferencias;
    }
}
