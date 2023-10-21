import java.util.ArrayList;

public class Combo extends Alquilable {
    private ArrayList<Alquilable> elementos;

    public Combo(int codigo) {
        super(codigo);
        elementos = new ArrayList<>();
    }

    public int getAntiguedad() {
        int antiguedad = 0;
        for (int i = 0 ; i < elementos.size(); i++) {
            if(elementos.get(i).getAntiguedad() > antiguedad){
                antiguedad = elementos.get(i).getAntiguedad();
            }
        }
        return antiguedad;
    }

    public ArrayList<Elemento> getElementos(){
        ArrayList<Elemento> aux = new ArrayList<>();
        for(int i = 0; i < elementos.size(); i++) {
            if(elementos.get(i) instanceof Elemento) {
                aux.add((Elemento)elementos.get(i));
            } else {
                Combo c = (Combo)elementos.get(i);
                aux.addAll(c.getElementos());
            }
        }
        return aux;
    }

    @Override
    public int getValor() {
        int valor = 0;
        for (int i = 0; i < elementos.size(); i++) {
            valor += elementos.get(i).getValor();
        }
        return valor;
    }

    public void addAlquilable(Alquilable a) {
        elementos.add(a);
    }

}
