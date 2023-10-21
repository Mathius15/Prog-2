import java.time.LocalDate;

public class Futbolista extends IntegranteContingente{
    private String posicion;
    private String piernaHabil;
    private int cantGoles;

    public Futbolista(String nombre, String apellido, int numPasaporte, LocalDate fnac, boolean isPaisOrigen,
                                boolean isConcnetrando, boolean isViajando,String posicion, String piernaHabil,
                                int cantGoles) {
        super(nombre, apellido, numPasaporte, fnac,isPaisOrigen,isConcnetrando,isViajando);
        this.posicion = posicion;
        this.piernaHabil = piernaHabil;
        this.cantGoles = cantGoles;
    }

        public Futbolista(String nombre, String apellido, int numPasaporte, LocalDate fnac, String posicion, String piernaHabil,
                                int cantGoles) {
        super(nombre, apellido, numPasaporte, fnac);
        this.posicion = posicion;
        this.piernaHabil = piernaHabil;
        this.cantGoles = cantGoles;
    }

        public String getPosicion() {
            return posicion;
        }

        public void setPosicion(String posicion) {
            this.posicion = posicion;
        }

        public String getPiernaHabil() {
            return piernaHabil;
        }

        public void setPiernaHabil(String piernaHabil) {
            this.piernaHabil = piernaHabil;
        }

        public int getCantGoles() {
            return cantGoles;
        }

        public void setCantGoles(int cantGoles) {
            this.cantGoles = cantGoles;
        }

}
