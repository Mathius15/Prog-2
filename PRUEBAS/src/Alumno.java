public class Alumno {
    private int cantidadAlumnos;
    private String nombre;
    private int legajo;

    public Alumno(String nombre) {
        this.nombre = nombre;
        legajo = cantidadAlumnos;
        cantidadAlumnos++;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public static void main(String[] args) {
    Alumno a1 = new Alumno("Marcelo");
    Alumno a2 = new Alumno("Luis");
    Alumno a3 = new Alumno("Ariel");
    System.out.println(a3.getLegajo());
}
}