import java.time.LocalDate;

public class Pedido {
    private String material, caracteristicas;
    private int costoFabricacion, precioVenta;
    private LocalDate fechaMaxima;
    
    public Pedido(String material, String caracteristicas, int costoFabricacion, int precioVenta,
            LocalDate fechaMaxima) {
        this.material = material;
        this.caracteristicas = caracteristicas;
        this.costoFabricacion = costoFabricacion;
        this.precioVenta = precioVenta;
        this.fechaMaxima = fechaMaxima;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public int getCostoFabricacion() {
        return costoFabricacion;
    }

    public void setCostoFabricacion(int costoFabricacion) {
        this.costoFabricacion = costoFabricacion;
    }

    public int getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(int precioVenta) {
        this.precioVenta = precioVenta;
    }

    public LocalDate getFechaMaxima() {
        return fechaMaxima;
    }

    public void setFechaMaxima(LocalDate fechaMaxima) {
        this.fechaMaxima = fechaMaxima;
    }

    
}
