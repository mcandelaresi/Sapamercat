package Model;

public class Electronica extends Producte {

    private int diesGarantia;

    public Electronica(String nom, double preu, String codiBarres, int diesGarantia) {
        super(nom, preu, codiBarres);
        this.diesGarantia = diesGarantia;
    }

    public double calcularPreu() {
        // El preu d'aquest tipus de producte varia en funció dels dies de garantia.
        return getPreu() + getPreu() * (diesGarantia / 365.0) * 0.1; // Increment del 10% per cada any de garantia
    }
}
