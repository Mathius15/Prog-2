public class CondicionAutor extends Condicion{
    private String autor;

    public CondicionAutor(int largo) {
        this.autor = autor;
    }

    @Override
    public boolean cumple(Noticia n) {
        return n.getAutor().equals(autor);
    }
    
}
