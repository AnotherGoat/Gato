package gui;

import modelo.Casilla;
import modelo.Tablero;

import javax.swing.*;
import java.awt.*;

public class PanelTablero extends JPanel {

    /* Atributos */
    Tablero tablero;
    BotonCasilla[] casillas;

    /* Constructores */
    public PanelTablero(Tablero tablero) {
        this.tablero = tablero;                     // Inicia el tablero
        casillas = new BotonCasilla[9];             // Inicia el arreglo con las casillas

        // Inicializa todas las casillas del tablero
        for (int i = 0; i < casillas.length; i++) {
            casillas[i] = new BotonCasilla(tablero.getCasillas()[i]);
        }

        inicializar();
    }

    /* Métodos de inicialización */
    private void inicializar() {
        setLayout(new GridLayout(3,3));

        for(BotonCasilla c : casillas){
            add(c);
        }
    }
}
