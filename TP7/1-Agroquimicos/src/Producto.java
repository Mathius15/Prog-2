import java.util.ArrayList;

public class Producto extends Tratamiento{

    private ArrayList<String> estadosPatologicos;
    private ArrayList<Cultivo> cultivosDesaconsejados;
    
    public Producto(String nombre) {
        super(nombre);
        estadosPatologicos = new ArrayList<>();
        cultivosDesaconsejados = new ArrayList<>();
    }

    @Override
    public boolean funciona(Tratamiento t) {
        // TODO Auto-generated method stub
        return super.funciona((Enfermedad)t);
    }


    public ArrayList<Cultivo> getCultivosDesaconsejados() {
        return new ArrayList<>(cultivosDesaconsejados);
    }
    
}
