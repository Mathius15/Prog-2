import java.util.Comparator;

public class ComparadorDni implements Comparator<Seguro>{
    @Override
    public int compare(Seguro s1, Seguro s2) {
        return s1.getDni() - s2.getDni();
    }
}
