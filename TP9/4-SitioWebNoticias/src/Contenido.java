import java.util.ArrayList;

public abstract class Contenido {
    private Contenido padre;

    public abstract void mostrar();

    public Contenido getPadre() {
        return padre;
    }

    public void setPadre(Contenido padre) {
        this.padre = padre;
    }

    public abstract ArrayList<Noticia> noticiasQueCumplen(Condicion c);
}