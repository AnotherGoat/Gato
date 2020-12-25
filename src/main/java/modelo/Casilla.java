package modelo;

/**
 * Una casilla es cada sección en la que se divide el tablero y que cada jugador puede llenar
 */
public class Casilla {

    /* Atributos */
    private EstadoCasilla estado;

    /* Constructores */
    public Casilla() {
        estado = EstadoCasilla.VACIO;         // Una casilla inicia siempre vacía
    }

    /* Getters */
    public EstadoCasilla getEstado() {
        return estado;
    }

    /* Setters */
    public void setEstado(EstadoCasilla estado) {
        this.estado = estado;
    }
}
