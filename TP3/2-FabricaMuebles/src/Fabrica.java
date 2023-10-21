import java.util.ArrayList;

public class Fabrica {
    private String nombre;
    private ArrayList<Producto> productos;

    public Fabrica(String nombre, Producto pr) {
        addProducto(pr);
        this.nombre = nombre;
    }

    public void addProducto(Producto pr) {
        productos.add(pr);
    }

    public void removeProducto(Producto pr) {
        productos.remove(pr);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public void stockDisponible() {
        for(int i = 0; i < productos.size(); i++) {
            Producto prod = productos.get(i);
            if(prod.isDisponible()) {
                System.out.println("El producto " + prod.getProducto() + " esta disponible");
            } else{
                System.out.println("El producto " + prod.getProducto() + " no esta disponible");
            }
        }
    }



}
