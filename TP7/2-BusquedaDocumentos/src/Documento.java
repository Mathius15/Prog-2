import java.util.ArrayList;

public class Documento {
    private String titulo;
    private ArrayList<String> autores;
    private String contenidoTextual;
    private ArrayList<String> palabrasClaves;

    public Documento(String titulo, String contenidoTextual){
        this.titulo = titulo;
        this.contenidoTextual = contenidoTextual;
        autores = new ArrayList<>();
        palabrasClaves = new ArrayList<>();
    }

    

    public ArrayList<String> getAutores() {
        return new ArrayList<String>(autores);
    }



    public ArrayList<String> getPalabrasClaves() {
        return new ArrayList<String>(palabrasClaves);
    }



    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenidoTextual() {
        return contenidoTextual;
    }

    public void setContenidoTextual(String contenidoTextual) {
        this.contenidoTextual = contenidoTextual;
    }

    
}