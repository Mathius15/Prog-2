import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Voto {
    //atributos
    private Candidato candidato;
    private boolean enBlanco;
    private LocalTime hora;


    public Voto(Candidato candidato, LocalTime hora) {
        this.candidato = candidato;
        this.hora = hora;
        enBlanco = false;
    }


    public Voto(LocalTime hora) {
        this.hora = hora;
        enBlanco= true;
    }


    public Candidato getCandidato() {
        return candidato;
    }


    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }


    public boolean isEnBlanco() {
        return enBlanco;
    }


    public void setEnBlanco(boolean enBlanco) {
        this.enBlanco = enBlanco;
    }

    
    
}