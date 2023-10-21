public class CondicionCuota extends Condicion {
    public boolean cumple(Socio s) {
        return s.isPagoUltimaCuota();
    }

}
