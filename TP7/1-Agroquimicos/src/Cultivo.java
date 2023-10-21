import java.util.ArrayList;

public class Cultivo {
    private String nombre;
    private ArrayList<Enfermedad> enfermedadesFrecuentes;


    public Cultivo(String nombre) {
        this.nombre = nombre;
        enfermedadesFrecuentes = new ArrayList<>();
    }
    
    public boolean productoSirve(Producto p) {
        boolean trata = false;

        if(!p.getCultivosDesaconsejados().contains(this)) {
            int i = 0;
            while(!trata && i < enfermedadesFrecuentes.size()) {
                Enfermedad e = enfermedadesFrecuentes.get(i);
                if (p.funciona(e)) {
                    trata = true;
                }
            }
        }
        return trata;

    }
    
}
