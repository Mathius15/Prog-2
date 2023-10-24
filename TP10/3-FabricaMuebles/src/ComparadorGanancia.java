import java.util.Comparator;

public class ComparadorGanancia implements Comparator<Pedido>{

    public int compare(Pedido p1, Pedido p2) {
        return p1.getPrecioVenta() - p2.getPrecioVenta();
    }
}
