public class RequisitoMonto extends Requisito{
    private int monto;

    public RequisitoMonto(int monto) {
        this.monto = monto;
    }

    public boolean cumple(Oferta o) {
        return o.getMonto() > this.monto;
    }
}

