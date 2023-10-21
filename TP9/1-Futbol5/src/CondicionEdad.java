public class CondicionEdad extends Condicion {
    public boolean cumple(Socio s) {
        return s.getEdad() > 18;
    }

}
