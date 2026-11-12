package Final;

import java.util.List;

public class Manifiesto {

    private final Despacho despacho;

    public Manifiesto(Despacho despacho) {
        this.despacho = despacho;
    }

    public void imprimir() {
        String formato = "%-8s%-24s%-10s%-9s%-10s%-9s%s%n";
        System.out.println("Despacho " + despacho.getCodigo() + " - Mensajero: " + despacho.getMensajero());
        System.out.printf(formato, "Guia", "Servicio", "Zona", "Peso", "Base", "Ajuste", "Envio");
        for (Paquete p : despacho.ordenados()) {
            System.out.printf(formato, p.getGuia(), p.servicio(), p.getZona(),
                    Formato.peso(p.getPeso()), Formato.dinero(p.costoBase()),
                    p.textoAjuste(), Formato.dinero(p.costoEnvio()));
        }
        System.out.println("Peso total: " + Formato.peso(despacho.pesoTotal()));
        System.out.println("Costo total: $" + Formato.dinero(despacho.costoTotal()));
        List<String> advertencias = despacho.advertencias();
        if (advertencias.isEmpty()) {
            System.out.println("Advertencias: ninguna");
        } else {
            System.out.println("Advertencias:");
            for (String advertencia : advertencias) {
                System.out.println(advertencia);
            }
        }
    }
}