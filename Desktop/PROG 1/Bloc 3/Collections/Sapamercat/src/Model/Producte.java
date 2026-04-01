package Model;

/**
 * Aquesta és la classe abstracta Producte.
 * He decidit fer-la abstracta perquè hi haurà diferents tipus de productes
 * (Alimentació, Textil, Electrònica) i cada un calcularà el preu de manera diferent.
 */
public abstract class Producte implements Comparable<Producte>{

    // Atributs comuns a tots els productes
    protected String nom;        // He posat el nom com a String per identificar cada producte
    protected double preu;       // El preu base del producte
    protected String codiBarres; // Utilitzo el codi de barres per diferenciar productes iguals

    // Constructor per inicialitzar els atributs
    public Producte(String nom, double preu, String codiBarres){
        this.nom = nom;
        this.preu = preu;
        this.codiBarres = codiBarres;
    }

    // Getters i setters per accedir i modificar els atributs
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom; // Actualitzo el nom del producte
    }

    public double getPreu() {
        return preu;
    }

    public void setPreu(double preu) {
        this.preu = preu; // Actualitzo el preu del producte
    }

    public String getCodiBarres() {
        return codiBarres;
    }

    public void setCodiBarres(String codiBarres) {
        this.codiBarres = codiBarres; // Assigno un nou codi de barres
    }

    // He posat abstracte el mètode calcularPreu perquè cada tipus de producte tindrà la seva manera de calcular-lo
    public abstract double calcularPreu();

    /**
     * Implemento Comparable per poder ordenar productes per nom.
     * He decidit ordenar-los alfabèticament perquè em sembla mes facil aixi.
     */
    @Override
    public int compareTo(Producte o) {
        return this.nom.compareTo(o.nom);
    }

}