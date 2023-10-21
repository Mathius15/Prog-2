import java.util.ArrayList;

public class Enfermedad extends Tratamiento{
    private ArrayList<String> estadosPatologicos;
    
    public Enfermedad(String nombre) {
        super(nombre);
        estadosPatologicos = new ArrayList<>();
    }

    @Override
    public boolean funciona(Tratamiento t) {
        // TODO Auto-generated method stub
        return super.funciona((Producto)t);
    }

    public void addEstadoPatologico(String e) {
        estadosPatologicos.add(e);
    }

    public ArrayList<String> getEstadosPatologicos() {
        return new ArrayList<>(estadosPatologicos);
    }

}
