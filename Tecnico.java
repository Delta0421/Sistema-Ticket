import java.util.ArrayList;

public class Tecnico {

    private int idTecnico;
    private String nombre;
    private String especialidad;
    private ArrayList<Incidencia> incidenciasAsignadas;

    public Tecnico(int idTecnico, String nombre, String especialidad) {
        this.idTecnico = idTecnico;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.incidenciasAsignadas = new ArrayList<>();
    }

    public void asignarIncidencia(Incidencia incidencia) {
        incidenciasAsignadas.add(incidencia);
    }

    public void resolverIncidencia(Incidencia incidencia) {
        System.out.println("Incidencia " + incidencia.getIdIncidencia() + " resuelta.");
        incidenciasAsignadas.remove(incidencia);
    }




    public int getIdTecnico() { return idTecnico; }

    public void setIdTecnico(int idTecnico) { 
        this.idTecnico = idTecnico; 
        }


    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { 
        this.nombre = nombre; 
        }


    public String getEspecialidad() { return especialidad; }

    public void setEspecialidad(String especialidad) { 
        this.especialidad = especialidad; 
        }


    public ArrayList<Incidencia> getIncidenciasAsignadas() { return incidenciasAsignadas; }

    public void setIncidenciasAsignadas(ArrayList<Incidencia> incidenciasAsignadas) {
        this.incidenciasAsignadas = incidenciasAsignadas;
    }
}
