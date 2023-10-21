import java.time.LocalDate;

public class IntegranteContingente extends Persona{
    private boolean isPaisOrigen;
    private boolean isConcentrando;
    private boolean isViajando;

    public IntegranteContingente(String nombre, String apellido, int numPasaporte, LocalDate fnac) {
        super(nombre, apellido, numPasaporte, fnac);
    }

    public IntegranteContingente(String nombre, String apellido, int numPasaporte, LocalDate fnac, boolean isPaisOrigen,
                                boolean isConcnetrando, boolean isViajando) {
        super(nombre, apellido, numPasaporte, fnac);
        this.isPaisOrigen = isPaisOrigen;
        this.isConcentrando = isConcnetrando;
        this.isViajando = isViajando;
    }

    public boolean disponibleEventoSolidario(IntegranteContingente i) {
        if(this.isPaisOrigen && !this.isConcentrando) {
            return true;
        }
        return false;
    }

    public boolean isPaisOrigen() {
        return isPaisOrigen;
    }

    public void setPaisOrigen(boolean isPaisOrigen) {
        this.isPaisOrigen = isPaisOrigen;
    }

    public boolean isConcentrando() {
        return isConcentrando;
    }

    public void setConcentrando(boolean isConcentrando) {
        this.isConcentrando = isConcentrando;
    }

    public boolean isViajando() {
        return isViajando;
    }

    public void setViajando(boolean isViajando) {
        this.isViajando = isViajando;
    }

    

    
    
}
