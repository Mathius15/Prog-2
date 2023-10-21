public class CalculadoraMontoFijo extends CalculadoraMonto{
    private int monto;

    public CalculadoraMontoFijo(int monto){
        super(monto);
    }

    @Override
    public int calcularMonto() {
        return monto;
    }

    
}
