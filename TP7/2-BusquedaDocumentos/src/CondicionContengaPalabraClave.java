public class CondicionContengaPalabraClave extends Condicion{
    private String pClave;

    public CondicionContengaPalabraClave(String pClave) {
        this.pClave = pClave;
    }

    public boolean cumple(Documento d) {
        return d.getPalabrasClaves().contains(pClave);
    }
    
}
