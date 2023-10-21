
public class Serie {
    //atributos
    private String titulo;
    private String descripcion;
    private String creador;
    private String genero;
    private int temporadas;
    private int cantEpisodios;
    private Episodio[] listaEpisodios;

    //constructores

    public Serie(String titulo, String descripcion, String creador, String genero, int temporadas, int cantEpisodios) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.creador = creador;
        this.genero = genero;
        this.temporadas = temporadas;
        this.cantEpisodios =cantEpisodios;
        this.listaEpisodios = new Episodio[cantEpisodios];
        for(int i = 0; i < cantEpisodios; i++) {
            listaEpisodios[i] = new Episodio(i);
        }
    }


    //metodos

    public boolean seVioTodosEpisodios() {
        int i = 0;
        int p = 0;
        while(i < cantEpisodios) {
            if(listaEpisodios[i].isVisto()){
                p ++;
            }
            i++;
        }
        return p == i;
    }

    public double promedioCalificaciones() {
        int i = 0;
        int p = 0;
        while(i < cantEpisodios) {
            if(listaEpisodios[i].isVisto()){
                p += listaEpisodios[i].getCalificacion();
            }
            i++;
        }
        return p / i;
    }

    public int cantEpisodiosVistos() {
        int i = 0;

        while(i < cantEpisodios) {
            if(listaEpisodios[i].isVisto())
            i++;
        }
        
        return i;
    }

    public void agregarEpisodio(Episodio ep) {
        listaEpisodios[ep.getNumEpisodioTotal()] = new Episodio(ep.getTitulo(), ep.getDescripcion(), ep.isVisto(), ep.getCalificacion(),ep.getNumEpisodioTotal());
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getCantEpisodios() {
        return cantEpisodios;
    }

    public void setCantEpisodios(int cantEpisodios) {
        this.cantEpisodios = cantEpisodios;
    }

    public void getListaEpisodios() {
        int largo = listaEpisodios.length;
        int i = 0;
        while(i < largo) {
            System.out.println("Episodio numero: " + i);
            System.out.println("");
            System.out.println(listaEpisodios[i].getTitulo());
            System.out.println(listaEpisodios[i].getDescripcion());
            System.out.println(listaEpisodios[i].isVisto());
            System.out.println(listaEpisodios[i].getCalificacion());
            i++;
        }
    }

    public void setListaEpisodios(Episodio[] listaEpisodios) {
        this.listaEpisodios = listaEpisodios;
    }
    

    public static void main(String[] args) throws Exception {
        Serie lost = new Serie("lost", "dasdawdsa","charlie", "terror", 3, 11);
        Episodio ep1 = new Episodio("cap 1", "prueba piloto", true, 3,4);
        lost.agregarEpisodio(ep1);
        lost.getListaEpisodios();

    }




}
