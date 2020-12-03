package modelo;

public class Casilla {

    /* Atributos */
    private Estado estado;
    private char caracter;

    /* Constructores */
    public Casilla() {
        estado = Estado.VACIO;
        caracter = '-';
    }

    /* Métodos */

    /* Setters y Getters */
    public void setEstado(Estado estado) {
        this.estado = estado;

    }

    public char getCaracter() {
        return caracter;
    }
}
