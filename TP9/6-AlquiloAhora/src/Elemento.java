import java.time.LocalDate;
import java.time.Period;

public class Elemento extends Alquilable implements Comparable<Elemento>{
    private String descripcion;
    private int valor;
    private LocalDate creacion;

    public Elemento(int codigo, int valor) {
        super(codigo);
        this.valor = valor;
        creacion = LocalDate.now();
    }

    public int getAntiguedad() {
        Period periodo =Period.between(creacion, LocalDate.now());
        return periodo.getMonths();
    }


    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int getValor() {
        return valor;
    }


    @Override
    public int compareTo(Elemento e) {
        int rta = this.getCodigo() - e.getCodigo();
        if (rta == 0) {
            rta = this.getAntiguedad() - e.getAntiguedad();
        }
        return rta;
    }
}
