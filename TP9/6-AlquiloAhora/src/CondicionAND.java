public class CondicionAND extends Condicion{
    private Condicion cond1, cond2;

    public CondicionAND(Condicion cond1, Condicion cond2) {
        this.cond1 = cond1;
        this.cond2 = cond2;
    }

    @Override
    public boolean cumple(Elemento e) {
        return cond1.cumple(e) && cond2.cumple(e);
    }
    
}
