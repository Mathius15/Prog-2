public class CondicionValor extends Condicion {
    private int valor;

    public CondicionValor(int valor) {
        this.valor = valor;
    }

    @Override
    public boolean cumple(Elemento e) {
        return e.getValor() < this.valor;
    }

}
