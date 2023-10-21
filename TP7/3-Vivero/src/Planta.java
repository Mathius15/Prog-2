import java.util.ArrayList;

public class Planta {
    private String nombreCientifico, familia, clase, prosperaEn, clasificacion;
    private int requerimientoSol, requerimientoAgua;
    private ArrayList<String> nombresVulgares;

    public Planta(String nombreCientifico, String familia, String clase, String prosperaEn, String clasificacion,
            int requerimientoSol, int requerimientoAgua) {
        this.nombreCientifico = nombreCientifico;
        this.familia = familia;
        this.clase = clase;
        this.prosperaEn = prosperaEn;
        this.clasificacion = clasificacion;
        this.requerimientoSol = requerimientoSol;
        this.requerimientoAgua = requerimientoAgua;
        nombresVulgares = new ArrayList<>();
    }

    public ArrayList<String> getNombresVulgares() {
        return new ArrayList<String>(nombresVulgares);
    }

    public Planta(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
        nombresVulgares = new ArrayList<>();
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getProsperaEn() {
        return prosperaEn;
    }

    public void setProsperaEn(String prosperaEn) {
        this.prosperaEn = prosperaEn;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public int getRequerimientoSol() {
        return requerimientoSol;
    }

    public void setRequerimientoSol(int requerimientoSol) {
        this.requerimientoSol = requerimientoSol;
    }

    public int getRequerimientoAgua() {
        return requerimientoAgua;
    }

    public void setRequerimientoAgua(int requerimientoAgua) {
        this.requerimientoAgua = requerimientoAgua;
    }

}
