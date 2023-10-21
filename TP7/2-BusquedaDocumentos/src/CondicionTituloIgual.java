public class CondicionTituloIgual extends Condicion{
    private String titulo;

    public CondicionTituloIgual(String titulo) {
        this.titulo = titulo;
    }

    public boolean cumple(Documento d) {
        return d.getTitulo().equals(titulo);
    }
}