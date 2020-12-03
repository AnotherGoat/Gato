package modelo;

import java.util.ArrayList;
import java.util.Scanner;

public class Tablero {

    /* Atributos */
    private Casilla[][] casillas;

    /* Constructores */
    public Tablero() {
        // Inicializar tablero de 3x3
        casillas = new Casilla[3][3];

        // Inicializar casillas
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                casillas[i][j] = new Casilla();
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