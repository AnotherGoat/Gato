package gui;

import modelo.Juego;

import javax.swing.*;

import static lanzador.App.*;

public class PanelConfig extends JPanel {

    /* Botones */
    private JButton botonNuevoJuego;
    private JButton botonConfig;
    private JButton botonSalir;

    /* Constructores */
    public PanelConfig() {
        inicializarBotones();
        ubicarBotones();
        agregarListeners();
    }

    /* Métodos de inicialización */
    private void inicializarBotones() {
        botonNuevoJuego = new JButton("Nuevo Juego");
        botonConfig = new JButton("Opciones");
        botonSalir = new JButton("Salir");
    }

    private void ubicarBotones() {
        add(botonNuevoJuego);
        add(botonConfig);
        add(botonSalir);
    }

    private void agregarListeners() {
        botonNuevoJuego.addActionListener(e -> {
            if (e.getSource() == botonNuevoJuego) {
                vp.dispose();

                if (config.isAlternar()) {                  // Invierte el orden de jugadores
                    config.invertirOrden();                 // Si la configuración dice que lo haga
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
