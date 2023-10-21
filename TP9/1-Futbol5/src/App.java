import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Alquiler alquiler1 = new Alquiler(LocalDate.of(2023, 8, 15), 13, 501);
        Alquiler alquiler2 = new Alquiler(LocalDate.of(2023, 8, 20), 2, 601);
        Alquiler alquiler3 = new Alquiler(LocalDate.of(2023, 8, 25), 3, 701);
        Alquiler alquiler4 = new Alquiler(LocalDate.of(2023, 8, 10), 13, 55);
        Alquiler alquiler5 = new Alquiler(LocalDate.of(2023, 8, 10), 13, 55);
        Alquiler alquiler6 = new Alquiler(LocalDate.of(2023, 8, 10), 1, 55);
        Alquiler alquiler7 = new Alquiler(LocalDate.of(2023, 8, 10), 1, 55);

        // Crear varios objetos Socio y agregar alquileres
        Socio socio1 = new Socio("Juan", "Pérez", 30, true);
        Socio socio2 = new Socio("María", "Gómez", 17, false);
        Socio socio3 = new Socio("Pedro", "Martínez", 8, true);
        Socio socio4 = new Socio("Luis", "Rodríguez", 35, false);

        socio1.addAlquiler(alquiler1);
        socio1.addAlquiler(alquiler2);

        socio2.addAlquiler(alquiler3);

        socio3.addAlquiler(alquiler4);
        socio3.addAlquiler(alquiler5);

        socio4.addAlquiler(alquiler6);
        socio4.addAlquiler(alquiler7);

        Club club = new Club();
        club.addSocio(socio1);
        club.addSocio(socio2);
        club.addSocio(socio3);
        club.addSocio(socio4);

        Condicion cuotaPaga = new CondicionCuota();
        Condicion cuotaImpaga = new CondicionNOT(cuotaPaga);
        Condicion mayorEdad = new CondicionEdad();
        Condicion menorEdad = new CondicionNOT(mayorEdad);
        CondicionCancha cantAlquileres = new CondicionCancha(13);
        Condicion pagoMas = new CondicionPago(500);

        ComparadorApellido compApellido = new ComparadorApellido();
        ComparadorNombre compNombre = new ComparadorNombre();
        ComparadorAND compNombreApellido = new ComparadorAND(compApellido, compNombre);
        ComparadorEdad compEdad = new ComparadorEdad();
        ComparadorAlquileresCancha ordenAlquilerCancha = new ComparadorAlquileresCancha(13);
        ComparadorCuotaPaga compCuota = new ComparadorCuotaPaga();
        ComparadorAND compCuotaPagaAlfabetico = new ComparadorAND(compCuota, compApellido);


        ArrayList<Socio> sociosSinPagar = club.buscarSocio(cuotaImpaga);
        Collections.sort(sociosSinPagar, compNombreApellido);
        System.out.println('\n' + "Lista de Socios con cuota impaga Ordenada por Nombre y Apellido:");
        for (Socio socio : sociosSinPagar) {
            System.out.println("Nombre: " + socio.getNombre() + ", Apellido: " + socio.getApellido());
        }

        ArrayList<Socio> sociosMenores = club.buscarSocio(menorEdad);
        Collections.sort(sociosMenores, compEdad);
        System.out.println( '\n' + "Lista de Socios menores de edad ordenados por edad:");
        for (int i = 0; i < sociosMenores.size(); i++) {
            System.out.println("Nombre: " + sociosMenores.get(i).getNombre() + ", Apellido: " + sociosMenores.get(i).getApellido());
        }

        ArrayList<Socio> sociosAlquilaronCancha13 = club.buscarSocio(cantAlquileres);
        Collections.sort(sociosAlquilaronCancha13, ordenAlquilerCancha);
        System.out.println( '\n' + "Lista de Socios que alquilaron la cancha 13 ordenados por cant de alquileres de esta:");
        for (int i = 0; i < sociosAlquilaronCancha13.size(); i++) {
            System.out.println("Nombre: " + sociosAlquilaronCancha13.get(i).getNombre() + ", Apellido: " + sociosAlquilaronCancha13.get(i).getApellido());
        }

        ArrayList<Socio> sociosPagaronMas500 = club.buscarSocio(pagoMas);
        Collections.sort(sociosPagaronMas500, compCuotaPagaAlfabetico);
        System.out.println( '\n' + "Lista de Socios que pagaron mas de 500 primero cuotas pagas, ordenado alfabeticamente:");
        for (int i = 0; i < sociosPagaronMas500.size(); i++) {
            System.out.println("Nombre: " + sociosPagaronMas500.get(i).getNombre() + ", Apellido: " + sociosPagaronMas500.get(i).getApellido());
        }
    }
}
