import java.util.ArrayList;

public class Noticia extends Contenido{
    private String titulo, introduccion, texto, autor, link;
    private Categoria categoria;
    private ArrayList<String> palabrasClaves;

    public Noticia(String link) {
        this.link = link;
    }
    
    public Noticia(String titulo, String introduccion, String texto, String autor, String link, Categoria categoria) {
        this.titulo = titulo;
        this.introduccion = introduccion;
        this.texto = texto;
        this.autor = autor;
        this.link = link;
        this.categoria = categoria;
        palabrasClaves = new ArrayList<>();
    }

    
    @Override
    public ArrayList<Noticia> noticiasQueCumplen(Condicion c) {
        ArrayList<Noticia> aux = new ArrayList<>();
        if(c.cumple(this)){
            aux.add(this);
        }
        return aux;
    }

    @Override
    public void mostrar() {
        System.out.println(getLink());
    }


    public String getTitulo() {
        return titulo;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public String getIntroduccion() {
        return introduccion;
    }


    public void setIntroduccion(String introduccion) {
        this.introduccion = introduccion;
    }


    public String getTexto() {
        return texto;
    }


    public void setTexto(String texto) {
        this.texto = texto;
    }


    public String getAutor() {
        return autor;
    }


    public void setAutor(String autor) {
        this.autor = autor;
    }


    public String getLink() {
        return link;
    }


    public void setLink(String link) {
        this.link = link;
    }


    public Categoria getCategoria() {
        return categoria;
    }


    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }


    
}
