public class EmpleadoComision extends Empleado{
    private int porcentajeComision = 5;
    private int ventasRealizadas;

    public EmpleadoComision(int salarioFijoSemanal,int ventasRealizadas) {
        super(salarioFijoSemanal);
        this.ventasRealizadas = ventasRealizadas;
    }

    @Override
    public int sueldoSemanal() {
        return getSalarioFijoSemanal() + (ventasRealizadas * porcentajeComision);
    }

    
    public int getPorcentajeComision() {
        return porcentajeComision;
    }

    public void setPorcentajeComision(int porcentajeComision) {
        this.porcentajeComision = porcentajeComision;
    }

    public int getVentasRealizadas() {
        return ventasRealizadas;
    }

    public void setVentasRealizadas(int ventasRealizadas) {
        this.ventasRealizadas = ventasRealizadas;
    }
    
}
