import java.sql.Time;
import java.util.Date;

public class Cita {
    private int idCita;
    private Date fecha;
    private Time hora;
    private Cliente cliente;
    private Servicio servicio;
    private Empleado empleado;

    public void crearCita() {
        // crear una cita
    }

    public void modificarCita() {
        // modificar una cita
    }

    public Cita consultarCita() {
        // consultar una cita
        return this;
    }

    public void cancelarCita() {
        // cancelar una cita
    }

    // getters y setters
    public int getIdCita() {
        return idCita;
    }

    public void setIdCita(int idCita) {
        this.idCita = idCita;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
}
