public class Usuario {

    private int idUsuario;
    private String nombre;
    private String correo;

    public Usuario(int idUsuario, String nombre, String correo) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.correo = correo;
    }

    public void reportarIncidencia(Incidencia incidencia) {
        System.out.println("Incidencia reportada por " + nombre);
    }

    public String obtenerDatos() {
        return nombre + " (" + correo + ")";
    }


    public int getIdUsuario() { return idUsuario; }

    public void setIdUsuario(int idUsuario) { 
        this.idUsuario = idUsuario; 
    }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { 
        this.nombre = nombre; 
    }

    public String getCorreo() { return correo; }

    public void setCorreo(String correo) { 
        this.correo = correo; 
    }
}
