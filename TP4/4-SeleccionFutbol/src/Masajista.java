import java.time.LocalDate;

public class Masajista extends IntegranteContingente{
    private String titulo;
    private int aniosExperiencia;

    public Masajista(String nombre, String apellido, int numPasaporte, LocalDate fnac, boolean isPaisOrigen,
                                boolean isConcnetrando, boolean isViajando,String titulo, int aniosExperiencia) {
        super(nombre, apellido, numPasaporte, fnac,isPaisOrigen,isConcnetrando,isViajando);
        this.titulo = titulo;
        this.aniosExperiencia = aniosExperiencia;
    }

    public Masajista(String nombre, String apellido, int numPasaporte, LocalDate fnac,String titulo, int aniosExperiencia) {
        super(nombre, apellido, numPasaporte, fnac);
        this.titulo = titulo;
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }
    
}
