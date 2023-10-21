public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Empresa Arcor = new Empresa();
        Persona p1 = new Persona("manuel", "pedro", 19, "jefe", Arcor);
        Persona p3 = new Persona("manuel", "pedro", 19, "limpia", Arcor);
        Persona p2 = new Persona("manuel", "pedro", 19, "cocina", Arcor);
        Persona p4 = new Persona("manuel", "pedro", 19, "nada", Arcor);
        Persona p5 = new Persona("manuel", "pedro", 19, "aaaa", Arcor);

        Arcor.listaPersonas();
    }
}
