import java.util.ArrayList;
import java.util.Collections;

public class Consultora {
    private ArrayList<Candidato> candidatos;

    public ArrayList<Candidato> candidatosDisponibles(Oferta f) {
        ArrayList<Candidato> rta = new ArrayList<>();
        for(Candidato cand : candidatos) {
            if(cand.puedeAceptar(f)){
                rta.add(cand);
            }
        }
        Collections.sort(rta); //se puede hacer en el main tambien
        return rta;
    }
}
