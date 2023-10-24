public class CondicionCodigo extends Condicion {
    private int codigo;

    public CondicionCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public boolean cumple(Elemento e) {
        return e.getCodigo() == this.codigo;
    }

}
