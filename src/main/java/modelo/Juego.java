package modelo;

public class Juego {

    /* Atributos */
    private Tablero tablero;
    private Jugador[] jugadores;
    private EstadoJuego estado;
    private Jugador ganador;

    /* Constructor */
    public Juego() {
        tablero = new Tablero();
        jugadores = new Jugador[2];

        jugadores[0] = new Jugador("J1", EstadoCasilla.CRUZ, TipoJugador.PERSONA);
        jugadores[1] = new Jugador("J2", EstadoCasilla.CIRCULO, TipoJugador.PERSONA);

        estado = EstadoJuego.INICIADO;

        System.out.println();

        System.out.println("\n"+jugadores[0].getNombre()+"\t"+jugadores[1].getNombre());

        System.out.println();

        // Turno 1
        jugadores[0].llenarCasilla(1, tablero);

        // Turno 2
        jugadores[1].llenarCasilla(3, tablero);

        tablero.mostrarTablero();
    }

    /* Getters */
    public EstadoJuego getEstado() {
        return estado;
    }
}
