public class EmpleadoExtra extends Empleado{

    private int porcVentaMes;

    public EmpleadoExtra(String nombre, String apellido, int dni, int sueldoMensual,int porc) {
        super(nombre, apellido, dni, sueldoMensual);
        this.porcVentaMes = porc;
    }

    public int getSueldoMensual() {
        return super.getSueldoMensual() + super.getSueldoMensual() * porcVentaMes;
    }
}
