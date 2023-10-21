import java.util.ArrayList;

public class CasaEnemistad extends Casa {
    private ArrayList<Casa> enemistades;

    public CasaEnemistad(String nombre, int maxAlumnos, ArrayList<String> cualidadesA,Escuela esc) {
        super(nombre, maxAlumnos, cualidadesA,esc);
        ArrayList alumnos = new ArrayList<>();
        ArrayList cualidades = new ArrayList<>();
        ArrayList enemistades = new ArrayList<>();

    }

    public CasaEnemistad(String nombre, int maxAlumnos, ArrayList<String> cualidadesA,ArrayList<Alumno> alumnosA, Escuela esc) {
        super(nombre, maxAlumnos, cualidadesA,alumnosA,esc);
        ArrayList alumnos = new ArrayList<>();
        ArrayList cualidades = new ArrayList<>();
        ArrayList enemistades = new ArrayList<>();
    }

    public int addAlumno(Alumno a) {
        if(entraACasaEnemiga(a)) {
            System.out.println("El alumno puede entrar a una casa enemiga por lo tanto no es bienvenido");
            return 0;
        } else{
            System.out.println("El alumno fue agregado con exito");
            return 1;
        }
    }

    public boolean entraACasaEnemiga(Alumno alumno) {
        Escuela e = super.getEscuela();
        ArrayList<Casa> casas = e.getCasas();
        for(int i = 0;i < casas.size();i++) {
            Casa aux = casas.get(i);
            if(aux.addAlumno(alumno) == 1) {
                return true;
            }
        }
        return false;
    }

    public CasaEnemistad(String nombre, int maxAlumnos, Escuela esc) {
        super(nombre, maxAlumnos,esc);
    }

    public void addEnemistad(Casa c) {
        enemistades.add(c);
    }
}
