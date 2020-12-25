package gui;

import modelo.Casilla;
import modelo.EstadoCasilla;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static lanzador.App.juego;
import static lanzador.App.vp;

public class BotonCasilla extends JButton implements ActionListener {

    /* Atributos */
    private Casilla casilla;

    /* Constructores */
    public BotonCasilla(Casilla casilla) {
        this.casilla = casilla;

        setBorder(BorderFactory.createLineBorder(Color.BLACK,3));
        setFont(new Font("Arial", Font.BOLD, 200));

        setHorizontalAlignment(CENTER);
        setVerticalAlignment(CENTER);

        actualizarAspecto();

        addActionListener(this);
    }

    /* Métodos */
    public void actualizarAspecto(){
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

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this) {

            if(casilla.getEstado() == EstadoCasilla.VACIO) {
                casilla.setEstado(juego.getSimboloActual());
                actualizarAspecto();
                vp.avanzarTurno();
            }
        }
    }
}
