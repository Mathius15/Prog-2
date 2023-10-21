import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        LocalDate hoy = LocalDate.now();

        CongeladoNitrogeno c1 = new CongeladoNitrogeno(hoy, 3, "Los pollos hermanos", hoy, "succion", 23);

        System.out.println(c1.etiqueta());
    }
}
