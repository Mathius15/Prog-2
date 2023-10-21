import java.util.ArrayList;

public class CentroComputos {
    private ColaComputadoras compus;
    private ArrayList<Proceso> listaProcesos;
    private ColaProcesos colaProcesos;


    public CentroComputos(ColaComputadoras compus, ColaProcesos procesos){
        this.compus = compus;
        this.colaProcesos = colaProcesos;
        listaProcesos = new ArrayList<>();


    }

    public void ejecutarListaProcesos() {
        int i = 0;
        while ((compus.hayCompus()) && (i < listaProcesos.size())) {
            ejecutarProceso(listaProcesos.get(i));
            i++;
        }
    }

    public void ejecutarColaProcesos(){
        int i = 0;
        while ((compus.hayCompus()) && (i < colaProcesos.size())) {
            ejecutarProceso(colaProcesos.primero());
            i++;
        }
    }

    public void addProceso(Proceso p) {
        listaProcesos.add(p);
    }

    public void ejecutarProceso(Proceso p) {
        if(compus.hayCompus()) {
            Computadora masRapida = compus.primero();
            p.ejecutar(masRapida);
        }
        if(!colaProcesos.contains(p)){
            colaProcesos.addProceso(p);
        }
    }

    public void addComputadora(Computadora c) {
        compus.addComputadora(c);
    }


}
