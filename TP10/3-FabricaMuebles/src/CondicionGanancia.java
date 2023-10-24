public class CondicionGanancia extends Condicion {
    private int ganancia;

    
    public CondicionGanancia(int ganancia) {
        this.ganancia = ganancia;
    }


    @Override
    public boolean cumple(Pedido p) {
        return p.getPrecioVenta() > this.ganancia;
    }
    
}
