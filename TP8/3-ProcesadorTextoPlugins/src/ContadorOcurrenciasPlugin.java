public class ContadorOcurrenciasPlugin implements Plugin {
    private String texto;
    private String palabra;
    private static int contador = 0;

    public ContadorOcurrenciasPlugin(String texto, String palabra) {
        this.palabra = palabra;
        this.texto = texto;
    }

    @Override
    public void ejecutar() {
        //contar todas las palabras repetidas
    }

}