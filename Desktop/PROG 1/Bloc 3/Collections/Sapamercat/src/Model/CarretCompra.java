package Model;

import java.util.*;

// Classe per gestionar el carret de la compra
public class CarretCompra {

    private List<Producte> productes;

    public CarretCompra() {
        // Inicialitzo la llista
        productes = new ArrayList<>();
    }

    // Afegeixo producte al carret
    public void afegirProducte(Producte p) {
        productes.add(p);
    }

    // Mostro productes amb la sortida que vols
    public void mostrarCarret() {
        System.out.println("-- CARRET DE LA COMPRA --");
        for(Producte p : productes){
            System.out.println(p.getNom() + "  " + p.getCodiBarres());
        }
    }

    // Genero el tiquet i buido el carret
    public void passarPerCaixa() {
        System.out.println("---------------------------");
        System.out.println("SAPAMERCAT");
        System.out.println("---------------------------");
        System.out.println("Data: " + java.time.LocalDate.now());
        System.out.println("--------------------------");

        Map<String, Integer> quantitats = new HashMap<>();
        Map<String, Producte> unics = new HashMap<>();

        for(Producte p : productes){
            String key = p.getCodiBarres() + "-" + p.calcularPreu();
            unics.putIfAbsent(key, p);
            quantitats.put(key, quantitats.getOrDefault(key, 0)+1);
        }

        double total = 0;
        for(String key : unics.keySet()){
            Producte p = unics.get(key);
            int q = quantitats.get(key);
            double subtotal = q * p.calcularPreu();
            total += subtotal;
            System.out.printf("%-8s %d %.3f %.3f\n", p.getNom(), q, p.calcularPreu(), subtotal);
        }

        System.out.println("\nTotal: " + total);
        productes.clear();
    }
}