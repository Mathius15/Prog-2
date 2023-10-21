import java.util.Comparator;

public class ComparadorNOT implements Comparator<Socio> {
    private Comparator comp;

    public ComparadorNOT(Comparator comp1) {
        this.comp = comp;
    }

    @Override
    public int compare(Socio o1, Socio o2) {
        return -comp.compare(o1, o2);
    }
    
}
