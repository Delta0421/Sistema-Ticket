import java.util.ArrayList;

public class SistemaTicket {

    private ArrayList<Incidencia> incidencias;
    private ArrayList<Tecnico> tecnicos;
    private ArrayList<Usuario> usuarios;
    private ArrayList<EquipoComputo> equipos;

    public SistemaTicket() {
        incidencias = new ArrayList<>();
        tecnicos = new ArrayList<>();
        usuarios = new ArrayList<>();
        equipos = new ArrayList<>();
    }

    public void registrarIncidencia(Incidencia incidencia) {
        incidencias.add(incidencia);
    }

    public Incidencia buscarIncidencia(int idIncidencia) {
        for (Incidencia i : incidencias) {
            if (i.getIdIncidencia() == idIncidencia) {
                return i;
            }
        }
        return null;
    }

    public void asignarTecnico(int idIncidencia, int idTecnico) {
        Incidencia inc = buscarIncidencia(idIncidencia);
        Tecnico tec = buscarTecnico(idTecnico);
        if (inc != null && tec != null) {
            inc.asignarTecnico(tec);
            tec.asignarIncidencia(inc);
        }
    }

    public Tecnico buscarTecnico(int idTecnico) {
        for (Tecnico t : tecnicos) {
            if (t.getIdTecnico() == idTecnico) return t;
        }
        return null;
    }

    public ArrayList<Incidencia> filtrarPorEstado(String estado) {
        ArrayList<Incidencia> resultado = new ArrayList<>();
        for (Incidencia i : incidencias) {
            if (i.getEstado().equals(estado)) resultado.add(i);
        }
        return resultado;
    }

    public void generarReporteGeneral() {
        System.out.println("Total incidencias: " + incidencias.size());
    }


    public ArrayList<Incidencia> getIncidencias() { return incidencias; }

    public void setIncidencias(ArrayList<Incidencia> incidencias) {
         this.incidencias = incidencias; 
    }


    public ArrayList<Tecnico> getTecnicos() { return tecnicos; }

    public void setTecnicos(ArrayList<Tecnico> tecnicos) { 
        this.tecnicos = tecnicos; 
    }


    public ArrayList<Usuario> getUsuarios() { return usuarios; }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
         this.usuarios = usuarios; 
    }


    public ArrayList<EquipoComputo> getEquipos() { return equipos; }

    public void setEquipos(ArrayList<EquipoComputo> equipos) { 
        this.equipos = equipos; 
    }
}
