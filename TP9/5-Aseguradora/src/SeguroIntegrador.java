import java.util.ArrayList;

public class SeguroIntegrador {
    private int dni;
    private ArrayList<Seguro> seguros;

    public SeguroIntegrador(int dni) {
        this.dni = dni;
        seguros = new ArrayList<>();
    }

    public int getPoliza() {
        int poliza = 0;
        for (int i = 0; i < seguros.size(); i++) {
            Seguro seguro = seguros.get(i);
            if (seguro.getPoliza() > poliza) {
                poliza = seguro.getPoliza();
            }
        }
        return poliza;
    }

    public int getMonto() {
        int monto = 0;
        for (int i = 0; i < seguros.size(); i++) {
            monto += seguros.get(i).getMonto();
        }
        return monto;
    }

    public void addSeguro(Seguro s) {
        seguros.add(s);
    }

}
