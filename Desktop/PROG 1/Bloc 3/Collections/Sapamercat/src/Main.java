import Model.*;
import java.util.Scanner;

// Classe principal amb menú
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CarretCompra carret = new CarretCompra();
        int opcio;

        do{
            System.out.println("1. Introduir producte\n2. Passar per caixa\n3. Mostrar carro\n0. Sortir");
            opcio = sc.nextInt();
            sc.nextLine();

            switch(opcio){
                case 1:
                    System.out.println("Tipus de producte: 1-Alimentació, 2-Tèxtil, 3-Electrònica");
                    int tipus = sc.nextInt();
                    sc.nextLine();

                    if(tipus == 1){
                        System.out.println("Nom:");
                        String nom = sc.nextLine();
                        System.out.println("Preu:");
                        double preu = sc.nextDouble();
                        sc.nextLine();
                        System.out.println("Codi de barres:");
                        String codi = sc.nextLine();
                        System.out.println("Dies caducitat:");
                        int dies = sc.nextInt();
                        sc.nextLine();
                        carret.afegirProducte(new Alimentacio(nom, preu, codi, dies));
                    } else if(tipus == 2){
                        System.out.println("Nom:");
                        String nom = sc.nextLine();
                        System.out.println("Preu:");
                        double preu = sc.nextDouble();
                        sc.nextLine();
                        System.out.println("Codi de barres:");
                        String codi = sc.nextLine();
                        System.out.println("Composició:");
                        String comp = sc.nextLine();
                        carret.afegirProducte(new Textil(nom, preu, codi, comp));
                    } else if(tipus == 3){
                        System.out.println("Nom:");
                        String nom = sc.nextLine();
                        System.out.println("Preu:");
                        double preu = sc.nextDouble();
                        sc.nextLine();
                        System.out.println("Codi de barres:");
                        String codi = sc.nextLine();
                        System.out.println("Dies garantia:");
                        int dies = sc.nextInt();
                        sc.nextLine();
                        carret.afegirProducte(new Electronica(nom, preu, codi, dies));
                    }
                    break;

                case 2:
                    carret.generarTiquet();
                    break;

                case 3:
                    carret.mostrarCarret();
                    break;
            }

        } while(opcio != 0);

        sc.close();
    }
}