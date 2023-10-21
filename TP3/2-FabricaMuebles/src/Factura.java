public class Factura {
    private Producto producto;
    private double porcentajeBase = 0.35;
    private double valorVenta;

    public Factura(Producto producto, double porcPrecioExtra) {
    this.producto = producto;
    this.valorVenta = costoProducto(producto, porcPrecioExtra);
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public double getPorcentajeVentaFijo() {
        return porcentajeBase;
    }

    public void setPorcentajeVentaFijo(double porcentajeVentaFijo) {
        this.porcentajeBase = porcentajeVentaFijo;
    }

    public double getValorVenta() {
        return valorVenta;
    }

    public void setValorVenta(double valorVenta) {
        this.valorVenta = valorVenta;
    }

    public double costoProducto(Producto pr, double porcentajeExtra) {
        if(porcentajeExtra == 0.0) {
            return (pr.getCostoFabricacion() * (1 + porcentajeBase));
        } else {
            return (pr.getCostoFabricacion() * (1 + porcentajeExtra));
        }
    }

}
