public class Procesador {
    String texto;

    public Procesador(String texto) {
        this.texto = texto;
    }

    public void ejecutarPlugin(Plugin p) {
        p.ejecutar();
    }
}
