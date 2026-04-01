package Model;

public abstract class Producte implements Comparable<Producte>{

    protected String nom;
    protected double preu;
    protected String codiBarres;

    public Producte(String nom, double preu, String codiBarres){
        this.nom = nom;
        this.preu = preu;
        this.codiBarres = codiBarres;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPreu() {
        return preu;
    }

    public void setPreu(double preu) {
        this.preu = preu;
    }

    public String getCodiBarres() {
        return codiBarres;
    }

    public void setCodiBarres(String codiBarres) {
        this.codiBarres = codiBarres;
    }

    // He posat abstracte el metod calcularPreu perquè cada tipus de producte tindra una manera diferent de calcular el preu.
    public abstract double calcularPreu();

    public int compareTo(Producte o) {
        return this.nom.compareTo(o.nom);
    }

}