import java.time.LocalDate;

public class CongeladoAire extends Producto{ 
    private int porcentajeNitrogeno;
    private int porcentajeOxigeno;
    private int porcentajeDioxidoCarbono;
    private int porcentajeVaporAgua;

    



    public CongeladoAire(LocalDate fechaVencimiento, int numLote, String granjaOrigen, LocalDate fechaEnvasado,
            int porcentajeNitrogeno, int porcentajeOxigeno, int porcentajeDioxidoCarbono, int porcentajeVaporAgua) {
        super(fechaVencimiento, numLote, granjaOrigen, fechaEnvasado);
        this.porcentajeNitrogeno = porcentajeNitrogeno;
        this.porcentajeOxigeno = porcentajeOxigeno;
        this.porcentajeDioxidoCarbono = porcentajeDioxidoCarbono;
        this.porcentajeVaporAgua = porcentajeVaporAgua;
    }

    public String etiqueta() {
        return super.etiqueta() + 
                " porcentaje nitrogeno: " + this.getPorcentajeNitrogeno() + "\n" +
                " porcentaje oxigeno: " + this.getPorcentajeOxigeno() +"\n" +
                " porcentaje dioxido de carbono: " + this.getPorcentajeDioxidoCarbono() + "\n" +
                " porcentaje vapor agua: " + this.getPorcentajeVaporAgua();
    }

    public int getPorcentajeNitrogeno() {
        return porcentajeNitrogeno;
    }


    public void setPorcentajeNitrogeno(int porcentajeNitrogeno) {
        this.porcentajeNitrogeno = porcentajeNitrogeno;
    }


    public int getPorcentajeOxigeno() {
        return porcentajeOxigeno;
    }


    public void setPorcentajeOxigeno(int porcentajeOxigeno) {
        this.porcentajeOxigeno = porcentajeOxigeno;
    }


    public int getPorcentajeDioxidoCarbono() {
        return porcentajeDioxidoCarbono;
    }


    public void setPorcentajeDioxidoCarbono(int porcentajeDioxidoCarbono) {
        this.porcentajeDioxidoCarbono = porcentajeDioxidoCarbono;
    }


    public int getPorcentajeVaporAgua() {
        return porcentajeVaporAgua;
    }


    public void setPorcentajeVaporAgua(int porcentajeVaporAgua) {
        this.porcentajeVaporAgua = porcentajeVaporAgua;
    }

    
}