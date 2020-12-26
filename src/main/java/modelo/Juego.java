package modelo;

public class Juego {

    /* Atributos */
    private final Tablero tablero;
    private final Jugador[] jugadores;
    private final SistemaTurnos sistemaTurnos;
    private boolean terminado;
    private boolean empate;

    /* Constructor */
    public Juego(Config config) {
        tablero = new Tablero();
        jugadores = new Jugador[2];

        var nombres = config.getNombres();
        var estados = config.getSimbolos();
        var tipos = config.getTipos();

        jugadores[0] = new Jugador(nombres[0], estados[0], tipos[0]);
        jugadores[1] = new Jugador(nombres[1], estados[1], tipos[1]);

        sistemaTurnos = new SistemaTurnos(this, config.getOrden());

        terminado = false;
    }

    /* Métodos */
    public void avanzarTurno() {
        sistemaTurnos.avanzar();
    }

    public boolean buscarGanador() {
        boolean resultado = tablero.buscarLineas(getSimboloActual());

        if (resultado) {                                         // Registra que ha terminado el juego
            terminado = true;                                   // Y revisa si ocurrió un empate
            empate = false;
        } else {
            if (sistemaTurnos.getNumero() == 9) {
                terminado = true;
                empate = true;
            }
        }

        return resultado;
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

    public boolean isEmpate() {
        return empate;
    }

    /* toString */
    @Override
    public String toString() {
        var nombreJ1 = jugadores[0].getNombre();
        var figuraJ1 = jugadores[0].getFigura();
        var nombreJ2 = jugadores[1].getNombre();
        var figuraJ2 = jugadores[1].getFigura();

        return nombreJ1 + " (" + figuraJ1 + ") vs. " + nombreJ2 + " (" + figuraJ2 + ")";
    }

}
