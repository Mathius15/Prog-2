public class Pastura extends Cereal{
    private int hectareasMinimas;

    public Pastura() {
        super("Pastura");
        this.hectareasMinimas = 50;
    }

        public Pastura(int hMin) {
        super("Pastura");
        this.hectareasMinimas = hMin;
    }


    @Override
    public boolean sePuedeSembrarEn(Lote l) {
        return super.sePuedeSembrarEn(l) && l.getNumHectareas() >= this.hectareasMinimas;
    }
    
}
