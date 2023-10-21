public class Impuesto {
    private int nombre;
    private int gastoTotal;

    
    public Impuesto(int nombre, int gastoTotal) {
        this.nombre = nombre;
        this.gastoTotal = gastoTotal;
    }

    
    public int getNombre() {
        return nombre;
    }
    public void setNombre(int nombre) {
        this.nombre = nombre;
    }
    public int getGastoTotal() {
        return gastoTotal;
    }
    public void setGastoTotal(int gastoTotal) {
        this.gastoTotal = gastoTotal;
    }

    
    
}
