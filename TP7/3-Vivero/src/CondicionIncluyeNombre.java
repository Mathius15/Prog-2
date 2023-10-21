public class CondicionIncluyeNombre extends Condicion {
    private String nombre;

    public CondicionIncluyeNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean cumple(Planta p) {
        return p.getNombreCientifico().contains(nombre);
    }
}