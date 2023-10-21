import java.time.LocalDate;

public class Auto extends Item{
    
    private String marca, patente, tipo;
    private int kms;
    private boolean estaAlquilado;

    public Auto(LocalDate alquilaHasta, String marca, String patente, String tipo, int kms, boolean estaAlquilado) {
        super(alquilaHasta);
        this.marca = marca;
        this.patente = patente;
        this.tipo = tipo;
        this.kms = kms;
        this.estaAlquilado = estaAlquilado;
    }


    @Override
    public boolean sePuedeAlquilar() {
        return estaAlquilado;
    }


    public String getMarca() {
        return marca;
    }


    public void setMarca(String marca) {
        this.marca = marca;
    }


    public String getPatente() {
        return patente;
    }


    public void setPatente(String patente) {
        this.patente = patente;
    }



    public String getTipo() {
        return tipo;
    }



    public void setTipo(String tipo) {
        this.tipo = tipo;
    }



    public int getKms() {
        return kms;
    }



    public void setKms(int kms) {
        this.kms = kms;
    }


    public boolean isEstaAlquilado() {
        return estaAlquilado;
    }


    public void setEstaAlquilado(boolean estaAlquilado) {
        this.estaAlquilado = estaAlquilado;
    }


}
