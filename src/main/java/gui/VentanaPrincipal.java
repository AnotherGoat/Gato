package gui;

import javax.swing.*;
import java.awt.*;

import static lanzador.App.juego;

public class VentanaPrincipal extends JFrame {

    /* Atributos */
    JPanel panel;
    PanelTablero tablero;
    JPanel panelInfo;
    JLabel labelJugadores;
    JLabel labelTurno;

    /* Constructores */
    public VentanaPrincipal() {
        inicializar();
        inicializarComponentes();
        ubicarComponentes();

        setVisible(true);                           // Ventana visible
    }

    /* Métodos de inicialización */
    private void inicializar() {
        setTitle("Gato");                           // Título: Gato
        setSize(600,600);                           // Tamaño inicial: 600x600
        setLocationRelativeTo(null);                // Inicia centrada
        setLayout(new BorderLayout());              // Para que el panel principal llene la ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE);    // Al cerrar la ventana, se cierra el programa
    }

    private void inicializarComponentes() {

        panel = new JPanel(new BorderLayout());

        tablero = new PanelTablero(juego.getTablero());

        panelInfo = new JPanel(new BorderLayout());

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

        add(panel, BorderLayout.CENTER);
    }

    /* Métodos */
    public void avanzarTurno() {
        boolean resultado = juego.buscarGanador();                              // Revisa si hay un ganador

        if(resultado){
            String ganador = juego.getJugadorActual().getNombre();
            JOptionPane.showMessageDialog(this, "¡Ha ganado "+ganador+"!");
        } else if(juego.isEmpate()){
            JOptionPane.showMessageDialog(this, "¡Ha ocurrido un empate!");
        } else {

            juego.avanzarTurno();

            panel.remove(panelInfo);                            // Quita el panel con la información

            labelTurno = new JLabel(juego.getTurno());          // Para actualizar el texto que tiene
            labelTurno.setHorizontalAlignment(SwingConstants.CENTER);

            panelInfo = new JPanel(new BorderLayout());
            panelInfo.add(labelJugadores, BorderLayout.NORTH);
            panelInfo.add(labelTurno, BorderLayout.SOUTH);

            panel.add(panelInfo, BorderLayout.NORTH);           // Y lo vuelve a añadir con el texto nuevo
        }
    }
}
