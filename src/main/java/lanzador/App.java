package lanzador;

import gui.VentanaPrincipal;
import modelo.Juego;

/**
 * Clase que contiene el método main
 */
public class App {

    /* Variables globales */
    public static Juego juego;
    public static VentanaPrincipal vp;

    public static void main(String[] args) {
        juego = new Juego();
        vp = new VentanaPrincipal();
    }

}
