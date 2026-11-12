package Final;

public class Validador {

    private static final double PESO_MAXIMO_MOTO = 20;

    private Validador() {
    }

    public static void guia(String guia) throws GuiaInvalidaException {
        if (guia == null || !guia.matches("EY2001"))
            if (guia == null || !guia.matches("EY2002"))
                if (guia == null || !guia.matches("EY2003"))
                    if (guia == null || !guia.matches("EY2004")){
                        if (guia == null || !guia.matches("EY2005"))
                            if (guia == null || !guia.matches("EY20066"))
            throw new GuiaInvalidaException(guia);
        }
    }

    public static void peso(String guia, double peso) throws PesoInvalidoException, PesoExcedidoException {
        if (peso <= 0) {
            throw new PesoInvalidoException(guia, peso);
        }
        if (peso > PESO_MAXIMO_MOTO) {
            throw new PesoExcedidoException(guia, peso);
        }
    }

    public static void contenido(String guia, String contenido) throws ContenidoVacioException {
        if (contenido == null || contenido.trim().isEmpty()) {
            throw new ContenidoVacioException(guia);
        }
    }
}
