package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static lanzador.App.vp;

public class DialogoConfig extends JDialog implements ActionListener {

    /* Atributos */
    private JPanel panel;
    private JPanel panelOpciones;

    private JLabel labelNombreJ1;
    private JTextField campoNombreJ1;

    private JLabel labelSimboloJ1;
    private JPanel panelSimboloJ1;

    private JLabel labelNombreJ2;
    private JTextField campoNombreJ2;

    private JLabel labelSimboloJ2;
    private JPanel panelSimboloJ2;

    private JPanel panelNota;
    private JLabel labelNota;

    /* Constructores */
    public DialogoConfig() {
        super(vp, ModalityType.APPLICATION_MODAL);

        inicializar();
        inicializarComponentes();
        ubicarComponentes();

        setVisible(true);                               // Diálogo visible
    }

    /* Métodos de inicialización */
    private void inicializar() {
        setTitle("Configuración de Gato");              // Título: Configuración de Gato
        setSize(500, 500);                   // Tamaño inicial: 500x500
        setLocationRelativeTo(null);                    // Inicia centrado
    }

    private void inicializarComponentes() {

        panel = new JPanel(new BorderLayout());             // Para que el panel principal llene la ventana

        /* Panel con opciones */
        panelOpciones = new JPanel(new GridLayout(14, 1));

        /* JRadioButton */
        JRadioButton radio1 = new JRadioButton("Cruz", true);
        JRadioButton radio2 = new JRadioButton("Círculo", false);
        JRadioButton radio3 = new JRadioButton("Persona", true);
        radio3.setEnabled(false);
        JRadioButton radio4 = new JRadioButton("IA", false);
        radio4.setEnabled(false);
        JRadioButton radio5 = new JRadioButton("Cruz", false);
        JRadioButton radio6 = new JRadioButton("Círculo", true);

        /* Opción 1 */
        labelNombreJ1 = new JLabel("Nombre de jugador 1:");

        campoNombreJ1 = new JTextField(10);

        /* Opción 2 */
        labelSimboloJ1 = new JLabel("Símbolo de jugador 1:");

        panelSimboloJ1 = new JPanel();
        panelSimboloJ1.add(radio1);
        panelSimboloJ1.add(radio2);

        var grupoSimboloJ1 = new ButtonGroup();
        grupoSimboloJ1.add(radio1);
        grupoSimboloJ1.add(radio2);

        /* Opción 3 */
        labelNombreJ2 = new JLabel("Nombre de jugador 2:");

        campoNombreJ2 = new JTextField(10);

        /* Opción 4 */
        labelSimboloJ2 = new JLabel("Símbolo de jugador 2:");

        panelSimboloJ2 = new JPanel();
        panelSimboloJ2.add(radio5);
        panelSimboloJ2.add(radio6);

        var grupoSimboloJ2 = new ButtonGroup();
        grupoSimboloJ2.add(radio5);
        grupoSimboloJ2.add(radio6);

        /* Panel con la nota */
        panelNota = new JPanel();

        labelNota = new JLabel("Los cambios se aplicarán cuando inicie un nuevo juego.");
    }

    private void ubicarComponentes() {

        panelOpciones.add(labelNombreJ1);
        panelOpciones.add(campoNombreJ1);
        panelOpciones.add(labelSimboloJ1);
        panelOpciones.add(panelSimboloJ1);

        panelOpciones.add(labelNombreJ2);
        panelOpciones.add(campoNombreJ2);
        panelOpciones.add(labelSimboloJ2);
        panelOpciones.add(panelSimboloJ2);

        panelNota.add(labelNota);

        panel.add(panelOpciones, BorderLayout.CENTER);
        panel.add(panelNota, BorderLayout.SOUTH);

        add(panel);
    }

    /* ActionListener */
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
