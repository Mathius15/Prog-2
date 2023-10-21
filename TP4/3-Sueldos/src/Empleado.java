public class Empleado {
    public int salarioFijoSemanal;

    public Empleado (int salario) {
        this.salarioFijoSemanal = salario;
    }

    public int sueldoSemanal() {
        return 0;
    }

    public int getSalarioFijoSemanal() {
        return salarioFijoSemanal;
    }

    public void setSalarioFijoSemanal(int salarioFijoSemanal) {
        this.salarioFijoSemanal = salarioFijoSemanal;
    }
}