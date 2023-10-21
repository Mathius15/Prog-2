import java.util.ArrayList;

public class Categoria extends Contenido{
    private String descripcion, imagen;
    private ArrayList<Contenido> contenidos;

    public Categoria(String descripcion, String imagen) {
        this.descripcion = descripcion;
        this.imagen = imagen;
        contenidos = new ArrayList<>();
    }

    public void addContenido(Contenido c) {
        if(c.getPadre() == null) {
            c.setPadre(this);
        }
        contenidos.add(c);

    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    //chat gpt
    public void mostrar(String prefijo) {
        System.out.println(prefijo + descripcion);
    
        for (int i = 0; i < contenidos.size(); i++) {
            Contenido contenido = contenidos.get(i);
            if (contenido instanceof Categoria) {
                ((Categoria) contenido).mostrar(prefijo + "\\" + descripcion);
            } else {
                System.out.println(prefijo + "\\" + ((Noticia) contenido).getLink());
            }
        }
    }
    
    public void mostrar() {
        mostrar(""); // Llamada inicial sin prefijo
    }
    


}
