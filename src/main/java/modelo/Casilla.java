package modelo;

/**
 * Una casilla es cada sección en la que se divide el tablero y que cada jugador puede llenar
 */
public class Casilla {

    /* Atributos */
    private EstadoCasilla estado;
    private char simbolo;

    /* Constructores */
    public Casilla() {
        setEstado(EstadoCasilla.VACIO);         // Una casilla inicia siempre vacía
    }

    /* Métodos */

    /* Getters */
    public char getSimbolo() {
        return simbolo;
    }

    public EstadoCasilla getEstado() {
        return estado;
    }

    /* Setters */
    public void setEstado(EstadoCasilla estado) {
        this.estado = estado;

        switch(estado) {                        // Dependiendo del estado, se elige el carácter de la casilla
            case VACIO -> simbolo = '-';
            case CRUZ -> simbolo = 'X';
            case CIRCULO -> simbolo = 'O';
        }
    }
}
