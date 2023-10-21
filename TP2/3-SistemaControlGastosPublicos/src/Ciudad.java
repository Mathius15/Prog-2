import java.util.ArrayList;

public class Ciudad {
    private int habitantes;
    private ArrayList<Impuesto> impuestos;
    private int gastos;
    private int recaudado;

    public Ciudad(int habitantes, int gastos, int recaudado) {
        this.habitantes = habitantes;
        this.gastos = gastos;
        this.recaudado = recaudado;
    }

    public void addImpuesto(Impuesto a) {
        impuestos.add(a);
    }

    public int getHabitantes() {
        return habitantes;
    }

    public void setHabitantes(int habitantes) {
        this.habitantes = habitantes;
    }

    public ArrayList<Impuesto> getImpuestos() {
        return impuestos;
    }

    public int getGastos() {
        return gastos;
    }

    public void setGastos(int gastos) {
        this.gastos = gastos;
    }

    public int getRecaudado() {
        int i = 0;
        int imp = impuestos.size();
        int recaudado;
        while(i < imp) {
            impuestos.get(i);
        }
    }

    public void setRecaudado(int recaudado) {
        this.recaudado = recaudado;
    }
    
}
