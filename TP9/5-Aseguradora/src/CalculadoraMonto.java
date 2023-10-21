public abstract class CalculadoraMonto {
    private int monto;

    public CalculadoraMonto(int monto) {
        this.monto = monto;
    }

    public abstract int calcularMonto();
}
