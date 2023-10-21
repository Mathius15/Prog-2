public class Alarma {
    private boolean vidrioRoto;
    private boolean ventanaPuertaAbierta;
    private boolean movimiento;


    public Alarma(boolean vidrioRoto, boolean ventanaPuertaAbierta, boolean movimiento) {
        this.vidrioRoto = vidrioRoto;
        this.ventanaPuertaAbierta = ventanaPuertaAbierta;
        this.movimiento = movimiento;
    }

    public void comprobar() {
        if(ventanaPuertaAbierta) {
            //timbre.hacerSonar() metodo inexistente
        } else {
            if(vidrioRoto) {
                //timbre.hacerSonar() metodo inexistente
            } else {
                if(movimiento) {
                    //timbre.hacerSonar() metodo inexistente
                } else {
                    //no pasa nada
                }
            }
        }
    }
    
}
