public class AlarmaLuminosa extends Alarma {

    public AlarmaLuminosa(boolean vidrioRoto, boolean ventanaPuertaAbierta, boolean movimiento) {
        super(vidrioRoto,ventanaPuertaAbierta,movimiento);
    }

    @Override
    public void comprobar() {
        if(ventanaPuertaAbierta) {
            //timbre.hacerSonar() metodo inexistente
            //luz.encender()
        } else {
            if(vidrioRoto) {
                //timbre.hacerSonar() metodo inexistente
                //luz.encender()
            } else {
                if(movimiento) {
                    //timbre.hacerSonar() metodo inexistente
                    //luz.encender()
                } else {
                    //no pasa nada
                }
            }
        }
    }
}
