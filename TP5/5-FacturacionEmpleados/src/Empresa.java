import java.util.ArrayList;

public class Empresa {
    private ArrayList<Empleado> empleados;
    private String nombre;

    public Empresa(String nombre) {
        this.nombre = nombre;
        ArrayList empleados = new ArrayList<>();
    }

    public int totalGastos() {
        int total = 0;
        for(int i = 0; i < empleados.size(); i ++) {
            Empleado e = empleados.get(i);
            total += e.getSueldoMensual();
        }
        return total;
    }

    public void addEmpleado(Empleado e) {
        empleados.add(e);
    }

}