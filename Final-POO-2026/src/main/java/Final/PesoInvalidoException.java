package Final;

public class PesoInvalidoException extends EnviaYaException {

    public PesoInvalidoException(String guia, double peso) {
        super("Paquete " + guia + ": el peso debe ser mayor a 0 kg, se recibio " + peso);
    }
}