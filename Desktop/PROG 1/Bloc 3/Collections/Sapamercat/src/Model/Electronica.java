package Model;

// Classe Electronica amb dies de garantia
public class Electronica extends Producte{

    private int diesGarantia;

    public Electronica(String nom, double preu, String codiBarres, int diesGarantia){
        super(nom, preu, codiBarres);
        this.diesGarantia = diesGarantia;
    }

    public int getDiesGarantia() { return diesGarantia; }
    public void setDiesGarantia(int diesGarantia) { this.diesGarantia = diesGarantia; }

    @Override
    public double calcularPreu() {
        // Incremento del preu segons dies de garantia
        return preu + preu*(diesGarantia/365.0)*0.1;
    }
}