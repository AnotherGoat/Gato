package modelo;

/**
 * El tablero es el área de  principal, que se compone de 3x3 = 9 casillas<br>
 * Los índices de las casillas en un tablero se ven así:<br>
 * 0  1  2<br>
 * 3  4  5<br>
 * 6  7  8
 */
public class Tablero {

    /* Atributos */
    private Casilla[] casillas;

    /* Constructores */
    public Tablero() {
        // Inicializar tablero de 3x3
        casillas = new Casilla[9];

        // Inicializa todas las casillas del tablero
        for (int i = 0; i < casillas.length; i++) {
            casillas[i] = new Casilla();
        }

        mostrarTablero();
    }

    /* Métodos */
    public void mostrarTablero() {

        for (int i = 0; i < casillas.length; i++) {

            if (i > 0 && i % 3 == 0) {              // Después de la primera fila
                System.out.println();               // Separa cada fila que le sigue con un salto de linea
            }

            Casilla c = casillas[i];
            System.out.print(c.getSimbolo());
        }
    }

    /* Getters */

    public Casilla[] getCasillas() {
        return casillas;
    }
}