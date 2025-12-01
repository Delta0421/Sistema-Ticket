import java.util.ArrayList;
import java.util.Date;

public class Incidencia {

    private int idIncidencia;
    private String descripcion;
    private String tipoIncidencia;
    private String prioridad;
    private String estado;
    private Date fechaReporte;
    private Date fechaCierre;
    private Usuario usuario;
    private Tecnico tecnicoAsignado;
    private EquipoComputo equipo;
    private ArrayList<RegistroHistorico> historial;

    public Incidencia(int idIncidencia, String descripcion, String tipoIncidencia,
                      String prioridad, Usuario usuario, EquipoComputo equipo) {

        this.idIncidencia = idIncidencia;
        this.descripcion = descripcion;
        this.tipoIncidencia = tipoIncidencia;
        this.prioridad = prioridad;
        this.estado = EstadoIncidencia.REPORTADA;
        this.fechaReporte = new Date();
        this.usuario = usuario;
        this.equipo = equipo;
        this.historial = new ArrayList<>();
    }

    public void asignarTecnico(Tecnico tecnico) {
        this.tecnicoAsignado = tecnico;
        agregarRegistro(new RegistroHistorico(new Date(), "Asignación de técnico", tecnico.getNombre()));
    }

    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        agregarRegistro(new RegistroHistorico(new Date(), "Cambio de estado a " + nuevoEstado, "Sistema"));
    }

    public void cambiarPrioridad(String nuevaPrioridad) {
        this.prioridad = nuevaPrioridad;
        agregarRegistro(new RegistroHistorico(new Date(), "Cambio de prioridad", "Sistema"));
    }

    public void agregarRegistro(RegistroHistorico registro) {
        historial.add(registro);
    }

    // Getters y Setters

    public int getIdIncidencia() { return idIncidencia; }
    public void setIdIncidencia(int idIncidencia) { this.idIncidencia = idIncidencia; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public String getTipoIncidencia() { return tipoIncidencia; }
    public void setTipoIncidencia(String tipoIncidencia) { this.tipoIncidencia = tipoIncidencia; }

    public String getPrioridad() { return prioridad; }
    public void setPrioridad(String prioridad) { this.prioridad = prioridad; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public Date getFechaReporte() { return fechaReporte; }
    public void setFechaReporte(Date fechaReporte) { this.fechaReporte = fechaReporte; }

    public Date getFechaCierre() { return fechaCierre; }
    public void setFechaCierre(Date fechaCierre) { this.fechaCierre = fechaCierre; }

    public Usuario getUsuario() { return usuario; }
    public void setUsuario(Usuario usuario) { this.usuario = usuario; }

    public Tecnico getTecnicoAsignado() { return tecnicoAsignado; }
    public void setTecnicoAsignado(Tecnico tecnicoAsignado) { this.tecnicoAsignado = tecnicoAsignado; }

    public EquipoComputo getEquipo() { return equipo; }
    public void setEquipo(EquipoComputo equipo) { this.equipo = equipo; }

    public ArrayList<RegistroHistorico> getHistorial() { return historial; }
    public void setHistorial(ArrayList<RegistroHistorico> historial) { this.historial = historial; }
}
