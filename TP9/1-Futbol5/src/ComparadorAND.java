import java.util.Comparator;

public class ComparadorAND implements Comparator<Socio> {
    private Comparator comp1, comp2;

    public ComparadorAND(Comparator comp1, Comparator comp2) {
        this.comp1 = comp1;
        this.comp2 = comp2;
    }

    @Override
    public int compare(Socio o1, Socio o2) {
        int respuesta = comp1.compare(o1, o2);
        if(respuesta == 0) {
            respuesta = comp2.compare(o1, o2);
        }
        return respuesta;
    }
    
}
