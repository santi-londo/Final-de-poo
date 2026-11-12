package Final;

public class Estandar extends Paquete {

    public Estandar(String guia, double peso, Zona zona) throws EnviaYaException {
        super(guia, peso, zona);
    }

    @Override
    public String servicio() {
        return "Estandar";
    }

    @Override
    public String textoAjuste() {
        return "-";
    }

    @Override
    protected double ajuste() {
        return 0;
    }
}
