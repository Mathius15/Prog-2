import java.util.ArrayList;
import java.util.Collections;

public class Arbol {
    private ArrayList<Nodo> nodos;

    public Arbol() {
        nodos = new ArrayList<>();
    }

    public void addNodo(Nodo n) {
        if(!nodos.contains(n)) {
            nodos.add(n);
            Collections.sort(nodos);
        }
    }

    
}
