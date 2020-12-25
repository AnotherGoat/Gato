package gui;

import modelo.Juego;
import modelo.SistemaTurnos;

import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal extends JFrame {

    /* Atributos */
    Juego juego;
    SistemaTurnos sistemaTurnos;
    JPanel panel;
    JLabel labelJugadores;
    JLabel labelTurno;
    PanelTablero tablero;

    /* Constructores */
    public VentanaPrincipal() {
        juego = new Juego();
        sistemaTurnos = new SistemaTurnos(juego);
        panel = new JPanel();

        inicializar();
        inicializarComponentes();
        ubicarComponentes();

        setVisible(true);                           // Ventana visible
    }

    /* Métodos de inicialización */
    private void inicializar() {
        setTitle("Gato");                           // Título: Gato
        setSize(600,600);               // Tamaño inicial: 600x600
        setLocationRelativeTo(null);                // Inicia centrada
        setLayout(new BorderLayout());              // Para que el panel principal llene la ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE);    // Al cerrar la ventana, se cierra el programa



    }

    private void inicializarComponentes() {
        panel.setLayout(new BorderLayout());
        tablero = new PanelTablero(juego.getTablero());
    }

    private void ubicarComponentes() {
        panel.add(tablero, BorderLayout.CENTER);
        add(panel, BorderLayout.CENTER);
    }
}
