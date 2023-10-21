import java.util.Comparator;

public class ComparadorAlquileresCancha implements Comparator<Socio> {
    private int numCancha;

    public ComparadorAlquileresCancha(int numCancha) {
        this.numCancha = numCancha;
    }

    @Override
    public int compare(Socio o1, Socio o2) {
        return o2.cantVecesAlquiloCancha(numCancha) - o1.cantVecesAlquiloCancha(numCancha);
    }
    
}
