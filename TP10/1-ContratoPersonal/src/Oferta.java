public class Oferta {
    private int horas, monto;
    private String empresa;

    public Oferta(int horas, int monto, String empresa) {
        this.horas = horas;
        this.monto = monto;
        this.empresa = empresa;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

}
