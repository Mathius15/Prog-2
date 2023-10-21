import java.time.LocalDate;

public class Electrodomestico {
    //atributos
    private String nombre;
    private int precio;
    private String color;
    private int consumo;
    private double peso;
    private int altaGama = 3;
    private int consumoBajo = 45;

    public Electrodomestico(String nombre){
        this(nombre, 100, "gris plata", 10, 2);
    }

    public Electrodomestico(String nombre, int precio) {
        this(nombre);
        this.precio = precio;
    }


    public Electrodomestico(String nombre, int precio, String color) {
        this(nombre);
        this.precio = precio;
        this.color = color;
    }

    public Electrodomestico(String nombre, int precio, String color, int consumo) {
        this(nombre);
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
    } 
 
    public Electrodomestico(String nombre, int precio, String color, int consumo, double peso) {
        this.nombre = nombre;
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

    //getters y setters

    public String getNombre() {
        return nombre;
    }

    public int getAltaGama() {
        return altaGama;
    }

    public void setAltaGama(int altaGama) {
        this.altaGama = altaGama;
    }

    public int getConsumoBajo() {
        return consumoBajo;
    }

    public void setConsumoBajo(int consumoBajo) {
        this.consumoBajo = consumoBajo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public boolean bajoConsumo() {
        return this.consumo < consumoBajo;
    }

    public double getBalance() {
        return this.precio / this.peso;
    }

    public boolean altaGama() {
        return this.getBalance() > altaGama;
    }

    public static void main(String[] args) {
        Electrodomestico heladera = new Electrodomestico("heladera", 1, "verde", 10, 55.5);
        System.out.println(heladera.altaGama()); 
    }
}