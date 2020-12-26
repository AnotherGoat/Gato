package gui;

import javax.swing.*;
import java.awt.*;

public class PanelConfig extends JPanel {

    /* Atributos */
    JButton botonNuevoJuego;
    JButton botonConfig;
    JButton botonSalir;

    /* Constructores */
    public PanelConfig() {
        inicializar();
    }

    /* Métodos de inicialización */
    private void inicializar() {
        botonNuevoJuego = new JButton("Nuevo Juego");
        botonConfig = new JButton("Opciones");
        botonSalir = new JButton("Salir");

        add(botonNuevoJuego);
        add(botonConfig);
        add(botonSalir);
    }
}
