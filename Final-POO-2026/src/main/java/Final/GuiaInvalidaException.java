package Final;

public class GuiaInvalidaException extends EnviaYaException {

    public GuiaInvalidaException(String guia) {
        super("Paquete " + guia + ": la guia debe ser EY seguida de 4 digitos");
    }
}
