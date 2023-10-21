public class PuntoGeometrico {
    private int cordenadaX;
    private int cordenadaY;

    public PuntoGeometrico(){
        this.cordenadaX = 0;
        this.cordenadaY = 0;
    }
        
    public PuntoGeometrico(int cordenadaX, int cordenadaY) {
        this.cordenadaX = cordenadaX;
        this.cordenadaY = cordenadaY;
    }
    //metodos
    public void desplazarArriba(int veces){
        this.cordenadaY = getCordenadaY() + veces;
    }

    public void desplazarAbajo(int veces){
        this.cordenadaY = getCordenadaY() - veces;
    }

    public void desplazarIzquierda(int veces){
        this.cordenadaX = getCordenadaX() - veces;
    }

    public void desplazarDerecha(int veces){
        this.cordenadaX = getCordenadaX() + veces;
    }

    public double distanciaEuclidea(int Xb, int Yb) {
        int Xa = getCordenadaX();
        int Ya = getCordenadaY();
        int difereneciaX = Xa - Xb;
        int diferenciaY = Ya - Yb;
        double distancia;
        distancia = Math.pow(difereneciaX, 2) + Math.pow(diferenciaY, 2);
        return Math.sqrt(distancia);
    }
    
    //getters y setters
    public int getCordenadaX() {
        return cordenadaX;
    }

    public void setCordenadaX(int cordenadaX) {
        this.cordenadaX = cordenadaX;
    }

    public int getCordenadaY() {
        return cordenadaY;
    }

    public void setCordenadaY(int cordenadaY) {
        this.cordenadaY = cordenadaY;
    }

    public String getCordenadas() {
        return Integer.toString(cordenadaX) +","+ Integer.toString(cordenadaY);
    }

    public static void main(String[] args) throws Exception {
        PuntoGeometrico a = new PuntoGeometrico(2, 4);
        System.out.println(a.getCordenadas());
        System.out.println(a.distanciaEuclidea(-2,4));
    }
}
