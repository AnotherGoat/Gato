package modelo;

public class SistemaTurnos {

    /* Atributos */
    Juego juego;
    int numero;
    Jugador[] orden;
    int posicionActual;

    /* Constructores */
    public SistemaTurnos(Juego juego) {
        this.juego = juego;
        numero = 1;
        posicionActual = 0;

        orden = new Jugador[2];
        orden = juego.getJugadores();
    }

    /* Métodos */
    public void avanzar() {
        if (!juego.isTerminado()) {             // Si el juego todavía no termina
            numero++;
            posicionActual = (posicionActual+1) % orden.length;
        }
    }

    /* toString */
    @Override
    public String toString() {
        String nombreActual = orden[posicionActual].getNombre();       // Nombre del jugador actual
        return "Turno " + numero +": "+nombreActual;
    }
}
