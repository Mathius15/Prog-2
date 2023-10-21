public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        ClaseHija p1 = new ClaseHija("Josefina");
        ClasePadre p2 = new ClasePadre("Jose");

        p1.pruebaSuper();
        p1.setNombre("JOSE");
        p1.pruebaThis();
        p1.pruebaSuper();
        System.out.println(p1.getNombre());
        

    }
}
