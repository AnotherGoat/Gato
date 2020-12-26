package modelo;

public class Config {

    /* Atributos */
    private String[] nombres;                               // Nombres de los jugadores
    private EstadoCasilla[] simbolos;                       // Símbolo que usa cada jugador
    private int[] orden;                                    // Orden en el que juegan los jugadores
    private TipoJugador[] tipos;

    /* Constructores */
    public Config() {
        nombres = new String[]{"Jugador 1", "Jugador 2"};
        simbolos = new EstadoCasilla[]{EstadoCasilla.CRUZ, EstadoCasilla.CIRCULO};
        orden = new int[]{1, 0};
        tipos = new TipoJugador[]{TipoJugador.PERSONA, TipoJugador.PERSONA};
    }

    public Config(String[] nombres, EstadoCasilla[] simbolos, int[] orden) {
        this.nombres = nombres;
        this.simbolos = simbolos;
        this.orden = orden;
        tipos = new TipoJugador[]{TipoJugador.PERSONA, TipoJugador.PERSONA};
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
}
