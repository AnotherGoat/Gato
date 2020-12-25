package gui;

import javax.swing.*;

public class VentanaPrincipal extends JFrame {

    /* Constructores */
    public VentanaPrincipal() {
        inicializar();
    }

    /* Métodos de inicialización */
    private void inicializar() {
        setTitle("Gato");                       // Título: Gato
        setSize(600,600);           // Tamaño inicial: 600x600
        setLocationRelativeTo(null);            // Inicia centrada
        setVisible(true);                       // Ventana visible
    }
}
