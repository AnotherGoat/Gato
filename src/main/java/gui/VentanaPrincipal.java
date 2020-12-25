package gui;

import modelo.Juego;
import modelo.SistemaTurnos;

import javax.swing.*;
import java.awt.*;

import static javax.swing.SwingConstants.CENTER;

public class VentanaPrincipal extends JFrame {

    /* Atributos */
    Juego juego;
    SistemaTurnos sistemaTurnos;
    JPanel panel;
    PanelTablero tablero;
    JLabel labelJugadores;
    LabelTurno labelTurno;

    /* Constructores */
    public VentanaPrincipal() {
        juego = new Juego();
        sistemaTurnos = juego.getSistemaTurnos();

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

        panel = new JPanel();
        panel.setLayout(new BorderLayout());

        tablero = new PanelTablero(juego.getTablero());

        labelJugadores = new JLabel(juego.toString());
        labelJugadores.setHorizontalAlignment(CENTER);

        labelTurno = new LabelTurno(sistemaTurnos.toString());
    }

    private void ubicarComponentes() {

        panel.add(tablero, BorderLayout.CENTER);
        panel.add(labelJugadores, BorderLayout.NORTH);
        panel.add(labelTurno, BorderLayout.SOUTH);

        add(panel, BorderLayout.CENTER);

    }

    /* Métodos */
    public void avanzarTurno() {
        sistemaTurnos.avanzar();

        panel.remove(labelTurno);
        labelTurno = new LabelTurno(sistemaTurnos.toString());
        panel.add(labelTurno, BorderLayout.SOUTH);
    }

    /* Getters */
    public SistemaTurnos getSistemaTurnos() {
        return sistemaTurnos;
    }

    public JLabel getLabelTurno() {
        return labelTurno;
    }
}
