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
        this.numero = 1;
        this.posicionActual = 0;
    }

    /* Métodos */
    public void avanzar() {
        if (juego.getEstado() != EstadoJuego.TERMINADO) {
            numero++;
            posicionActual = posicionActual++ % orden.length;
        }
    }

    /* Setters */
    public void setOrden(Jugador[] orden) {
        this.orden = orden;
    }
}
