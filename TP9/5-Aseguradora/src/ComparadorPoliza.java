import java.util.Comparator;

public class ComparadorPoliza implements Comparator<Seguro> {

    public int compare(Seguro s1, Seguro s2) {
        return s1.getPoliza() - s2.getPoliza();
    }
}
