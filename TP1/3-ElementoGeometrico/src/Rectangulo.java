public class Rectangulo {
    //atributos
    private PuntoGeometrico v1;
    private PuntoGeometrico v2;
    private PuntoGeometrico v3;
    private PuntoGeometrico v4;
    private int base;
    private int altura;

    //constructores
    public Rectangulo(PuntoGeometrico v1, PuntoGeometrico v2, PuntoGeometrico v3, PuntoGeometrico v4) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
        this.v4 = v4;
        this.base = this.v1.getCordenadaX() - this.v2.getCordenadaX();
        this.altura = this.v1.getCordenadaY() - this.v3.getCordenadaY();
    }
    
    //getters y setters

    public PuntoGeometrico getV1() {
        return v1;
    }

    public void setV1(PuntoGeometrico v1) {
        this.v1 = v1;
    }

    public PuntoGeometrico getV2() {
        return v2;
    }

    public void setV2(PuntoGeometrico v2) {
        this.v2 = v2;
    }

    public PuntoGeometrico getV3() {
        return v3;
    }

    public void setV3(PuntoGeometrico v3) {
        this.v3 = v3;
    }

    public PuntoGeometrico getV4() {
        return v4;
    }

    public void setV4(PuntoGeometrico v4) {
        this.v4 = v4;
    }

    //metodos

    public void desplazarAbajo(int y) {
        this.v1.desplazarAbajo(y);
        this.v2.desplazarAbajo(y);
        this.v3.desplazarAbajo(y);
        this.v4.desplazarAbajo(y);
    }
    
    public void desplazarArriba(int y) {
        this.v1.desplazarArriba(y);
        this.v2.desplazarArriba(y);
        this.v3.desplazarArriba(y);
        this.v4.desplazarArriba(y);
    }

    public void desplazarDerecha(int x) {
        this.v1.desplazarDerecha(x);
        this.v2.desplazarDerecha(x);
        this.v3.desplazarDerecha(x);
        this.v4.desplazarDerecha(x);
    }

    public void desplazarIzquierda(int x) {
        this.v1.desplazarIzquierda(x);
        this.v2.desplazarIzquierda(x);
        this.v3.desplazarIzquierda(x);
        this.v4.desplazarIzquierda(x);
    }

    public int calcularArea() {
        return base * altura;
    }

    public int esMayor(Rectangulo b) {
        int areaA = this.calcularArea();
        int areaB = b.calcularArea();
        if(areaA > areaB) {
            return 1;
        } else {
            if(areaA < areaB) {
                return 0;
            } else {
                return -1;
               }
        }
    }

    public boolean esCuadrado() {
        return base == altura;
    }

    public int largoLadoSuperior() {
        return v1.getCordenadaX() - v2.getCordenadaX();
        //return base
    }

    public String acostadoOParado() {
        if(base < altura) {
            return "Esta parado";
        } else {
            if(base > altura) {
                return "Esta acostado";
            } else {
                return "Es un cuadrado";
            }
        }
    }
}
