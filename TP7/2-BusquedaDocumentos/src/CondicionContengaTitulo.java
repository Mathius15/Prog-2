public class CondicionContengaTitulo extends Condicion {
    private String titulo;

    public CondicionContengaTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean cumple(Documento d) {
       return d.getTitulo().contains(titulo);
    } 
}