public class Empleado {
    private int idEmpleado;
    private String nombre;
    private String rol;
    private String turno;

    public void registrarEmpleado() {
        // registrar un empleado
    }

    public void modificarEmpleado() {
        // modificar un empleado
    }

    public Empleado consultarEmpleado() {
        // consultar un empleado
        return this;
    }

    public void eliminarEmpleado() {
        // eliminar un empleado
    }

    // getters y setters
    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
}
