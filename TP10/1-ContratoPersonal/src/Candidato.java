public class Candidato implements Comparable<Candidato> {
    private String nombre, apellido, empresa;
    private int sueldo;
    private Requisito requisito;

    public Candidato(String nombre, String apellido, String empresa, int sueldo, Requisito requisito) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.empresa = empresa;
        this.sueldo = sueldo;
        this.requisito = requisito;
    }

    public boolean puedeAceptar(Oferta oferta) {
        return requisito.cumple(oferta);
    }

    @Override
    public int compareTo(Candidato c) {
        int rta = this.nombre.compareTo(c.getNombre());
        if (rta == 0)
            rta = this.apellido.compareTo(c.getApellido());
        return rta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public Requisito getRequisito() {
        return requisito;
    }

    public void setRequisito(Requisito requisito) {
        this.requisito = requisito;
    }

}