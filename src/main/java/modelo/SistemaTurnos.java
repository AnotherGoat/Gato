package modelo;

public class SistemaTurnos {

    /* Atributos */
    private Juego juego;
    private int numero;
    private Jugador[] orden;
    private int posicionActual;

    /* Constructores */
    public SistemaTurnos(Juego juego) {
        this.juego = juego;
        numero = 1;
        posicionActual = 0;

        orden = new Jugador[2];
        orden = juego.getJugadores();
    }

    /* Métodos */
    public void avanzar() {
        if (!juego.isTerminado()) {             // Si el juego todavía no termina
            numero++;
            posicionActual = (posicionActual+1) % orden.length;
        }
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
