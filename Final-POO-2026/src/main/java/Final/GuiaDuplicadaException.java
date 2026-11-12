package Final;

public class GuiaDuplicadaException extends EnviaYaException {

    public GuiaDuplicadaException(String guia) {
        super("Paquete " + guia + ": la guia ya esta registrada en el despacho");
    }
}