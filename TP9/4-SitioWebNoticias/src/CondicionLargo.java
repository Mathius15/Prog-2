public class CondicionLargo extends Condicion{
    private int largo;

    public CondicionLargo(int largo) {
        this.largo = largo;
    }

    @Override
    public boolean cumple(Noticia n) {
        return largo > n.getTexto().length();
    }
    
}
