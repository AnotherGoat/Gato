package gui;

import javax.swing.*;
import java.awt.*;

import static lanzador.App.juego;

public class VentanaPrincipal extends JFrame {

    /* Paneles */
    private JPanel panel;
    private PanelTablero tablero;
    private JPanel panelInfo;
    private PanelConfig panelConfig;

    /* Labels */
    private JLabel labelJugadores;
    private JLabel labelTurno;

    /* Constructores */
    public VentanaPrincipal() {
        configurarVentana();
        inicializarPaneles();
        inicializarLabels();
        ubicarComponentes();

        setVisible(true);                           // Ventana visible
    }

    /* Métodos de inicialización */
    private void configurarVentana() {
        setTitle("Gato");                           // Título: Gato
        setSize(600, 660);              // Tamaño inicial: 600x660
        setLocationRelativeTo(null);                // Inicia centrada
        setDefaultCloseOperation(EXIT_ON_CLOSE);    // Al cerrar la ventana, se cierra el programa
    }

    private void inicializarPaneles() {
        panel = new JPanel(new BorderLayout());             // Para que el panel principal llene la ventana

        tablero = new PanelTablero(juego.getTablero());

        panelInfo = new JPanel(new BorderLayout());

        panelConfig = new PanelConfig();
    }

    private void inicializarLabels() {
        labelJugadores = new JLabel(juego.toString());
        labelJugadores.setHorizontalAlignment(SwingConstants.CENTER);

        labelTurno = new JLabel(juego.getTurno());
        labelTurno.setHorizontalAlignment(SwingConstants.CENTER);
    }

    private void ubicarComponentes() {
        panelInfo.add(labelJugadores, BorderLayout.NORTH);
        panelInfo.add(labelTurno, BorderLayout.SOUTH);

        panel.add(tablero, BorderLayout.CENTER);
        panel.add(panelInfo, BorderLayout.NORTH);
        panel.add(panelConfig, BorderLayout.SOUTH);

        add(panel);
    }


    /* Métodos */
    public void avanzarTurno() {
        var resultado = juego.buscarGanador();      // Revisa si hay un ganador

        if (resultado) {
            var ganador = juego.getJugadorActual().getNombre();
            JOptionPane.showMessageDialog(null, "¡Ha ganado " + ganador + "!");
        } else if (juego.isEmpate()) {
            JOptionPane.showMessageDialog(null, "¡Ha ocurrido un empate!");
        } else {

            juego.avanzarTurno();

            labelTurno.setText(juego.getTurno());           // Actualiza el texto del turno

            revalidate();                                   // Vuelve a pintar la ventana
            repaint();
        }
    }
}
