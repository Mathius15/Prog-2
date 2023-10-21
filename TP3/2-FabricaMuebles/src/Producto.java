public class Producto {
    private String producto;
    private int peso;
    private int costoFabricacion;
    private String tipoMadera;
    private String color;
    private boolean disponible;

    public Producto(String producto,int peso, int costoFabricacion, String tipoMadera, String color) {
        this.producto = producto;
        this.peso = peso;
        this.costoFabricacion = costoFabricacion;
        this.tipoMadera = tipoMadera;
        this.color = color;
        disponible = true;
    }

    

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getCostoFabricacion() {
        return costoFabricacion;
    }

    public void setCostoFabricacion(int costoFabricacion) {
        this.costoFabricacion = costoFabricacion;
    }

    public String getTipoMadera() {
        return tipoMadera;
    }

    public void setTipoMadera(String tipoMadera) {
        this.tipoMadera = tipoMadera;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public String getProducto() {
        return producto;
    }



    public void setProducto(String producto) {
        this.producto = producto;
    }

    

    
}
