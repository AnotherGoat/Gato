package modelo;

/**
 * Un jugador es una persona o IA que se encarga de llenar las casillas
 */
public class Jugador {

    /* Atributos */
    String nombre;
    EstadoCasilla figura;
    TipoJugador tipo;

    /* Constructores */
    public Jugador(String nombre, EstadoCasilla figura, TipoJugador tipo) {
        this.nombre = nombre;
        this.figura = figura;
        this.tipo = tipo;
    }

    /* Métodos */
    private void llenarCasilla(int posicionX, int posicionY, Tablero tablero) {



    }

}
