package modelo;

/**
 * El tablero es el área de  principal, que se compone de 3x3 = 9 casillas
 */
public class Tablero {

    /* Atributos */
    private Casilla[][] casillas;

    /* Constructores */
    public Tablero() {
        // Inicializar tablero de 3x3
        casillas = new Casilla[3][3];

        // Inicializar casillas
        for(int i=0; i<3; i++) {                    // Cada fila
            for(int j=0; j<3; j++) {                // Tendrá 3 casillas
                casillas[i][j] = new Casilla();     // Empiezan vacías
            }
        }

        mostrarTablero();
    }

    /* Métodos */
    private void mostrarTablero() {

        for(Casilla[] fila : casillas){
            for(Casilla c: fila){
                System.out.print(c.getCaracter());
            }
            System.out.println();
        }

    }

}