package gui;

import modelo.Juego;

import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal extends JFrame {

    /* Atributos */
    Juego juego;
    JPanel panel;

    /* Constructores */
    public VentanaPrincipal() {
        juego = new Juego();
        panel = new JPanel();

        inicializar();

        setVisible(true);                           // Ventana visible
    }

    /* Métodos de inicialización */
    private void inicializar() {
        setTitle("Gato");                           // Título: Gato
        setSize(600,600);               // Tamaño inicial: 600x600
        setLocationRelativeTo(null);                // Inicia centrada
        setLayout(new BorderLayout());              // Para que el panel principal llene la ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE);    // Al cerrar la ventana, se cierra el programa

        var tablero = new PanelTablero(juego.getTablero());

        panel.setLayout(new BorderLayout());
        panel.add(tablero, BorderLayout.CENTER);
        add(panel, BorderLayout.CENTER);
    }
}
