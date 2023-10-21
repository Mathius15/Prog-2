public class CondicionPago extends Condicion {
    private int precio;

public CondicionPago(int precio) {
    this.precio = precio;
}

    public boolean cumple(Socio s) {
        for(int i =  0; i < s.getAlquileres().size();i++) {
            return s.getAlquileres().get(i).getPrecio() > precio;
        }
        return false;
    }

}
