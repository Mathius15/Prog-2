import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class Usuario {
    private String nombre;
    private int dni;
    private ArrayList<Turno> turnos;
    private int mesesSocio = 2;

    public Usuario(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void addTurno(Turno turno) {
        turnos.add(turno);
    }

    public boolean esSocio() {
        int meses = 0;
        LocalDate hoy = LocalDate.now();
        Period diferencia;
        int mesesPasados;
        for(int i = 0; i < turnos.size(); i++) {
            Turno turno = turnos.get(i);
            diferencia = Period.between(hoy, turno.getFecha());
            mesesPasados = diferencia.getMonths();
            if(mesesPasados > mesesSocio) {
                meses++;
            }
        }
        return meses >= 4;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public ArrayList<Turno> getTurnos() {
        return turnos;
    }

    public void setTurnos(ArrayList<Turno> turnos) {
        this.turnos = turnos;
    }

    public int getMesesSocio() {
        return mesesSocio;
    }

    public void setMesesSocio(int mesesSocio) {
        this.mesesSocio = mesesSocio;
    }
    
}
