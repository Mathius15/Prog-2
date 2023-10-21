import java.util.ArrayList;

public class Empresa {
    private ArrayList<Persona> personas;

    public Empresa() {
        personas = new ArrayList<>();
    }

    public void listaPersonas() {
        int i = 0;
        while(i < personas.size()) {
            System.out.println("\n");
            System.out.print(" Nombre: " + personas.get(i).getNombre());
            System.out.print(" -Apellido: " + personas.get(i).getApellido());
            System.out.print(" -Cargo: " + personas.get(i).getCargo());
            System.out.print(" -Edad: " + personas.get(i).getEdad());
            i++;
        }
    }

    public void addPersona(Persona p) {
        personas.add(p);
    }
    
}
