package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import static lanzador.App.vp;

public class DialogoConfig extends JDialog implements ActionListener {

    /* Paneles */
    private JPanel panel;
    private JPanel panelOpciones;
    private JPanel panelOpcion1;
    private JPanel panelOpcion2;
    private JPanel panelOpcion3;
    private JPanel panelOpcion4;
    private JPanel panelNota;

    /* Labels */
    private JLabel labelNombreJ1;
    private JLabel labelSimboloJ1;
    private JLabel labelTipoJ1;
    private JLabel labelNombreJ2;
    private JLabel labelSimboloJ2;
    private JLabel labelTipoJ2;

    /* Campos */
    private JTextField campoNombreJ1;
    private JTextField campoNombreJ2;
    private JLabel labelNota;

    /* Radios */
    private ArrayList<JRadioButton> radios;

    /* Grupos de botones */
    private ButtonGroup grupoOpcion1;
    private ButtonGroup grupoOpcion2;
    private ButtonGroup grupoOpcion3;
    private ButtonGroup grupoOpcion4;

    /* Constructores */
    public DialogoConfig() {
        super(vp, ModalityType.APPLICATION_MODAL);

        configurarDialogo();
        inicializarPaneles();
        inicializarLabels();
        inicializarCampos();
        inicializarRadios();
        inicializarGrupos();
        ubicarComponentes();

        setVisible(true);                               // Diálogo visible
    }

    /* Métodos de inicialización */
    private void configurarDialogo() {
        setTitle("Configuración de Gato");              // Título: Configuración de Gato
        setSize(500, 500);                   // Tamaño inicial: 500x500
        setLocationRelativeTo(null);                    // Inicia centrado
    }

    private void inicializarPaneles() {
        panel = new JPanel(new BorderLayout());             // Para que el panel principal llene la ventana

        panelOpciones = new JPanel(new GridLayout(14, 2));

        panelOpcion1 = new JPanel();
        panelOpcion2 = new JPanel();
        panelOpcion3 = new JPanel();
        panelOpcion4 = new JPanel();

        panelNota = new JPanel();
    }

    private void inicializarLabels() {
        labelNombreJ1 = new JLabel("Nombre de jugador 1:");

        labelSimboloJ1 = new JLabel("Símbolo de jugador 1:");

        labelTipoJ1 = new JLabel("Tipo de jugador 1:");

        labelNombreJ2 = new JLabel("Nombre de jugador 2:");

        labelSimboloJ2 = new JLabel("Símbolo de jugador 2:");

        labelTipoJ2 = new JLabel("Tipo de jugador 2:");

        labelNota = new JLabel("Los cambios se aplicarán cuando inicie un nuevo juego.");
    }

    private void inicializarCampos() {
        campoNombreJ1 = new JTextField(10);

        campoNombreJ2 = new JTextField(10);
    }

    private void inicializarRadios() {
        radios = new ArrayList<>();

        /* Opción 1 */
        radios.add(new JRadioButton("Cruz", true));                 // 0
        radios.add(new JRadioButton("Círculo", false));             // 1

        /* Opción 2 */
        radios.add(new JRadioButton("Persona", true));              // 2
        radios.add(new JRadioButton("IA", false));                  // 3
        radios.get(3).setEnabled(false);

        /* Opción 3 */
        radios.add(new JRadioButton("Cruz", false));                // 4
        radios.add(new JRadioButton("Círculo", true));              // 5

        /* Opción 4 */
        radios.add(new JRadioButton("Persona", true));              // 6
        radios.add(new JRadioButton("IA", false));                  // 7
        radios.get(7).setEnabled(false);
    }

    private void inicializarGrupos() {
        grupoOpcion1 = new ButtonGroup();
        grupoOpcion1.add(radios.get(0));
        grupoOpcion1.add(radios.get(1));

        grupoOpcion2 = new ButtonGroup();
        grupoOpcion2.add(radios.get(2));
        grupoOpcion2.add(radios.get(3));

        grupoOpcion3 = new ButtonGroup();
        grupoOpcion3.add(radios.get(4));
        grupoOpcion3.add(radios.get(5));

        grupoOpcion4 = new ButtonGroup();
        grupoOpcion4.add(radios.get(6));
        grupoOpcion4.add(radios.get(7));
    }

    private void ubicarComponentes() {
        panelOpcion1.add(radios.get(0));
        panelOpcion1.add(radios.get(1));

        panelOpcion2.add(radios.get(2));
        panelOpcion2.add(radios.get(3));

        panelOpcion3.add(radios.get(4));
        panelOpcion3.add(radios.get(5));

        panelOpcion4.add(radios.get(6));
        panelOpcion4.add(radios.get(7));

        panelOpciones.add(labelNombreJ1);
        panelOpciones.add(campoNombreJ1);

        panelOpciones.add(labelSimboloJ1);
        panelOpciones.add(panelOpcion1);

        panelOpciones.add(labelTipoJ1);
        panelOpciones.add(panelOpcion2);

        panelOpciones.add(labelNombreJ2);
        panelOpciones.add(campoNombreJ2);

        panelOpciones.add(labelSimboloJ2);
        panelOpciones.add(panelOpcion3);

        panelOpciones.add(labelTipoJ2);
        panelOpciones.add(panelOpcion4);

        panelNota.add(labelNota);

        panel.add(panelOpciones, BorderLayout.CENTER);
        panel.add(panelNota, BorderLayout.SOUTH);

        add(panel);
    }

    /* ActionListener */
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO: Hacer que se pueda cambiar la configuración usando el menú
    }
}
