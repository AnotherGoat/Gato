package modelo;

public class Juego {

    /* Atributos */
    private Tablero tablero;
    private Jugador[] jugadores;
    private boolean terminado;
    private Jugador ganador;

    /* Constructor */
    public Juego() {
        tablero = new Tablero();
        jugadores = new Jugador[2];

        jugadores[0] = new Jugador("J1", EstadoCasilla.CRUZ, TipoJugador.PERSONA);
        jugadores[1] = new Jugador("J2", EstadoCasilla.CIRCULO, TipoJugador.PERSONA);

        terminado = false;
    }

    /* Getters */
    public boolean isTerminado() {
        return terminado;
    }

    public Tablero getTablero() {
        return tablero;
    }
}
