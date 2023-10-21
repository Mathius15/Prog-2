import java.util.ArrayList;

public class Computadora {
    private ArrayList<Documento> documentos;

    public Computadora() {
        documentos = new ArrayList<>();
    }

    public ArrayList<Documento> buscar(Condicion c) {
        ArrayList aux = new ArrayList<Documento>();
        for(int i = 0; i< documentos.size();i++) {
            if(c.cumple(documentos.get(i))) {
                aux.add(documentos.get(i));
            }
        }
        return aux;
    }


}
