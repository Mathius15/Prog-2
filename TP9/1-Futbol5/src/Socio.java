import java.util.ArrayList;

public class Socio {
    private String nombre, apellido;
    private int edad;
    private boolean pagoUltimaCuota;
    private ArrayList<Alquiler> alquileres;

    public Socio(String nombre, String apellido, int edad, boolean pagoUltimaCuota) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.pagoUltimaCuota = pagoUltimaCuota;
        alquileres = new ArrayList<>();
    }

    public ArrayList<Alquiler> getAlquileres() {
        return new ArrayList<Alquiler>(alquileres);
    }

    public void addAlquiler(Alquiler a) {
        alquileres.add(a);
    }
    
    public int cantVecesAlquiloCancha(int numCancha) {
        int rta = 0;
        for(int i = 0; i < alquileres.size(); i++) {
            if(alquileres.get(i).getIDcancha() == numCancha) {
                rta++;
            }
        }
        return rta;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isPagoUltimaCuota() {
        return pagoUltimaCuota;
    }

    public void setPagoUltimaCuota(boolean pagoUltimaCuota) {
        this.pagoUltimaCuota = pagoUltimaCuota;
    }
     

}
