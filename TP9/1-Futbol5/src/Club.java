import java.util.ArrayList;

public class Club {
    private ArrayList<Socio> socios;

    public Club() {
        socios = new ArrayList<>();
    }

    public void addSocio(Socio s) {
        socios.add(s);
    }

    public ArrayList<Socio> buscarSocio(Condicion c) {
        ArrayList<Socio> respuesta = new ArrayList<>();
        for (int i = 0; i < socios.size(); i++) {
            if(c.cumple(socios.get(i))){
                respuesta.add(socios.get(i));
            }
        }
        return respuesta;
    }

    public int cantSocios() {
        return socios.size();
    }
}
