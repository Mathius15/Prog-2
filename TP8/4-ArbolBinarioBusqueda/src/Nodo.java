public class Nodo implements Comparable<Nodo>{

    private int valor;
    private Nodo izq;
    private Nodo der;

    public int compareTo(Nodo n) {
        if(this.getValor() > n.getValor()) {
            return 1;
        } else if (this.getValor() < n.getValor()){
            return -1;
        }
        return 0;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getIzq() {
        return izq;
    }

    public void setIzq(Nodo izq) {
        this.izq = izq;
    }

    public Nodo getDer() {
        return der;
    }

    public void setDer(Nodo der) {
        this.der = der;
    }

    
}