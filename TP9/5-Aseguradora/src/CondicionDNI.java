public class CondicionDNI extends Condicion{
    private int DNI;

    public CondicionDNI(int DNI) {
        this.DNI = DNI;
    }
    public boolean cumple(Seguro s){
        return s.getDni() == this.DNI;
    }
}
