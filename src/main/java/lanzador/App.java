package lanzador;

import gui.VentanaPrincipal;
import modelo.Config;
import modelo.Juego;

/**
 * Clase que contiene el método main
 */
public class App {

    /* Variables globales */
    public static Config config;
    public static Juego juego;
    public static VentanaPrincipal vp;

    public static void main(String[] args) {
        config = new Config();
        juego = new Juego(config);
        vp = new VentanaPrincipal();
    }

}
