import java.util.Comparator;

public class ComparadorCuotaPaga implements Comparator<Socio>{
    public int compare(Socio o1, Socio o2) {
        boolean res1 = o1.isPagoUltimaCuota();
        boolean res2 = o2.isPagoUltimaCuota();

        if (res1 == res2) {
            return 0;
        } else if(res1 == true){
            return 1;
        }
        return -1;
    }
    
}
