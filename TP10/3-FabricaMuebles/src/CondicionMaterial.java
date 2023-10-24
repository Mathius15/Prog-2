public class CondicionMaterial extends Condicion {
    private String material;

    
    public CondicionMaterial(String material) {
        this.material = material;
    }


    @Override
    public boolean cumple(Pedido p) {
        return p.getMaterial().equals(material);
    }
    
}
