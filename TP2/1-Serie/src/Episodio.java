public class Episodio {
    private String titulo;
    private String descripcion;
    private boolean visto;
    private double calificacion;
    private int numEpisodioTotal;
    private int maxCal = 5;
    private int minCal = 1;

    //constructores

    public Episodio(int numEpisodioTotal) {
        this.numEpisodioTotal = numEpisodioTotal;
    }

    public Episodio(String titulo, String descripcion, boolean visto, double calificacion, int numEpisodioTotal) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.visto = visto;
        this.numEpisodioTotal = numEpisodioTotal;
        setCalificacion(visto,calificacion);
    }



    
    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public int getNumEpisodioTotal() {
        return numEpisodioTotal;
    }

    public void setNumEpisodioTotal(int numEpisodioTotal) {
        this.numEpisodioTotal = numEpisodioTotal;
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
    
    public boolean isVisto() {
        return visto;
    }

    public void setVisto(boolean visto) {
        this.visto = visto;
    }
    
    public double getCalificacion() {
        return calificacion;
    }
    
    public void setCalificacion(boolean visto, double calificacion) {
        if(calificacion <= maxCal && calificacion >= minCal) {
            this.calificacion = calificacion;
            if (visto == true) {
                calificacion = 0;
            } else {
                calificacion = -1;
            }
        } else {
            System.out.println("La calificacion tiene que ser valores entre 1 y 5");
        }
    }
    
}
