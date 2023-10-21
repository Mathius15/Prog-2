import java.util.ArrayList;

public class ColaComputadoras extends Cola{
    private ArrayList<Computadora> colaComputadoras;
    
    public ColaComputadoras() {
        colaComputadoras = new ArrayList<>();
    }

    @Override
    public void ordenar() {
        //ordena
    }

    public Computadora primero(){
        if(hayCompus()){
        ArrayList<Object> aux = new ArrayList<>(colaComputadoras); 
        return (Computadora)super.primero(aux); //casteo de Objeto a Computadora
        }
        return null;
    }

    public void addComputadora(Computadora c) {
        colaComputadoras.add(c);
        this.ordenar();
    }

    public boolean hayCompus(){
        return colaComputadoras.size() >= 1;
    }
    
}
