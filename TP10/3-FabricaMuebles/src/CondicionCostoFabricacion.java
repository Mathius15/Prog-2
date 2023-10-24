public class CondicionCostoFabricacion extends Condicion {
    private int costo;

    
    public CondicionCostoFabricacion(int costo) {
        this.costo = costo;
    }


    @Override
    public boolean cumple(Pedido p) {
        return p.getCostoFabricacion() < this.costo;
    }
    
}
