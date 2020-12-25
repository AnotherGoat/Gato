package gui;

import modelo.Casilla;

import javax.swing.*;
import java.awt.*;

public class BotonCasilla extends JLabel {

    /* Atributos */
    private char simbolo;

    /* Constructores */
    public BotonCasilla(Casilla casilla) {
        setBorder(BorderFactory.createLineBorder(Color.BLACK,3));
        setFont(new Font("Arial", Font.BOLD, 200));

        setHorizontalAlignment(CENTER);
        setVerticalAlignment(CENTER);

        switch (casilla.getEstado()) {          // Dependiendo del estado, se elige el diseño de la casilla
            case VACIO -> {
                setForeground(Color.WHITE);
                setText("");
            }
            case CRUZ -> {
                setForeground(Color.RED);
                setText("X");
            }
            case CIRCULO -> {
                setForeground(Color.BLUE);
                setText("O");
            }
        }
    }
}
