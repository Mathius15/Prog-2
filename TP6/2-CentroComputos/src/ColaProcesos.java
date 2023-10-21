import java.util.ArrayList;

public class ColaProcesos extends Cola{
    private ArrayList<Proceso> colaProcesos;

    public ColaProcesos() {
        colaProcesos = new ArrayList<>();
    }


    public Proceso primero(){
        ArrayList<Object> aux = new ArrayList<>(colaProcesos); 
        return (Proceso)super.primero(aux); //casteo de Objeto a Proceso
    }

    @Override
    public void ordenar() {
        //ordena
        
    }

    public int size() {
        return colaProcesos.size();
    }

    public boolean contains(Proceso p) {
        return colaProcesos.contains(p);
    }

    public void addProceso(Proceso p) {
        colaProcesos.add(p);
    }


    public ArrayList<Proceso> getColaProcesos() {
        ArrayList<Proceso> aux = new ArrayList<>(colaProcesos);
        return aux;
    }

    
}
