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
    private final Casilla[] casillas;

    /* Constructores */
    public Tablero() {

        casillas = new Casilla[9];                          // Inicializa todas las casillas
        for (var i = 0; i < casillas.length; i++) {         // Para que todas empiecen vacías
            casillas[i] = new Casilla();
        }
    }

    /* Métodos */
    public boolean buscarLineas(EstadoCasilla estado) {

        // Estados
        var e = new EstadoCasilla[9];

        for (var i = 0; i < casillas.length; i++) {
            e[i] = casillas[i].getEstado();
        }

        for (var i = 0; i < 9; i = i + 3) {                              // Revisa cada fila
            if (e[i] == estado && e[i] == e[i + 1] && e[i] == e[i + 2]) {
                return true;
            }
        }

        for (var i = 0; i < 3; i = i + 1) {                              // Revisa cada columna
            if (e[i] == estado && e[i] == e[i + 3] && e[i] == e[i + 6]) {
                return true;
            }
        }

        if (e[0] == estado && e[0] == e[4] && e[0] == e[8]) {        // Revisa cada diagonal
            return true;
        }

        return e[2] == estado && e[2] == e[4] && e[2] == e[6];
    }

    /* Getters */
    public Casilla[] getCasillas() {
        return casillas;
    }
}