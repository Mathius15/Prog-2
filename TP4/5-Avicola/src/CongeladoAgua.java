import java.time.LocalDate;

public class CongeladoAgua extends ProductoRefrigeradoCongelado{
    private int salinidad;

    public CongeladoAgua(LocalDate fechaVencimiento, int numLote, String granjaOrigen, LocalDate fechaEnvasado,
                        int codigoOrg, int tempMantenimiento, String tipoProducto, int salinidad) {
        super(fechaVencimiento, numLote, granjaOrigen, fechaEnvasado, codigoOrg, tempMantenimiento, tipoProducto);
        this.salinidad = salinidad;
    }

    public String etiqueta() {
        return super.etiqueta() + "\n" +
        " codigo organismo supervision: " + this.getCodigoOrg() + "\n" +
        " temperatura mantenimiento: " + this.getTempMantenimiento() +"\n" +
        " tipo producto: " + this.getTipoProducto() + "\n" +
        " salinidad: " + this.getSalinidad();
    }

    public int getSalinidad() {
        return salinidad;
    }

    public void setSalinidad(int salinidad) {
        this.salinidad = salinidad;
    }
    

    
}
