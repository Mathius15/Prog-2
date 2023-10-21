public class CondicionCancha extends Condicion {
    private int cancha;

    public CondicionCancha(int cancha) {
        this.cancha = cancha;
    }

    public boolean cumple(Socio s) {
        return s.cantVecesAlquiloCancha(cancha) > 0;
    }

    public int getCancha() {
        return cancha;
    }

    public void setCancha(int cancha) {
        this.cancha = cancha;
    }

    

}
