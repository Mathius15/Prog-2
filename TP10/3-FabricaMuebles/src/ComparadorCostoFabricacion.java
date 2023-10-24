import java.util.Comparator;

public class ComparadorCostoFabricacion implements Comparator<Pedido>{

    public int compare(Pedido p1, Pedido p2) {
        return p1.getCostoFabricacion() - p2.getCostoFabricacion();
    }
}
