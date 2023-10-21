import java.util.ArrayList;

public class Alumno {
    private String nombre;
    private String apellido;
    private Casa casa;
    private ArrayList<String> cualidades;
    private ArrayList<Alumno> familiares;

    public Alumno(String nombre, String apellido,ArrayList<String> cualidadesA, ArrayList<Alumno> familiaresA) {
        this.nombre = nombre;
        this.apellido = apellido;
        ArrayList cualidades = new ArrayList<>();
        ArrayList familiares = new ArrayList<>();

        for(int i = 0;i < cualidadesA.size();i++) {
            addCualidad(cualidadesA.get(i));
        }
        for(int i = 0; i < familiaresA.size(); i++) {
            addFamiliar(familiaresA.get(i));
        }
    }

    public void addCualidad(String cualidad) {
        cualidades.add(cualidad);
    }

    public String getCualidad(int pos) {
        String aux = cualidades.get(pos);
        return aux;
    }

    

    public Casa getCasa() {
        return casa;
    }

    public void setCasa(Casa casa) {
        this.casa = casa;
    }

    public ArrayList<String> getCualidades() {
        ArrayList<String> copia = new ArrayList<>();
        copia.addAll(cualidades);
        return copia;
    }

    public void addFamiliar(Alumno alumno) {
        familiares.add(alumno);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
}
