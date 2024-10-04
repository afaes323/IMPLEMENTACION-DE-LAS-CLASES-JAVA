import java.util.Date;
import java.util.List;

public class Informe {
    private int idInforme;
    private String tipoInforme;
    private Date fechaGeneracion;
    private List<Cita> citas;

    public Informe generarInforme() {
        // generar un informe
        return this;
    }

    public Informe consultarInforme() {
        // consultar un informe
        return this;
    }

    // getters y setters
    public int getIdInforme() {
        return idInforme;
    }

    public void setIdInforme(int idInforme) {
        this.idInforme = idInforme;
    }

    public String getTipoInforme() {
        return tipoInforme;
    }

    public void setTipoInforme(String tipoInforme) {
        this.tipoInforme = tipoInforme;
    }

    public Date getFechaGeneracion() {
        return fechaGeneracion;
    }

    public void setFechaGeneracion(Date fechaGeneracion) {
        this.fechaGeneracion = fechaGeneracion;
    }

    public List<Cita> getCitas() {
        return citas;
    }

    public void setCitas(List<Cita> citas) {
        this.citas = citas;
    }
}
