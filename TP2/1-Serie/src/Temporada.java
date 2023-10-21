public class Temporada {
    public int numTemporada;
    private int cantidadEpisodios;
    private Episodio[] listaEpisodios;
    
    //constructores
    public Temporada(int numTemporada, int cantidadEpisodios) {
        this.cantidadEpisodios = cantidadEpisodios;
        this.numTemporada = numTemporada;
        for(int i = 0; i < cantidadEpisodios; i++) {
            listaEpisodios[i] = new Episodio(i);
        }
    }

    //metodos

    public double promedioCalificaciones() {
        int i = 0;
        int p = 0;
        while(i < cantidadEpisodios) {
            if(listaEpisodios[i].isVisto()){
                p += listaEpisodios[i].getCalificacion();
            }
            i++;
        }
        return p / i;
    }

    public int cantEpisodiosVistos() {
        int i = 0;

        while(i < cantidadEpisodios) {
            if(listaEpisodios[i].isVisto())
            i++;
        }

        return i;
    }

    public void agregarEpisodio(Episodio ep) {
        listaEpisodios[ep.getNumEpisodioTotal()] = new Episodio(ep.getTitulo(), ep.getDescripcion(), ep.isVisto(), ep.getCalificacion(),ep.getNumEpisodioTotal());
    }

    public int getNumTemporada() {
        return numTemporada;
    }

    public void setNumTemporada(int numTemporada) {
        this.numTemporada = numTemporada;
    }

    public int getCantidadEpisodios() {
        return cantidadEpisodios;
    }

    public void setCantidadEpisodios(int cantidadEpisodios) {
        this.cantidadEpisodios = cantidadEpisodios;
    }

    public Episodio[] getListaEpisodios() {
        return listaEpisodios;
    }

    public void setListaEpisodios(Episodio[] listaEpisodios) {
        this.listaEpisodios = listaEpisodios;
    }
    
    
}
