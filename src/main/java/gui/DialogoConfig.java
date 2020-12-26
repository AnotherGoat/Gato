package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static lanzador.App.vp;

public class DialogoConfig extends JDialog implements ActionListener {

    /* Constructores */
    public DialogoConfig() {
        super(vp, ModalityType.APPLICATION_MODAL);

        inicializar();

        setVisible(true);
    }

    /* Métodos de inicialización */
    private void inicializar() {
        setTitle("Configuración de Gato");          // Título: Configuración de Gato
        setSize(400,400);               // Tamaño inicial: 400x400
        setLocationRelativeTo(null);                // Inicia centrado
        //setLayout(new BorderLayout());              // Para que el panel principal llene la ventana
        //setDefaultCloseOperation(EXIT_ON_CLOSE);    // Al cerrar la ventana, se cierra el programa
    }

    /* ActionListener */
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
