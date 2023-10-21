import java.time.LocalDate;

//capaz conviene poner Producto y ProductoRefrigeradoCongelado todo junto
public class Producto {
    private LocalDate fechaVencimiento;
    private int numLote;
    private String granjaOrigen;
    private LocalDate fechaEnvasado;
    
    public Producto(LocalDate fechaVencimiento, int numLote, String granjaOrigen, LocalDate fechaEnvasado) {
        this.fechaVencimiento = fechaVencimiento;
        this.numLote = numLote;
        this.granjaOrigen = granjaOrigen;
        this.fechaEnvasado = fechaEnvasado;
    }

    public String etiqueta() {
        return(" Fecha vencimiento: " + this.getFechaVencimiento() +"\n" +
                " Numero lote: " + this.getNumLote() + "\n" +
                " granja origen: " + this.getGranjaOrigen() + "\n" +
                " fecha envasado: " + this.getFechaEnvasado()) + "\n";
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public int getNumLote() {
        return numLote;
    }

    public void setNumLote(int numLote) {
        this.numLote = numLote;
    }

    public String getGranjaOrigen() {
        return granjaOrigen;
    }

    public void setGranjaOrigen(String granjaOrigen) {
        this.granjaOrigen = granjaOrigen;
    }

    public LocalDate getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(LocalDate fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    
}