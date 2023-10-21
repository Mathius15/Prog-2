import java.time.LocalDate;

public class CongeladoNitrogeno extends Producto{
    private String metodoEmpleado;
    private int tiempoExposicion;
    
    public CongeladoNitrogeno(LocalDate fechaVencimiento, int numLote, String granjaOrigen, LocalDate fechaEnvasado,
            String metodoEmpleado, int tiempoExposicion) {
        super(fechaVencimiento, numLote, granjaOrigen, fechaEnvasado);
        this.metodoEmpleado = metodoEmpleado;
        this.tiempoExposicion = tiempoExposicion;
    }

    public String etiqueta() {
        return super.etiqueta() +
            " metodo empleado: " + this.getMetodoEmpleado() + "\n" +
            " tiempo de exposicion: " + this.tiempoExposicion;
    }

    public String getMetodoEmpleado() {
        return metodoEmpleado;
    }

    public void setMetodoEmpleado(String metodoEmpleado) {
        this.metodoEmpleado = metodoEmpleado;
    }

    public int getTiempoExposicion() {
        return tiempoExposicion;
    }

    public void setTiempoExposicion(int tiempoExposicion) {
        this.tiempoExposicion = tiempoExposicion;
    }

    
}
