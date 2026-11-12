package Final;

public class PesoExcedidoException extends EnviaYaException {

    public PesoExcedidoException(String guia, double peso) {
        super("Paquete " + guia + ": pesa " + Formato.peso(peso) + " y no se puede llevar en moto");
    }
}