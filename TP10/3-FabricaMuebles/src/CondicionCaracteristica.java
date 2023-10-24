public class CondicionCaracteristica extends Condicion {
    private String caracteristica;

    
    public CondicionCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }


    @Override
    public boolean cumple(Pedido p) {
        return p.getCaracteristicas().contains(caracteristica);
    }
    
}
