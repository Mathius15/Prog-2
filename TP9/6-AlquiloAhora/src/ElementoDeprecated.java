public class ElementoDeprecated extends Elemento {
    private int limite;
    private int porcentaje = 2;
    public ElementoDeprecated(int codigo, int valor, int limite) {
        super(codigo, valor);
        this.limite = limite;
    }

    @Override
    public int getValor() {
        if(this.getAntiguedad() < limite) {
            return this.getValor();
        } else {
            return (porcentaje / 100) * this.getValor() * getAntiguedad();
        }
    }

    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

}
