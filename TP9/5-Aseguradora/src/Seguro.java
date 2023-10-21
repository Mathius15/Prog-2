public class Seguro {
    private int dni, poliza;
    private String descripcion;
    private CalculadoraMonto monto;

    public Seguro(int dni, int poliza, String descripcion, CalculadoraMonto monto) {
        this.dni = dni;
        this.poliza = poliza;
        this.descripcion = descripcion;
        this.monto = monto;
    }

    public int getDni() {
        return dni;
    }

    public int getPoliza() {
        return poliza;
    }

    public void setPoliza(int poliza) {
        this.poliza = poliza;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }   

    public int getMonto() {
        return monto.calcularMonto();
    }

    public void setMonto(CalculadoraMonto monto) {
        this.monto = monto;
    }

    @Override
    public String toString() {
        return "DNI: " + getDni() + " Descripcion: " + getDescripcion();
    }
}
