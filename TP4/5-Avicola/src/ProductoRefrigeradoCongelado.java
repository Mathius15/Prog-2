import java.time.LocalDate;
//capaz conviene poner Producto y ProductoRefrigeradoCongelado todo junto

public class ProductoRefrigeradoCongelado extends Producto{
    private String tipoProducto;
    private int codigoOrg;
    private int tempMantenimiento;
    
    public ProductoRefrigeradoCongelado(LocalDate fechaVencimiento, int numLote, String granjaOrigen, LocalDate fechaEnvasado,
            int codigoOrg, int tempMantenimiento, String tipoProducto) {
        super(fechaVencimiento, numLote, granjaOrigen, fechaEnvasado);
        this.codigoOrg = codigoOrg;
        this.tempMantenimiento = tempMantenimiento;
        this.tipoProducto = tipoProducto;
    }

    public String etiqueta() {
       return super.etiqueta() + "\n" +
                    " codigo organismo supervision: " + this.getCodigoOrg() + "\n" +
                    " temperatura mantenimiento: " + this.getTempMantenimiento() +"\n" +
                    " tipo producto: " + this.getTipoProducto();
    }

    public int getCodigoOrg() {
        return codigoOrg;
    }

    public void setCodigoOrg(int codigoOrg) {
        this.codigoOrg = codigoOrg;
    }

    public int getTempMantenimiento() {
        return tempMantenimiento;
    }

    public void setTempMantenimiento(int tempMantenimiento) {
        this.tempMantenimiento = tempMantenimiento;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    
}
