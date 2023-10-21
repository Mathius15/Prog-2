import java.time.LocalDate;

public class Pelicula extends Item{
    private String titulo;
    private String infoFilmografica;
    private int cantCopias;


    public Pelicula(LocalDate alquilaHasta, String titulo, String infoFilmografica, int cantCopias) {
        super(alquilaHasta);
        this.titulo = titulo;
        this.infoFilmografica = infoFilmografica;
        this.cantCopias = cantCopias;
    }


    @Override
    public boolean sePuedeAlquilar() {
        return cantCopias >= 1;
    }
    

    public String getTitulo() {
        return titulo;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public String getInfoFilmografica() {
        return infoFilmografica;
    }


    public void setInfoFilmografica(String infoFilmografica) {
        this.infoFilmografica = infoFilmografica;
    }


    public int getCantCopias() {
        return cantCopias;
    }


    public void setCantCopias(int cantCopias) {
        this.cantCopias = cantCopias;
    }
    
    
}