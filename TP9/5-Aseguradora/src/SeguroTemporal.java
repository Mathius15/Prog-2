import java.time.LocalDate;

public class SeguroTemporal extends Seguro {
    private LocalDate inicio;
    private LocalDate fin;


    public SeguroTemporal(int dni, int poliza, String descripcion, CalculadoraMonto monto,LocalDate inicio, LocalDate fin) {
        super(dni, poliza, descripcion, monto);
        this.inicio = inicio;
        this.fin = fin;
    }

    @Override
    public int getMonto(){
        int rta = 0;
        if(LocalDate.now().isBefore(fin) && LocalDate.now().isAfter(inicio)) {
            rta = super.getMonto();
        }
        return rta;
    }

}