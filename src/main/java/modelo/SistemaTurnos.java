package modelo;

public class SistemaTurnos {

    /* Atributos */
    Juego juego;
    int numero;
    Jugador[] orden;
    int posicionActual;

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
            posicionActual = posicionActual++ % orden.length;
        }
    }
}
