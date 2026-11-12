package Final;

public class Fragil extends Paquete implements ManejoEspecial {

    private static final double RECARGO = 5000;

    private final String contenido;

    public Fragil(String guia, double peso, Zona zona, String contenido) throws EnviaYaException {
        super(guia, peso, zona);
        Validador.contenido(guia, contenido);
        this.contenido = contenido.trim();
    }

    @Override
    public String servicio() {
        return "Fragil (" + contenido + ")";
    }

    @Override
    public String textoAjuste() {
        return "+" + Formato.dinero(RECARGO);
    }

    @Override
    protected double ajuste() {
        return RECARGO;
    }

    @Override
    public String advertencia() {
        return getGuia() + " - FRAGIL (" + contenido + ")";
    }
}