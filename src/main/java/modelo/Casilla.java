package modelo;

/**
 * Una casilla es cada sección en la que se divide el tablero y que cada jugador puede llenar
 */
public class Casilla {

    /* Atributos */
    private EstadoCasilla estado;
    private char caracter;

    /* Constructores */
    public Casilla() {
        estado = EstadoCasilla.VACIO;
        caracter = '-';
    }

    /* Métodos */

    /* Setters y Getters */
    public void setEstado(EstadoCasilla estado) {
        this.estado = estado;

    }

    public char getCaracter() {
        return caracter;
    }
}
