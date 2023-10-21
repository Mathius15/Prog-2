public class EmpleadoBono extends Empleado{
    private int ventasMinimas;
    private int bono;
    private int ventasMes;
    
    public EmpleadoBono(String nombre, String apellido, int dni, int sueldoMensual,int ventasMinimas, int bono, int ventasMes) {
        super(nombre, apellido, dni, sueldoMensual);
        this.ventasMinimas = ventasMinimas;
        this.bono = bono;
        this.ventasMes = ventasMes;
    }

    @Override
    public int getSueldoMensual() {
        if(ventasMes > ventasMinimas) {
            return super.getSueldoMensual() + bono;
        }
        return super.getSueldoMensual();
    }

    public int getVentasMinimas() {
        return ventasMinimas;
    }


    public void setVentasMinimas(int ventasMinimas) {
        this.ventasMinimas = ventasMinimas;
    }


    public int getBono() {
        return bono;
    }


    public void setBono(int bono) {
        this.bono = bono;
    }

    public int getVentasMes() {
        return ventasMes;
    }

    public void setVentasMes(int ventasMes) {
        this.ventasMes = ventasMes;
    }

    
}
