package modelo;

/**
 * Un jugador es una persona o IA que se encarga de llenar las casillas
 */
public class Jugador {

    /* Atributos */
    private String nombre;
    private EstadoCasilla figura;
    private TipoJugador tipo;

    /* Constructores */
    public Jugador(String nombre, EstadoCasilla figura, TipoJugador tipo) {
        this.nombre = nombre;
        this.figura = figura;
        this.tipo = tipo;
    }

    /* Métodos */
    private void llenarCasilla(int posicion, Tablero tablero) {

    }

    /* Getters */
    public String getNombre() {
        return nombre;
    }
}
