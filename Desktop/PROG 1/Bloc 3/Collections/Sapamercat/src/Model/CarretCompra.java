package Model;

import java.text.SimpleDateFormat;
import java.util.*;

// Classe per gestionar el carret de la compra
public class CarretCompra {

    private List<Producte> productes;

    public CarretCompra() {
        // He inicialitzat la llista de productes
        productes = new ArrayList<>();
    }

    // Afegeixo producte al carret
    public void afegirProducte(Producte p) {
        productes.add(p);
    }


    // Mostro contingut del carret amb format bonic
    public void mostrarCarret() {
        System.out.println("\n-- CARRET DE LA COMPRA --");
        // Agrupo productes repetits per codi de barres
        Map<String, Integer> quantitats = new LinkedHashMap<>();
        Map<String, Producte> unics = new LinkedHashMap<>();

        for (Producte p : productes) {
            String key = p.getCodiBarres();
            unics.putIfAbsent(key, p);
            quantitats.put(key, quantitats.getOrDefault(key, 0) + 1);
        }

        System.out.printf("%-15s %-15s %-10s\n", "Nom", "Codi de barres", "Unitats");
        for (String key : unics.keySet()) {
            Producte p = unics.get(key);
            int q = quantitats.get(key);
            System.out.printf("%-15s %-15s %-10d\n", p.getNom(), p.getCodiBarres(), q);
        }
        System.out.println();
    }

    // Genero el tiquet de compra
    public void passarPerCaixa() {
        if (productes.isEmpty()) {
            System.out.println("El carret està buit!\n");
            return;
        }

        System.out.println("\n---------------------------");
        System.out.println("SAPAMERCAT");
        System.out.println("---------------------------");

        String dataCompra = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        System.out.println("Data: " + dataCompra);
        System.out.println("---------------------------");

        Map<String, Integer> quantitats = new LinkedHashMap<>();
        Map<String, Producte> unics = new LinkedHashMap<>();

        for (Producte p : productes) {
            String key = p.getCodiBarres() + "-" + String.format("%.2f", p.calcularPreu());
            unics.putIfAbsent(key, p);
            quantitats.put(key, quantitats.getOrDefault(key, 0) + 1);
        }

        double total = 0;
        for (String key : unics.keySet()) {
            Producte p = unics.get(key);
            int q = quantitats.get(key);
            double preuUnit = Math.round(p.calcularPreu() * 100.0) / 100.0;
            double subtotal = Math.round(preuUnit * q * 100.0) / 100.0;
            total += subtotal;

            System.out.printf("%-10s %2d    %8.2f      %8.2f\n",
                    p.getNom(), q, preuUnit, subtotal);
        }

        total = Math.round(total * 100.0) / 100.0;
        System.out.println("\nTotal: " + total + "€" +"\n");

        // Buidem el carret després de passar per caixa
        productes.clear();
    }
}