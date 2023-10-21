public class CalculadoraMontoPorcentaje extends CalculadoraMonto{
    private int monto;
    private int porcentaje;

    public CalculadoraMontoPorcentaje(int monto, int porcentaje){
        super(monto);
        this.porcentaje= porcentaje;
    }

    @Override
    public int calcularMonto() {
        return (porcentaje / 100) * monto;
    }

    
}
