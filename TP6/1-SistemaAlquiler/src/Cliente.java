
import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private ArrayList<Item> itemsAlquilados;


    public Cliente(String nombre) {
        this.nombre = nombre;
        itemsAlquilados = new ArrayList<Item>();
    }

    public boolean tieneAlquilerVencido() {
        for(int i = 0; i < itemsAlquilados.size(); i++) {
            if(itemsAlquilados.get(i).alquilerVencido()) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<Item> itemsVencido() {
        ArrayList<Item> itemsVencidos = new ArrayList<Item>();
        for(int i = 0; i< itemsAlquilados.size();i++) {
            if(itemsAlquilados.get(i).alquilerVencido()) {
                itemsVencidos.add(itemsAlquilados.get(i));
            }
        }
        return itemsVencidos;
        
    }

    public void addItem(Item i) {
        itemsAlquilados.add(i);
    }

    public void removeItem(Item i) {
        itemsAlquilados.remove(i);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
