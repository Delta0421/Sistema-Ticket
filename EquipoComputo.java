public class EquipoComputo {

    private int idEquipo;
    private String ubicacion;
    private String estado;

    public EquipoComputo(int idEquipo, String ubicacion, String estado) {
        this.idEquipo = idEquipo;
        this.ubicacion = ubicacion;
        this.estado = estado;
    }

    public String obtenerInformacion() {
        return "Equipo " + idEquipo + " en " + ubicacion + " estado: " + estado;
    }

    // Getters y Setters
    public int getIdEquipo() { return idEquipo; }

    public void setIdEquipo(int idEquipo) { 
        this.idEquipo = idEquipo; 
        }

    public String getUbicacion() { return ubicacion; }

    public void setUbicacion(String ubicacion) { 
        this.ubicacion = ubicacion; 
        }

    public String getEstado() { return estado; }
    
    public void setEstado(String estado) { 
        this.estado = estado; 
        }
}
