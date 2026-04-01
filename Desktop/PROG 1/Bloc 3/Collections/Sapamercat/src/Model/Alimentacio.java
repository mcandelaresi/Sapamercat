package Model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

// He creat la classe Alimentacio que extén Producte i té data de caducitat
public class Alimentacio extends Producte{

    private LocalDate dataCaducitat;

    public Alimentacio(String nom, double preu, String codiBarres, String dataCaducitat){
        super(nom, preu, codiBarres);
        // Converteixo la data de string a LocalDate
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.dataCaducitat = LocalDate.parse(dataCaducitat, df);
    }

    public LocalDate getDataCaducitat() { return dataCaducitat; }
    public void setDataCaducitat(LocalDate dataCaducitat) { this.dataCaducitat = dataCaducitat; }

    // Aquí calculo el preu segons els dies que falten per caducar
    @Override
    public double calcularPreu() {
        LocalDate avui = LocalDate.now();
        long diesRestants = java.time.temporal.ChronoUnit.DAYS.between(avui, dataCaducitat);
        if(diesRestants < 0) diesRestants = 0; // No poden ser negatius
        return preu - preu*(1.0/(diesRestants+1)) + (preu*0.1);
    }
}