import java.util.ArrayList;

public class Escuela {
    private ArrayList<Mesa> mesas;

    public Escuela() {
        mesas = new ArrayList<>();
    }

    public ArrayList<Mesa> getMesas() {
        return new ArrayList<>(mesas);
    }
    
}
