import java.util.ArrayList;

public class Administrador {
    private ArrayList<Contenido> contenidos;

    public Administrador() {
        contenidos = new ArrayList<>();
    }

    public ArrayList<Noticia> buscarNoticia(Condicion c) {
        ArrayList<Noticia> aux = new ArrayList<>();
        for(Contenido contenido : contenidos) {
            aux.addAll(contenido.noticiasQueCumplen(c));
        }
        return aux;

    }
}
