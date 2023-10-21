import java.time.LocalDate;

public class Turno {
    private int precio;
    private int precioFutbol = 400;
    private int precioPadel = 100;
    private String deporte;
    private int numCancha;
    private Usuario user;
    private LocalDate fecha;

    public Turno(String deporte, int numCancha, Usuario user) {
        this.deporte = deporte;
        this.numCancha = numCancha;
        this.user = user;
        this.fecha = LocalDate.now();
        setPrecio(deporte);
        user.addTurno(this); //le agrego al usuario el turno creado.
    }

    public void setPrecio(String deporte) {
        if(deporte == "Futbol") {
            precio = precioFutbol;
        } else {
            precio = precioPadel;
        }
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getPrecioFutbol() {
        return precioFutbol;
    }

    public void setPrecioFutbol(int precioFutbol) {
        this.precioFutbol = precioFutbol;
    }

    public int getPrecioPadel() {
        return precioPadel;
    }

    public void setPrecioPadel(int precioPadel) {
        this.precioPadel = precioPadel;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public int getNumCancha() {
        return numCancha;
    }

    public void setNumCancha(int numCancha) {
        this.numCancha = numCancha;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

}