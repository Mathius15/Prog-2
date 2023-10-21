import java.time.LocalDate;

public class Persona {
    private String nombre;
    private String apellido;
    private int numPasaporte;
    private LocalDate fnac;

    
    public Persona(String nombre, String apellido, int numPasaporte, LocalDate fnac) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numPasaporte = numPasaporte;
        this.fnac = fnac;
    }

    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getApellido() {
        return apellido;
    }


    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    public int getNumPasaporte() {
        return numPasaporte;
    }


    public void setNumPasaporte(int numPasaporte) {
        this.numPasaporte = numPasaporte;
    }


    public LocalDate getFnac() {
        return fnac;
    }


    public void setFnac(LocalDate fnac) {
        this.fnac = fnac;
    }

    
}