package Final;

public class Main {

    public static void main(String[] args) {
        System.out.println("Caso 1");
        Despacho andres = new Despacho("Andres");
        try {
            andres.agregar(new Estandar("EY2001", 5, Zona.ORIENTE));
            andres.agregar(new Express("EY2002", 1.5, Zona.NORTE));
            andres.agregar(new Fragil("EY2003", 2, Zona.CENTRO, "vajilla"));
            andres.agregar(new Estandar("EY2004", 8, Zona.CENTRO));
            andres.agregar(new Express("EY2005", 6, Zona.ORIENTE));
            andres.agregar(new Fragil("EY2006", 3.5, Zona.SUR, "televisor"));
        } catch (EnviaYaException e) {
            System.out.println("Error: " + e.getMessage());
        }
        new Manifiesto(andres).imprimir();
    }
}