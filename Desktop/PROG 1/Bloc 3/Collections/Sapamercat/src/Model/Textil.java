package Model;

// He creat la classe Textil que extén Producte i té atribut composició
public class Textil extends Producte{

    private String composicio;

    public Textil(String nom, double preu, String codiBarres, String composicio){
        super(nom, preu, codiBarres);
        this.composicio = composicio;
    }

    public String getComposicio() { return composicio; }
    public void setComposicio(String composicio) { this.composicio = composicio; }

    @Override
    public double calcularPreu() {
        // El preu d’un tèxtil és el preu base, no té variació
        return preu;
    }
}