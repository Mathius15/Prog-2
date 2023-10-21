import java.util.ArrayList;

public class Mesa {
    private ArrayList<Votante> padron;
    private ArrayList<Voto> votos;


    public Mesa() {
        padron = new ArrayList<>();
        votos = new ArrayList<>();
    }

    public void addVotante(Votante v) {
        padron.add(v);
    }

    public boolean padronCorrecto(Votante v) {
        return padron.contains(v);
    }

    public void addVoto(Voto voto, Votante votante) {
        if(padronCorrecto(votante)) {
            votos.add(voto);
        }
    }

    public ArrayList<Voto> getVoto() {
        return new ArrayList<>(votos);
    }

    public ArrayList<Votante> getPadron() {
        return new ArrayList<>(padron);
    }
}
