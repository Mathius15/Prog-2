public class CondicionNOT extends Condicion {
    private Condicion condicion;

    public CondicionNOT(Condicion condicion) {
        this.condicion = condicion;
    }

    public boolean cumple(Socio s) {
        return !condicion.cumple(s);
    }

}
