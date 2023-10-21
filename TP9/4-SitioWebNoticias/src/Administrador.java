import java.util.ArrayList;

public class Administrador {
    private ArrayList<Noticia> noticias;

    public Administrador() {
        noticias = new ArrayList<>();
    }

    public ArrayList<Noticia> buscarNoticia(Condicion c) {
        ArrayList<Noticia> resultado = new ArrayList<>();
        for(int i = 0; i < noticias.size(); i++) {
            if(c.cumple(noticias.get(i))){
                resultado.add(noticias.get(i));
            }
        }
        return resultado;
    }
}
