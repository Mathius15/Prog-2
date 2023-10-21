public abstract class Alquilable{ 
    private int codigo;

    public Alquilable(int codigo) {
        this.codigo = codigo;
    }

    public abstract int getValor();
    public abstract int getAntiguedad();

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
}