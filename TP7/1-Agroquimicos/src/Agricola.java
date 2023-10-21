import java.util.ArrayList;

public class Agricola {
    private ArrayList<Producto> productos;
    private ArrayList<Enfermedad> enfermedades;
    private ArrayList<Cultivo> cultivos;

    public Agricola() {
        super();
        productos = new ArrayList<>();
        enfermedades = new ArrayList<>();
        cultivos = new ArrayList<>();
    }

    public ArrayList<Producto> productosEfectivos (Enfermedad e) {
        ArrayList<Producto> productosEfectivos = new ArrayList<>(null);
        for(int i = 0; i<productos.size();i++) {
            if(productos.get(i).funciona(e)) {
                productosEfectivos.add(productos.get(i));
            }
        }
        return productosEfectivos;
    }
    // ME HACE RUIDO AAAAA
    //son dos metodos iguales
    public ArrayList<Producto> productosUsables(Cultivo c, Enfermedad e) {
        ArrayList<Producto> productosUsables = new ArrayList<>(null);
        for(int i = 0; i<productos.size(); i++) {
            Producto p = productos.get(i);
            if(c.productoSirve(p) && e.funciona(p)) {
                productosUsables.add(p);
            }
        }
        return productosUsables;
    }


}
