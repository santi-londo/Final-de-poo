package Final;

public class CapacidadExcedidaException extends EnviaYaException {

    public CapacidadExcedidaException(String guia, double limite) {
        super("Paquete " + guia + ": no se sube porque supera los " + Formato.peso(limite) + " de la moto");
    }
}
