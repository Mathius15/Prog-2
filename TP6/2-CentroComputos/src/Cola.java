import java.util.ArrayList;

public abstract class Cola {
    
    public abstract void ordenar();

    public Object primero(ArrayList<Object> a) {
        if (a.size() > 0) {
            return a.get(0);
        }
        return null;
    }

 }