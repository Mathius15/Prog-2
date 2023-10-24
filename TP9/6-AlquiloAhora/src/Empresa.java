import java.util.ArrayList;

public class Empresa {
    private ArrayList<Elemento> elementos;
    private ArrayList<Combo> combos;

    public void addElemento(Elemento e) {
        elementos.add(e);
    }

    public void addCombo(Combo c) {
        combos.add(c);
    }

    public ArrayList<Elemento> buscarElementos(Condicion c) {
        ArrayList<Elemento> rta = new ArrayList<>();
        for(Elemento elemento : elementos) {
            if(c.cumple(elemento)) {
                rta.add(elemento);
            }
        }
        for(Combo combo : combos) {
            for(int i = 0; i < combo.getElementos().size();i++) {
                if(c.cumple(combo.getElementos().get(i))) {
                    rta.add(combo.getElementos().get(i));
                }
            }
        }
        return rta;
    }
}
