package modelo;

/**
 * Un jugador es una persona o IA que se encarga de llenar las casillas
 */
public class Jugador {

    /* Atributos */
    private final String nombre;
    private final EstadoCasilla simbolo;
    private final TipoJugador tipo;

    /* Constructores */
    public Jugador(String nombre, EstadoCasilla simbolo, TipoJugador tipo) {
        this.nombre = nombre;
        this.simbolo = simbolo;
        this.tipo = tipo;
    }

    /* Getters */
    public String getNombre() {
        return nombre;
    }

    public EstadoCasilla getSimbolo() {
        return simbolo;
    }

    public String getFigura() {
        return switch (simbolo) {
            case CRUZ -> "X";
            case CIRCULO -> "O";
            case VACIO -> "";
        };
    }
}
