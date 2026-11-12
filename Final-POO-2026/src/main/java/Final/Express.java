package Final;

public class Express extends Paquete {

    private static final double RECARGO = 0.5;

    public Express(String guia, double peso, Zona zona) throws EnviaYaException {
        super(guia, peso, zona);
    }

    @Override
    public String servicio() {
        return "Express";
    }

    @Override
    public String textoAjuste() {
        return "+50%";
    }

    @Override
    protected double ajuste() {
        return costoBase() * RECARGO;
    }

    @Override
    public int prioridad() {
        return 0;
    }
}
