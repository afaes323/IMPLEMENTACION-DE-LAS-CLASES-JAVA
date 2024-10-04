import java.sql.Time;

public class Servicio {
    private int idServicio;
    private String nombreServicio;
    private float precio;
    private Time duracion;

    public Servicio consultarServicio() {
        // consultar un servicio
        return this;
    }

    public void modificarServicio() {
        // modificar un servicio
    }

    public void eliminarServicio() {
        // eliminar un servicio
    }

    // getters y setters
    public int getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
    }

    public String getNombreServicio() {
        return nombreServicio;
    }

    public void setNombreServicio(String nombreServicio) {
        this.nombreServicio = nombreServicio;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Time getDuracion() {
        return duracion;
    }

    public void setDuracion(Time duracion) {
        this.duracion = duracion;
    }
}
