public class EmpleadoHoraExtra extends Empleado{

    private int horasExtras;
    private int extraPorHoras = 15;

    public EmpleadoHoraExtra(int salarioFijoSemanal, int horasExtras) {
        super(salarioFijoSemanal);
        this.horasExtras = horasExtras;
    }

    @Override
    public int sueldoSemanal() {
        return getSalarioFijoSemanal() + (horasExtras * extraPorHoras);
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    public int getExtraPorHras() {
        return extraPorHoras;
    }

    public void setExtraPorHras(int extraPorHras) {
        this.extraPorHoras = extraPorHras;
    }

    
}
