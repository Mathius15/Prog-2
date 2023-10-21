import java.util.ArrayList;

public class Escuela {
    private String nombre;

    private ArrayList<Casa> casas;

    public Escuela(String nombre) {
        this.nombre = nombre;
        ArrayList casas = new ArrayList<>();
    }


    public void addCasa(Casa c) {
        casas.add(c);
    }

    public ArrayList<Casa> getCasas() {
        ArrayList<Casa> copia = new ArrayList<>();
        copia.addAll(casas);
        return copia;
    }
    
}