import java.time.LocalDate;
import java.util.ArrayList;

public class Pedido {
    private String material;
    private ArrayList<String> caracteristicas;
    private int costoFabricacion, precioVenta;
    private LocalDate fechaMaxima;
    
    public Pedido(String material,  int costoFabricacion, int precioVenta,
            LocalDate fechaMaxima) {
        this.material = material;
        this.costoFabricacion = costoFabricacion;
        this.precioVenta = precioVenta;
        this.fechaMaxima = fechaMaxima;
        caracteristicas = new ArrayList<>();
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public ArrayList<String> getCaracteristicas() {
        return new ArrayList<String>(caracteristicas);
    }

    public void addCaracteristicas(String caracteristica) {
        caracteristicas.add(caracteristica);
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
