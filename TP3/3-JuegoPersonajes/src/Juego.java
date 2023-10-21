import java.util.ArrayList;

public class Juego {
    private String nombreJuego;
    private ArrayList<Personaje> personajes;


    public Juego(String nombreJuego) {
        this.nombreJuego = nombreJuego;
    }

    public Juego(String nombreJuego, ArrayList<Personaje> personajes) {
        this.nombreJuego = nombreJuego;
        this.personajes = personajes;
    }

    public void enfrentamiento(Personaje pj1, Personaje pj2) {
        Personaje ganador;
       int numRandom = (int) (Math.random() * 5) + 1; 
       if(numRandom == 1){
            ganador = vsVelocidad(pj1, pj2);
            System.out.println("El ganador es: " + ganador.getNombre() + " con " + ganador.getVelocidad() + " puntos de velocidad");
       } else {
            if(numRandom == 2) {
                ganador = vsFuerza(pj1,pj2);
                System.out.println("El ganador es: " + ganador.getNombre() + " con " + ganador.getFuerza() + " puntos de Fuerza");

            } else {
                if(numRandom == 3) {
                    ganador = vsPeso(pj1,pj2);
                    System.out.println("El ganador es: " + ganador.getNombre() + " con " + ganador.getPeso() + " puntos de Peso");

                } else {
                    if(numRandom == 4) {
                        ganador = vsAltura(pj1, pj2);
                        System.out.println("El ganador es: " + ganador.getNombre() + " con " + ganador.getAltura() + " puntos de Altura");

                    } else {
                      if(numRandom == 5) {
                         ganador = vsEdad(pj1,pj2);
                         System.out.println("El ganador es: " + ganador.getNombre() + " con " + ganador.getEdad() + " puntos de Edad");
                     }
                }
            }
        }
       }
       

    }

    public Personaje vsVelocidad(Personaje pj1, Personaje pj2) {
        if(pj1.getVelocidad() > pj2.getVelocidad()) {
            return pj1;
        } else {
            if(pj1.getVelocidad() < pj2.getVelocidad()) {
                return pj2;
            } else {
                return null;
            }
        }
    }

    public Personaje vsFuerza(Personaje pj1, Personaje pj2) {
        if(pj1.getFuerza() > pj2.getFuerza()) {
            return pj1;
        } else {
            if(pj1.getFuerza() < pj2.getFuerza()) {
                return pj2;
            } else {
                return null;
            }
        }
    }

    public Personaje vsPeso(Personaje pj1, Personaje pj2) {
        if(pj1.getPeso() > pj2.getPeso()) {
            return pj1;
        } else {
            if(pj1.getPeso() < pj2.getPeso()) {
                return pj2;
            } else {
                return null;
            }
        }
    }

    public Personaje vsAltura(Personaje pj1, Personaje pj2) {
        if(pj1.getAltura() > pj2.getAltura()) {
            return pj1;
        } else {
            if(pj1.getAltura() < pj2.getAltura()) {
                return pj2;
            } else {
                return null;
            }
        }
    }

    public Personaje vsEdad(Personaje pj1, Personaje pj2) {
        if(pj1.getEdad() > pj2.getEdad()) {
            return pj1;
        } else {
            if(pj1.getEdad() < pj2.getEdad()) {
                return pj2;
            } else {
                return null;
            }
        }
    }

    public String getNombreJuego() {
        return nombreJuego;
    }

    public void setNombreJuego(String nombreJuego) {
        this.nombreJuego = nombreJuego;
    }

    public ArrayList<Personaje> getPersonajes() {
        return personajes;
    }

    public void setPersonajes(ArrayList<Personaje> personajes) {
        this.personajes = personajes;
    }

}
