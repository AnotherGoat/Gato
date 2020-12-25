package modelo;

/**
 * Una casilla es cada sección en la que se divide el tablero y que cada jugador puede llenar
 */
public class Casilla {

    /* Atributos */
    private EstadoCasilla estado;

    /* Constructores */
    public Casilla() {
        setEstado(EstadoCasilla.CIRCULO);         // Una casilla inicia siempre vacía
    }

    /* Métodos */

    /* Getters */
    public EstadoCasilla getEstado() {
        return estado;
    }

    /* Setters */
    public void setEstado(EstadoCasilla estado) {
        this.estado = estado;
    }
}
