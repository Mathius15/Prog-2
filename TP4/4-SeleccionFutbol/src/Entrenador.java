import java.time.LocalDate;

public class Entrenador extends IntegranteContingente{
    private int idFederacion;

    public Entrenador(String nombre, String apellido, int numPasaporte, LocalDate fnac, boolean isPaisOrigen,
                                boolean isConcnetrando, boolean isViajando, int idFederacion) {
        super(nombre, apellido, numPasaporte, fnac,isPaisOrigen,isConcnetrando,isViajando);
        this.idFederacion = idFederacion;
    }

    public Entrenador(String nombre, String apellido, int numPasaporte, LocalDate fnac, int idFederacion) {
        super(nombre, apellido, numPasaporte, fnac);
        this.idFederacion = idFederacion;
    }

    public int getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(int idFederacion) {
        this.idFederacion = idFederacion;
    }
    
}
