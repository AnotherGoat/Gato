package modelo;

public class SistemaTurnos {

    /* Atributos */
    private final Juego juego;
    private int numero;
    private final Jugador[] orden;
    private int posicionActual;

    /* Constructores */
    public SistemaTurnos(Juego juego, int[] orden) {
        this.juego = juego;
        numero = 1;
        posicionActual = 0;

        this.orden = ordenarJugadores(juego.getJugadores(), orden);
    }

    /* Métodos */
    public void avanzar() {
        if (juego.isSinTerminar()) {             // Si el juego todavía no termina
            numero++;
            posicionActual = (posicionActual + 1) % orden.length;
        }
    }

    private Jugador[] ordenarJugadores(Jugador[] jugadores, int[] orden) {

        var ordenNuevo = new Jugador[jugadores.length];

        for (var i = 0; i < jugadores.length; i++) {
            ordenNuevo[i] = jugadores[orden[i]];
        }

        return ordenNuevo;
    }

    /* Getters */
    public Jugador getJugadorActual() {
        return orden[posicionActual];
    }

    public int getNumero() {
        return numero;
    }

    /* toString */
    @Override
    public String toString() {
        var nombreActual = orden[posicionActual].getNombre();        // Nombre del jugador actual
        var figuraActual = orden[posicionActual].getFigura();        // Figura que usa el jugador actual

        return "Turno " + numero + ": " + nombreActual + " (" + figuraActual + ")";
    }
}
