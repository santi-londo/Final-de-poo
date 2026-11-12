package Final;

public abstract class Paquete implements Comparable<Paquete> {

    private static final double COSTO_POR_KG = 1000;

    private final String guia;
    private final double peso;
    private final Zona zona;

    protected Paquete(String guia, double peso, Zona zona) throws EnviaYaException {
        Validador.guia(guia);
        Validador.peso(guia, peso);
        this.guia = guia;
        this.peso = peso;
        this.zona = zona;
    }

    public abstract String servicio();

    public abstract String textoAjuste();

    protected abstract double ajuste();

    public int prioridad() {
        return 1;
    }

    public double costoBase() {
        return zona.getTarifa() + COSTO_POR_KG * peso;
    }

    public double costoEnvio() {
        return costoBase() + ajuste();
    }

    public String getGuia() {
        return guia;
    }

    public double getPeso() {
        return peso;
    }

    public Zona getZona() {
        return zona;
    }

    @Override
    public int compareTo(Paquete otro) {
        int resultado = Integer.compare(prioridad(), otro.prioridad());
        if (resultado == 0) {
            resultado = zona.compareTo(otro.zona);
        }
        if (resultado == 0) {
            resultado = guia.compareTo(otro.guia);
        }
        return resultado;
    }

    @Override
    public boolean equals(Object objeto) {
        if (this == objeto) {
            return true;
        }
        if (!(objeto instanceof Paquete)) {
            return false;
        }
        Paquete otro = (Paquete) objeto;
        return guia.equals(otro.guia);
    }

    @Override
    public int hashCode() {
        return guia.hashCode();
    }

    @Override
    public String toString() {
        return guia + " " + servicio() + " " + zona + " " + Formato.peso(peso);
    }
}
