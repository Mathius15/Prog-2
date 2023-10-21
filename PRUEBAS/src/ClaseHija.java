public class ClaseHija extends ClasePadre{
    private String nombre;

    public ClaseHija(String nombre) {
        super(nombre);
    }
    
    public void pruebaSuper(){
        System.out.println(super.getNombre());
    }

    public void pruebaThis() {
        System.out.println(this.nombre);
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}