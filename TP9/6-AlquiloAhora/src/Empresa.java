import java.util.ArrayList;

public class Empresa {
    private ArrayList<Alquilable> alquilables;

    public void addAlquilable(Alquilable a) {
        alquilables.add(a);
    }

    public ArrayList<Elemento> buscar(Condicion c) {
        ArrayList<Elemento> elementos = new ArrayList<>();
        for(int i = 0; i < alquilables.size(); i++) {
            Alquilable a = alquilables.get(i);
            if(c.cumple(a) && a instanceof Elemento) {
                elementos.add((Elemento)a);
            } else {
                elementos.addAll(((Combo)a).getElementos());
            }
        }
        return elementos;
    }
}
