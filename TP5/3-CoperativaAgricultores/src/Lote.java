import java.util.ArrayList;

public class Lote {
    private int numLote;
    private int numHectareas;
    private ArrayList<String> minerales;
    private ArrayList<String> mineralesEspeciales;

    public Lote(int numLote, ArrayList especiales, int hectareas) {
        this.numLote = numLote;
        this.numHectareas = hectareas;
        ArrayList<String> mineralesEspeciales = new ArrayList<>();
        mineralesEspeciales.addAll(especiales);
        ArrayList<String> minerales = new ArrayList<>();
    }

    public Lote(int numLote, int hectareas) {
        this.numLote = numLote;
        this.numHectareas = hectareas;
        ArrayList<String> minerales = new ArrayList<>();
        ArrayList<String> mineralesEspeciales = new ArrayList<>();

    }

    public boolean sePuedeSembrar(Cereal c) {
        ArrayList<String> mNecesarios = c.getMineralesnecesarios();
        int cont = 0;
        if(mNecesarios.size() > 0) {
            for(int i = 0; i < mNecesarios.size(); i++) {
                for(int j = 0; j< minerales.size();j++) {
                    if(mNecesarios.get(i).equals(minerales.get(j))) {
                        cont++;
                    }
                }
            }
            return cont == mNecesarios.size();
            
        }
        return true;
    }
    
    public boolean isEspecial() {
        if(mineralesEspeciales.size() > 0) {
            int cont = 0;
            for(int i = 0; i < mineralesEspeciales.size(); i++) {
                for(int j = 0; j<minerales.size();j++) {
                    if(mineralesEspeciales.get(i).equals(minerales.get(j))) {
                        cont++;
                    }
                }
            }
            return cont == mineralesEspeciales.size();
        }
         return false;
        
    }

    public void addMineral(String mineral) {
        minerales.add(mineral);
    }

    public int getNumLote() {
        return numLote;
    }

    public ArrayList<String> getMinerales() {
        ArrayList<String> aux = new ArrayList<>();
        aux.addAll(minerales);
        return aux;
    }

    public void setNumLote(int numLote) {
        this.numLote = numLote;
    }


    public int getNumHectareas() {
        return numHectareas;
    }

    public void setNumHectareas(int numHectareas) {
        this.numHectareas = numHectareas;
    }
    

    
}