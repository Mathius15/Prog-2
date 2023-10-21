public class CondicionDescripcion extends Condicion{
    private String descripcion;

    public CondicionDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public boolean cumple(Seguro s){
        return s.getDescripcion().contains(descripcion);
    }
}
