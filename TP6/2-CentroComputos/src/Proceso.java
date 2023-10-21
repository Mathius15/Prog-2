public class Proceso {
    private int requerimientoMemoria;
    
    public Proceso(int memoria) {
        this.requerimientoMemoria = memoria;
    }

    public int getRequerimientoMemoria() {
        return requerimientoMemoria;
    }

    public void setRequerimientoMemoria(int requerimientoMemoria) {
        this.requerimientoMemoria = requerimientoMemoria;
    }

    public void ejecutar(Computadora c){
        System.out.println("Proceso ejecutado");
    }
}
