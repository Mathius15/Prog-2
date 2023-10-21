import java.util.Comparator;

public class ComparadorAND implements Comparator<Seguro>{
    private Comparator comp1, comp2;

    public ComparadorAND(Comparator comp1, Comparator comp2) {
        this.comp1 = comp1;
        this.comp2 = comp2;
    }

    @Override
    public int compare(Seguro o1, Seguro o2) {
        if(comp1.compare(o1, o2) != 0) {
            return comp1.compare(o1, o2);
        } else {
            return comp2.compare(o1, o2);
        }
        
    }

    
}
