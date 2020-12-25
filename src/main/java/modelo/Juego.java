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

        System.out.println(jugadores[0].getNombre());
        System.out.println(jugadores[1].getNombre());
    }


}
