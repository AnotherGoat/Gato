package gui;

import modelo.Juego;

import javax.swing.*;

import static lanzador.App.*;

public class PanelConfig extends JPanel {

    /* Atributos */
    private JButton botonNuevoJuego;
    private JButton botonConfig;
    private JButton botonSalir;

    /* Constructores */
    public PanelConfig() {
        inicializar();
        iniciarListeners();
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

    private void iniciarListeners() {
        botonNuevoJuego.addActionListener(e -> {
            if (e.getSource() == botonNuevoJuego) {
                vp.dispose();

                if (config.isAlternar()) {
                    config.invertirOrden();
                }

                juego = new Juego(config);
                vp = new VentanaPrincipal();
            }
        });

        botonConfig.addActionListener(e -> {
            if (e.getSource() == botonConfig) {
                new DialogoConfig();
            }
        });

        botonSalir.addActionListener(e -> {
            if (e.getSource() == botonSalir) {
                vp.dispose();
            }
        });
    }
}
