import java.util.ArrayList;

public class Cereal {

    private String tipoCosecha;
    private ArrayList<String> mineralesNecesarios;

    public Cereal(String tipoCosecha) {
        this.tipoCosecha = tipoCosecha;
        ArrayList<String> mineralesNecesarios = new ArrayList<>();
    }

    public void addMineralnecesario(String mineral) {
        mineralesNecesarios.add(mineral);
    }

    public ArrayList<String> getMineralesnecesarios() {
        ArrayList<String> aux = new ArrayList<>();
        aux.addAll(mineralesNecesarios);
        return aux;
    }

    public boolean sePuedeSembrarEn(Lote l) {
        ArrayList<String> mineralesLote = l.getMinerales();
        if(this.mineralesNecesarios.size() > 0) {
            int sum = 0;
            for (int i = 0; i < this.mineralesNecesarios.size(); i++) {
                for(int j = 0; j < mineralesLote.size(); j++) {
                    if(this.mineralesNecesarios.get(i).equals(mineralesLote.get(j))) {
                        sum++;
                    }
                }
            }
            return sum == this.mineralesNecesarios.size();
        }
        return true;
    }

    public String getTipoCosecha() {
        return tipoCosecha;
    }

    public void setTipoCosecha(String tipoCosecha) {
        this.tipoCosecha = tipoCosecha;
    }

}
