package modelo;

public class Juego {

    /* Atributos */
    private Tablero tablero;
    private Jugador[] jugadores;
    private SistemaTurnos sistemaTurnos;
    private boolean terminado;
    private Jugador ganador;

    /* Constructor */
    public Juego() {
        tablero = new Tablero();
        jugadores = new Jugador[2];

        jugadores[0] = new Jugador("Jugador 1", EstadoCasilla.CRUZ, TipoJugador.PERSONA);
        jugadores[1] = new Jugador("Jugador 2", EstadoCasilla.CIRCULO, TipoJugador.PERSONA);

        sistemaTurnos = new SistemaTurnos(this);

        terminado = false;
    }

    /* Métodos */
    public void avanzarTurno() {
        sistemaTurnos.avanzar();
    }

    /* Getters */
    public boolean isTerminado() {
        return terminado;
    }

    public Tablero getTablero() {
        return tablero;
    }

    public Jugador[] getJugadores() {
        return jugadores;
    }

    public String getTurno() {
        return sistemaTurnos.toString();
    }

    public Jugador getJugadorActual() {
        return sistemaTurnos.getJugadorActual();
    }

    public EstadoCasilla getSimboloActual() {
        return getJugadorActual().getSimbolo();
    }

    /* toString */
    @Override
    public String toString() {
        return jugadores[0].getNombre()+" vs. "+jugadores[1].getNombre();
    }

}
