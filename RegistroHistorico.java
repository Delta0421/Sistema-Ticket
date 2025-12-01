import java.util.Date;

public class RegistroHistorico {

    private Date fecha;
    private String accion;
    private String realizadoPor;

    public RegistroHistorico(Date fecha, String accion, String realizadoPor) {
        this.fecha = fecha;
        this.accion = accion;
        this.realizadoPor = realizadoPor;
    }

    public String obtenerDetalle() {
        return fecha + " - " + accion + " por " + realizadoPor;
    }

    public Date getFecha() { return fecha; }

    public void setFecha(Date fecha) { 
        this.fecha = fecha;
        }

    public String getAccion() { return accion; }

    public void setAccion(String accion) { 
        this.accion = accion; 
        }

    public String getRealizadoPor() { return realizadoPor; }
    
    public void setRealizadoPor(String realizadoPor) {
        this.realizadoPor = realizadoPor; 
        }
}
