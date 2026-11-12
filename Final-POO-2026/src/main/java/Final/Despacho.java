
package Final;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Despacho {


    private static final double PESO_MAXIMO = 30;
    private static int contador = 0;

    private final String codigo;
    private final String mensajero;
    private final List<Paquete> paquetes = new ArrayList<>();

    public Despacho(String mensajero) {
        contador++;
        this.codigo = "D-" + contador;
        this.mensajero = mensajero;
    }

    public void agregar(Paquete paquete) throws EnviaYaException {
        if (paquetes.contains(paquete)) {
            throw new GuiaDuplicadaException(paquete.getGuia());
        }
        if (pesoTotal() + paquete.getPeso() > PESO_MAXIMO) {
            throw new CapacidadExcedidaException(paquete.getGuia(), PESO_MAXIMO);
        }
        paquetes.add(paquete);
    }

    public List<Paquete> ordenados() {
        List<Paquete> lista = new ArrayList<>(paquetes);
        Collections.sort(lista);
        return lista;
    }

    public double pesoTotal() {
        return Calculos.sumarPesos(paquetes);
    }

    public double costoTotal() {
        return Calculos.sumarCostos(paquetes);
    }

    public List<String> advertencias() {
        List<String> lista = new ArrayList<>();
        for (Paquete paquete : ordenados()) {
            if (paquete instanceof ManejoEspecial) {
                ManejoEspecial especial = (ManejoEspecial) paquete;
                lista.add(especial.advertencia());
            }
        }
        return lista;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getMensajero() {
        return mensajero;
    }
}