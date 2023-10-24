public class RequisitoEmpresa extends Requisito{
    private String empresa;

    public RequisitoEmpresa(String empresa) {
        this.empresa = empresa;
    }

    @Override
    public boolean cumple(Oferta o) {
        return o.getEmpresa() != this.empresa;
    }

    
}
