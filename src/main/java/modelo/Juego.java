package modelo;

import static lanzador.App.config;

public class Juego {

    /* Atributos */
    private Tablero tablero;
    private Jugador[] jugadores;
    private SistemaTurnos sistemaTurnos;
    private boolean terminado;
    private boolean empate;

    /* Constructor */
    public Juego(Config config) {
        tablero = new Tablero();
        jugadores = new Jugador[2];

        var nombres= config.getNombres();
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

        if(resultado) {                                         // Registra que ha terminado el juego
            terminado = true;                                   // Y revisa si ocurrió un empate
            empate = false;
        } else {
            if (sistemaTurnos.getNumero() == 9){
                terminado = true;
                empate = true;
            }
        }

        return resultado;
    }

    public void nuevoJuego() {
        tablero = new Tablero();
        jugadores = new Jugador[2];

        var nombres= config.getNombres();
        var estados = config.getSimbolos();
        var tipos = config.getTipos();

        jugadores[0] = new Jugador(nombres[0], estados[0], tipos[0]);
        jugadores[1] = new Jugador(nombres[1], estados[1], tipos[1]);

        sistemaTurnos = new SistemaTurnos(this, config.getOrden());

        terminado = false;
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
        return jugadores[0].getNombre()+" vs. "+jugadores[1].getNombre();
    }

}
