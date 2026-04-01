package Model;

// Classe Alimentacio que hereta de Producte
public class Alimentacio extends Producte{

    private int diesCaducitat; // Dies que falten per caducar

    public Alimentacio(String nom, double preu, String codiBarres, int diesCaducitat){
        super(nom, preu, codiBarres);
        this.diesCaducitat = diesCaducitat;
    }

    public int getDiesCaducitat() {
        return diesCaducitat;
    }

    public void setDiesCaducitat(int diesCaducitat) {
        this.diesCaducitat = diesCaducitat;
    }

    @Override
    public double calcularPreu() {
        // Preu ajustat segons dies que falten per caducar
        return getPreu() - getPreu()*(1.0/(diesCaducitat+1)) + (getPreu()*0.1);
    }
}