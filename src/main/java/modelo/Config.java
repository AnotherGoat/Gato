package modelo;

public class Config {

    /* Atributos */
    private final String[] nombres;                               // Nombres de los jugadores
    private final EstadoCasilla[] simbolos;                       // Símbolo que usa cada jugador
    private int[] orden;                                    // Orden en el que juegan los jugadores
    private final TipoJugador[] tipos;
    private final boolean alternar;                               // Invertir el orden al final de cada turno

    /* Constructores */
    public Config() {
        nombres = new String[]{"Jugador 1", "Jugador 2"};
        simbolos = new EstadoCasilla[]{EstadoCasilla.CRUZ, EstadoCasilla.CIRCULO};
        orden = new int[]{0, 1};
        tipos = new TipoJugador[]{TipoJugador.PERSONA, TipoJugador.PERSONA};
        alternar = true;
    }

    /* Métodos */
    public void invertirOrden() {

        var ordenNuevo = new int[orden.length];

        for (int i = 0; i < orden.length; i++) {
            ordenNuevo[i] = orden[orden.length - 1 - i];
        }

        orden = ordenNuevo;
    }

    /* Getters */
    public String[] getNombres() {
        return nombres;
    }

    public EstadoCasilla[] getSimbolos() {
        return simbolos;
    }

    public int[] getOrden() {
        return orden;
    }

    public TipoJugador[] getTipos() {
        return tipos;
    }

    public boolean isAlternar() {
        return alternar;
    }
}
