import java.util.ArrayList;

public class Empleado extends Persona{
    private int numLegajo;
    private int sueldo;
    private ArrayList<Empleado> empleadosACargo;

    
    public Empleado(String nombre, String apellido, int edad, String cargo, Empresa empresa, int numLegajo,
            int sueldo) {
        super(nombre, apellido, edad, cargo, empresa);
        this.numLegajo = numLegajo;
        this.sueldo = sueldo;
        empleadosACargo = new ArrayList<>();
    }

    public void addEmpleadoACargo(Empleado e) {
        empleadosACargo.add(e);
    }


    public int getNumLegajo() {
        return numLegajo;
    }

    public void setNumLegajo(int numLegajo) {
        this.numLegajo = numLegajo;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    
}
