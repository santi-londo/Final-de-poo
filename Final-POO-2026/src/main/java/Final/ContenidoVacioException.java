package Final;

public class ContenidoVacioException extends EnviaYaException {

    public ContenidoVacioException(String guia) {
        super("Paquete " + guia + ": un fragil debe indicar su contenido");
    }
}