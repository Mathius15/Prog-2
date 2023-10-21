import java.util.ArrayList;

public class CondicionCandidato extends Condicon{
    Candidato c;
    public CondicionCandidato(Candidato c) {
        this.c = c;
    }
    @Override
    public boolean cumple(Voto v) {
        return v.getCandidato().equals(c);
    }
    
}
