package modelo;

public class SistemaTurnos {

    /* Atributos */
    private Juego juego;
    private int numero;
    private Jugador[] orden;
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
        if (!juego.isTerminado()) {             // Si el juego todavía no termina
            numero++;
            posicionActual = (posicionActual+1) % orden.length;
        }
    }

    public Jugador[] ordenarJugadores(Jugador[] jugadores, int[] orden) {

        var ordenNuevo = new Jugador[jugadores.length];

        for (int i=0; i<jugadores.length; i++) {
            for (int o : orden) {
                ordenNuevo[i] = jugadores[o];
            }
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
        String nombreActual = orden[posicionActual].getNombre();       // Nombre del jugador actual
        return "Turno " + numero +": "+nombreActual;
    }
}
