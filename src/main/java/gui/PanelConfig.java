package gui;

import modelo.Juego;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static lanzador.App.config;
import static lanzador.App.juego;
import static lanzador.App.vp;

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
        botonNuevoJuego.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == botonNuevoJuego) {
                    vp.dispose();

                    if(config.isAlternar()) {
                        config.invertirOrden();
                    }

                    juego = new Juego(config);
                    vp = new VentanaPrincipal();
                }
            }
        });

        botonConfig.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == botonConfig) {
                    new DialogoConfig();
                }
            }
        });

        botonSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == botonSalir) {
                    vp.dispose();
                }
            }
        });
    }
}
