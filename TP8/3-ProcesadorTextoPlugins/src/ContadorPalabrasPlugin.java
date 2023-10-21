public class ContadorPalabrasPlugin implements Plugin {

    private String texto;
    private int longitud;
    private static int cantPalabras = 0;

    public ContadorPalabrasPlugin(String texto) {
        this.texto = texto;
        longitud = texto.length();
    }

    public void ejecutar() {
        for (int i = 0; i < longitud; i++) {
            if(texto.charAt(i) == ' ') {
                cantPalabras++;
            }
        }
    }

    public String getTexto() {
        return texto;
    }

    public static int getCantPalabras() {
        return cantPalabras;
    }

    
}
