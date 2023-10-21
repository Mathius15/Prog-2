import java.util.ArrayList;

public class Tratamiento {
    private String nombre;
    private ArrayList<String> estadosPatologicos;


    public Tratamiento(String nombre) {
        this.nombre = nombre;
        estadosPatologicos = new ArrayList<>();
    }

    public boolean funciona (Tratamiento t) {
        int contador = 0;
        for(int i = 0; i < estadosPatologicos.size(); i++) {
            String estadoPatoloico = estadosPatologicos.get(i);
            if(t.estadosPatologicos.contains(estadoPatoloico)) {
                contador ++;
            }
        }
        return contador == estadosPatologicos.size();
    }

    
}
