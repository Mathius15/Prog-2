import java.util.ArrayList;

public class Vivero {
    private ArrayList<Planta> plantas;

    public Vivero() {
        plantas = new ArrayList<>();
    }

    public ArrayList<Planta> buscarPlantas(Condicion c) {
        ArrayList<Planta> aux = new ArrayList<Planta>();
        for (int i = 0; i < plantas.size(); i++) {
            if (c.cumple(plantas.get(i)))
                aux.add(plantas.get(i));
        }
        return aux;
    }

}