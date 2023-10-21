import java.util.ArrayList;

public class Aseguradora {
    private ArrayList<Seguro> seguros;

    public Aseguradora(){
        seguros = new ArrayList<>();
    }

    public ArrayList<Seguro> buscar(Condicion c) {
        ArrayList<Seguro> rta = new ArrayList<>();
        for(int i = 0; i < seguros.size(); i ++) {
            if(c.cumple(seguros.get(i))) {
                rta.add(seguros.get(i));
            }
        }
        return rta;
    }

    public void addSeguro(Seguro s) {
        seguros.add(s);
    }
}
