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

    // Mostro productes amb la sortida
    public void mostrarCarret() {
        System.out.println("Contingut del carro:");
        for(Producte p : productes){
            System.out.println(p.getNom() + " - Codi: " + p.getCodiBarres());
        }
    }

    // Genero el tiquet i buido el carret
    public void passarPerCaixa() {
        System.out.println("=== Tiquet de compra ===");

        Map<String, Integer> quantitats = new HashMap<>();
        Map<String, Producte> unics = new HashMap<>();

        // Agafar productes únics per codi+preu i comptar quantitats
        for(Producte p : productes){
            String key = p.getCodiBarres() + "-" + p.calcularPreu();
            unics.putIfAbsent(key, p);
            quantitats.put(key, quantitats.getOrDefault(key, 0)+1);
        }

        double total = 0;
        for(String key : unics.keySet()){
            Producte p = unics.get(key);
            int q = quantitats.get(key);
            double preuUnit = p.calcularPreu();
            double subtotal = preuUnit * q;
            total += subtotal;

            // Arrodonim a 2 decimals
            System.out.printf("%s x%d - %.2f€/unitat - Total: %.2f€\n",
                    p.getNom(), q, preuUnit, subtotal);
        }

        System.out.printf("TOTAL A PAGAR: %.2f€\n", total);
        productes.clear();
    }
}