import java.time.LocalDate;

public class Alquiler {
    private LocalDate fecha;
    private int IDcancha, precio;

    public Alquiler(LocalDate fecha, int iDcancha, int precio) {
        this.fecha = fecha;
        IDcancha = iDcancha;
        this.precio = precio;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getIDcancha() {
        return IDcancha;
    }

    public void setIDcancha(int iDcancha) {
        IDcancha = iDcancha;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    

    
}
