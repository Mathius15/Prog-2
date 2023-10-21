public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Categoria categoriaGeneral = new Categoria("Generales", "imagen_generales.jpg");
        Categoria categoriaEspectaculos = new Categoria("Espectaculos", "imagen_generales.jpg");
        Categoria categoriaDivorcios = new Categoria("Divorcios", "imagen_generales.jpg");
        Categoria categoriaDeportes = new Categoria("Deportes", "imagen_generales.jpg");
        Categoria categoriaFutbol = new Categoria("Futbol", "imagen_generales.jpg");

        Noticia Link1 = new Noticia("link1");
        Noticia Link2 = new Noticia("link2");
        Noticia Link3 = new Noticia("link3");
        Noticia Link4 = new Noticia("link4");
        Noticia Link5 = new Noticia("link5");
        Noticia Link6 = new Noticia("link6");

        categoriaGeneral.addContenido(categoriaEspectaculos);
        categoriaGeneral.addContenido(categoriaDeportes);

        categoriaEspectaculos.addContenido(Link1);
        categoriaEspectaculos.addContenido(categoriaDivorcios);
        categoriaDivorcios.addContenido(Link2);
        categoriaDivorcios.addContenido(Link3);

        categoriaDeportes.addContenido(categoriaFutbol);
        categoriaFutbol.addContenido(Link4);
        categoriaDeportes.addContenido(Link5);
        categoriaDeportes.addContenido(Link6);

        categoriaGeneral.mostrar();

    }
}
