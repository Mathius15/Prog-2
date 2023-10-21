import java.util.ArrayList;

public class Encuesta {
    private ArrayList<String> preguntas;
    private ArrayList<Integer> dnisEncuestados;
    private Empleado empleado;
    private String empleador;
    
    public Encuesta(ArrayList<String> preguntas, ArrayList<Integer> dnis, Empleado empleado, String empleador) {
        this.preguntas = preguntas;
        this.dnisEncuestados = dnis;
        this.empleado = empleado;
        this.empleador = empleador;
        empleado.addEncuesta(this);
    }

    public Encuesta(ArrayList<String> preguntas, Empleado empleado, String empleador) {
        this.preguntas = preguntas;
        this.empleado = empleado;
        this.empleador = empleador;
    }

    public void addEncuestado(Integer dniEncuestado) {
        boolean iguales = false;
        Integer dni;
        for(int i = 0; i < dnisEncuestados.size(); i++) {
            dni = dnisEncuestados.get(i);
            if (dni.intValue() == dniEncuestado.intValue()) {
                iguales = true;
            }
        }
        if(iguales == false) {
            dnisEncuestados.add(dniEncuestado);
        }
    }

    public ArrayList<String> getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(ArrayList<String> preguntas) {
        this.preguntas = preguntas;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public String getEmpleador() {
        return empleador;
    }

    public void setEmpleador(String empleador) {
        this.empleador = empleador;
    }

    
    
}