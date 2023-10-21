import java.time.LocalDate;

public abstract class Item {

    private LocalDate alquilaHasta;   

    
    public Item(LocalDate alquilaHasta) {
        this.alquilaHasta = alquilaHasta;
    }


    public boolean alquilerVencido() {
        return !LocalDate.now().isBefore(alquilaHasta);
    }

    public abstract boolean sePuedeAlquilar();
}