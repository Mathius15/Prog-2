import java.util.ArrayList;
import java.util.Comparator;

public class Fabrica {
    private ArrayList<Pedido> pedidos;
    private Comparator<Pedido> comparador;
    private Condicion condicion;

    public Fabrica(Comparator comparador, Condicion condicion) {
        this.comparador = comparador;
        this.condicion = condicion;
        pedidos = new ArrayList<>();
    }

    public void addPedido(Pedido p) {
        if(sePuedeAgregar(p)) {
            int pos = 0;
            while(pos < pedidos.size() && comparador.compare(pedidos.get(pos), p) > 0) {
               pos++;
            }
            pedidos.add(pos,p);
        }
    }

    public int gananciaEsperada() {
        int ganancia = 0;
        for(Pedido pedido : pedidos) {
            ganancia += pedido.getPrecioVenta();
        }
        return ganancia;
    }

    public ArrayList<Pedido> getPedidos() {
        return new ArrayList<Pedido>(pedidos);
    }

    public boolean sePuedeAgregar(Pedido p) {
        return condicion.cumple(p);
    }

    public Comparator<Pedido> getComparador() {
        return comparador;
    }

    public void setComparador(Comparator<Pedido> comparador) {
        this.comparador = comparador;
    }

    public Condicion getCondicion() {
        return condicion;
    }

    public void setCondicion(Condicion condicion) {
        this.condicion = condicion;
    }

    

}
