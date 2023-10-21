import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {
        Aseguradora ase = new Aseguradora();
        System.out.println("Hello, World!");

        CalculadoraMonto calculadora1 = new CalculadoraMontoPorcentaje(300000, 20);
        Seguro seguro1 = new Seguro(123456, 1001, "Seguro de Vida", calculadora1);
        ase.addSeguro(seguro1);

        CalculadoraMonto calculadora2 = new CalculadoraMontoPorcentaje(1000000, 10);
        Seguro seguro2 = new Seguro(24134323, 1002, "Seguro de Auto", calculadora2);
        ase.addSeguro(seguro2);

        CalculadoraMonto calculadora3 = new CalculadoraMontoFijo(260000);
        Seguro seguro3 = new Seguro(345678, 1003, "Seguro de Salud", calculadora3);
        ase.addSeguro(seguro3);

        CalculadoraMonto calculadora4 = new CalculadoraMontoFijo(25500);
        Seguro seguro4 = new Seguro(901234, 1004, "Seguro de Hogar", calculadora4);
        ase.addSeguro(seguro4);

        CalculadoraMonto calculadora5 = new CalculadoraMontoPorcentaje(10000, 50);
        Seguro seguro5 = new Seguro(567890, 1005, "Seguro de Automotor", calculadora5);
        ase.addSeguro(seguro5);

        CalculadoraMonto calculadora6 = new CalculadoraMontoPorcentaje(9000000, 10);
        Seguro seguro6 = new Seguro(234567, 1006, "Seguro de Automotor", calculadora6);
        ase.addSeguro(seguro6);

        CalculadoraMonto calculadora7 = new CalculadoraMontoFijo(20);
        Seguro seguro7 = new Seguro(678901, 1007, "Seguro de Responsabilidad Civil", calculadora7);
        ase.addSeguro(seguro7);

        Condicion condicionDesc1 = new CondicionDescripcion("Automotor");
        ComparadorDni compDni = new ComparadorDni();
        ArrayList<Seguro> segurosAutomotor = new ArrayList<>(ase.buscar(condicionDesc1));
        Collections.sort(segurosAutomotor, compDni);
        System.out.println(segurosAutomotor);

        Condicion condicionDni1 = new CondicionDNI(24134323);

    }
}
