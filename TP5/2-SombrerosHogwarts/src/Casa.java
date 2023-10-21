import java.lang.reflect.Array;
import java.util.ArrayList;

public class Casa {
    private String nombre;
    private int maxAlumnos;
    private Escuela esc;

    private ArrayList<Alumno> alumnos;
    private ArrayList<String> cualidades;


    public Casa(String nombre, int maxAlumnos, ArrayList<String> cualidadesA,Escuela esc) {
        this.nombre = nombre;
        this.maxAlumnos = maxAlumnos;
        this.esc = esc;
        ArrayList alumnos = new ArrayList<>();
        ArrayList cualidades = new ArrayList<>();
        for(int i = 0; i <cualidadesA.size(); i++) {
            String c = cualidadesA.get(i);
            addCualidad(c);
        }
        esc.addCasa(this);
    }
    public Casa(String nombre, int maxAlumnos, ArrayList<String> cualidadesA,ArrayList<Alumno> alumnosA,Escuela esc) {
        this.nombre = nombre;
        this.maxAlumnos = maxAlumnos;
        this.esc = esc;
        esc.addCasa(this);
        ArrayList alumnos = new ArrayList<>();
        ArrayList cualidades = new ArrayList<>();
        for(int i = 0; i <cualidadesA.size(); i++) {
            String c = cualidadesA.get(i);
            addCualidad(c);
        }
        for(int i = 0; i <alumnosA.size(); i++) {
            addAlumno(alumnosA.get(i));
        }

    }
    public Casa(String nombre, int maxAlumnos,Escuela esc) {
        this.nombre = nombre;        
        this.esc = esc;
        this.maxAlumnos = maxAlumnos;
        esc.addCasa(this);
        ArrayList alumnos = new ArrayList<>();
        ArrayList cualidades = new ArrayList<>();
    }

    public int addAlumno(Alumno a) {
        if(!isLlena()) {
            if(cumpleCualidades(a)) {
                if(a.getCasa() == null) {
                    a.setCasa(this);
                    alumnos.add(a);
                    System.out.println("Alumno agregado con exito");
                    return 1;
                } else {
                    System.out.println("Este alumno ya pertenece a una casa");
                    return 0;
                }
            } else{
                System.out.println("El alumno no cumple con las cualidades");
                return 0;
            }
        } else {
            System.out.println("La casa esta llena");
            return 0;
        }
    }

    public boolean cumpleCualidades(Alumno a) {
        ArrayList cualidadesAlumno = new ArrayList<>(a.getCualidades());
        int aux = 0;
        for(int i = 0; i <cualidades.size(); i ++) {
            for(int j = 0; j < cualidadesAlumno.size();j++){
                if(cualidades.get(i).equals(cualidadesAlumno.get(j))) {
                    aux++;
                    j = cualidadesAlumno.size();
                }
            }
        }
        return aux == cualidades.size();
    }



    public boolean isLlena() {
        return alumnos.size() < maxAlumnos;
    }

    public void addCualidad(String cualidad) {
        cualidades.add(cualidad);
    }

    public Escuela getEscuela() {
        return this.esc;
    }

    public ArrayList<Alumno> getAlumnos() {
        ArrayList<Alumno> copia = new ArrayList<>();
        copia.addAll(alumnos);
        return copia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMaxAlumnos() {
        return maxAlumnos;
    }

    public void setMaxAlumnos(int maxAlumnos) {
        this.maxAlumnos = maxAlumnos;
    }


    
}
