public class CondicionAntiguedad extends Condicion {
    private int antiguedad;

    public CondicionAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    @Override
    public boolean cumple(Elemento e) {
        return e.getAntiguedad() > this.antiguedad;
    }

}
