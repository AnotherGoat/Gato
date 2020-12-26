package gui;

import modelo.Tablero;

import javax.swing.*;
import java.awt.*;

import static java.awt.Color.BLACK;

public class PanelTablero extends JPanel {

    /* Atributos */
    private final Tablero tablero;

    /* Botones */
    private BotonCasilla[] casillas;

    /* Constructores */
    public PanelTablero(Tablero tablero) {
        this.tablero = tablero;                     // Inicia el tablero

        configurarTablero();
        inicializarCasillas();
        agregarCasillas();
    }

    /* Métodos de inicialización */
    private void configurarTablero() {
        setLayout(new GridLayout(3, 3));
        setBorder(BorderFactory.createLineBorder(BLACK, 3));
        setBackground(BLACK);
    }

    private void inicializarCasillas() {
        casillas = new BotonCasilla[9];             // Inicia el arreglo que tiene las casillas

        // Inicializa todas las casillas del tablero
        for (var i = 0; i < casillas.length; i++) {
            casillas[i] = new BotonCasilla(tablero.getCasillas()[i]);
        }
    }

    private void agregarCasillas() {
        for (var c : casillas) {
            add(c);
        }
    }
}
