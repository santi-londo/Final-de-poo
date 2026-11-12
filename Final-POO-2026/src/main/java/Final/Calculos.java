package Final;

import java.util.List;

public class Calculos {

    private Calculos() {
    }

    public static double sumarPesos(List<? extends Paquete> paquetes) {
        double total = 0;
        for (Paquete paquete : paquetes) {
            total += paquete.getPeso();
        }
        return total;
    }

    public static double sumarCostos(List<? extends Paquete> paquetes) {
        double total = 0;
        for (Paquete paquete : paquetes) {
            total += paquete.costoEnvio();
        }
        return total;
    }
}