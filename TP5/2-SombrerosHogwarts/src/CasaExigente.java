import java.util.ArrayList;

public class CasaExigente extends Casa{
    private int a;

    public CasaExigente(String nombre, int maxAlumnos, ArrayList<String> cualidadesA,Escuela esc) {
        super(nombre, maxAlumnos, cualidadesA,esc);
        ArrayList alumnos = new ArrayList<>();
        ArrayList cualidades = new ArrayList<>();
    }

    public CasaExigente(String nombre, int maxAlumnos, ArrayList<String> cualidadesA,ArrayList<Alumno> alumnosA,Escuela esc) {
        super(nombre, maxAlumnos, cualidadesA,alumnosA,esc);
        ArrayList alumnos = new ArrayList<>();
        ArrayList cualidades = new ArrayList<>();
        ArrayList enemistades = new ArrayList<>();
    }
    public CasaExigente(String nombre, int maxAlumnos,Escuela esc) {
        super(nombre, maxAlumnos,esc);
    }
    
    public int addAlumno(Alumno a) {
        if(tieneFamiliar(a)){
            super.addAlumno(a);
            return 1;
        } else {
            System.out.println("Este alumno no tiene familiares en la casa");
            return 0;
        }
    }

    public boolean tieneFamiliar(Alumno a) {
        for(int i = 0;i < getAlumnos().size();i++) {
            Alumno aux = getAlumnos().get(i);
            if(aux.getApellido().equals(a.getApellido())) {
                return true;
            }
        }
        return false;
    }

}
