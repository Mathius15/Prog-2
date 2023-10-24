public class RequisitoHoras extends Requisito {
    private int horas;

    public RequisitoHoras(int horas) {
        this.horas = horas;
    }

    public boolean cumple(Oferta o) {
        return o.getHoras() > this.horas;
    }
}
