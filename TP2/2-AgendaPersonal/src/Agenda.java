import java.util.ArrayList;

public class Agenda {

    private ArrayList<Reunion> reuniones;

    public Agenda() {
        this.reuniones = new ArrayList<>();
    }

    public Agenda(Reunion reunion) {
        this.reuniones = new ArrayList<>();
        reuniones.add(reunion);
    }

    public void addReunion(Reunion r) {
        reuniones.add(r);
    }

    public void verReunion(Reunion r) {
    }
}
