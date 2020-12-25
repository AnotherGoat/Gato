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
    public void llenarCasilla(int posicion, Tablero tablero) {

        if (posicion < 0 || posicion > 8) {
            System.out.println("Posición fuera del rango");
        } else {

            Casilla casillaObjetivo = tablero.getCasillas()[posicion];
            if (casillaObjetivo.getEstado() != EstadoCasilla.VACIO) {
                System.out.println("La casilla ya está llena");
            } else {
                casillaObjetivo.setEstado(figura);
            }
        }
    }

    /* Getters */
    public String getNombre() {
        return nombre;
    }

    public EstadoCasilla getFigura() {
        return figura;
    }
}
