public class Sensor {
    private String zona;
    private String tipo;
    
    public Sensor(String zona, String tipo) {
        this.zona = zona;
        this.tipo = tipo;
    }
    public String getZona() {
        return zona;
    }
    public void setZona(String zona) {
        this.zona = zona;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
}
