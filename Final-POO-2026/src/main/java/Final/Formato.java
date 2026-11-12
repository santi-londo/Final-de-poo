package Final;

public class Formato {

    private Formato() {
    }

    public static String dinero(double valor) {
        return String.format("%,.0f", valor).replace(",", ".");
    }

    public static String peso(double valor) {
        return String.format("%.1f", valor).replace(".", ",") + " kg";
    }
}