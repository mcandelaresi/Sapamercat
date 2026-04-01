package Vista;

import Model.*;

import java.util.Scanner;

// Classe per mostrar menús i interacció amb l’usuari
public class Vista {

    public Scanner sc = new Scanner(System.in);

    public void menuPrincipal(){

        System.out.println("-- BENVINGUT AL SAPAMERCAT --");
        System.out.println("-----------");
        System.out.println("-- INICI --");
        System.out.println("-----------");
        System.out.println("1) Introduir producte");
        System.out.println("2) Passar per caixa");
        System.out.println("3) Mostrar carret de compra");
        System.out.println("0) Acabar");

    }

    public void menuProducte(){
        System.out.println("-----------");
        System.out.println("-- PRODUCTE --");
        System.out.println("-----------");
        System.out.println("1) Alimentació");
        System.out.println("2) Tèxtil");
        System.out.println("3) Electrònica");
        System.out.println("0) Tornar");

    }

    public Alimentacio llegirAlimentacio(){
        System.out.println("Afegir aliment");
        System.out.print("Nom producte: ");
        String nom = sc.nextLine();
        System.out.print("preu: ");
        double preu = Double.parseDouble(sc.nextLine());
        System.out.print("Codi de barres: ");
        String codi = sc.nextLine();
        System.out.print("Data de caducitat (dd/MM/yyyy): ");
        String data = sc.nextLine();
        return new Alimentacio(nom, preu, codi, data);
    }

    public Textil llegirTextil(){
        System.out.println("Afegir tèxtil");
        System.out.print("Nom producte: ");
        String nom = sc.nextLine();
        System.out.print("preu: ");
        double preu = Double.parseDouble(sc.nextLine());
        System.out.print("Composició: ");
        String comp = sc.nextLine();
        System.out.print("Codi de barres: ");
        String codi = sc.nextLine();
        return new Textil(nom, preu, codi, comp);
    }

    public Electronica llegirElectronica(){
        System.out.println("Afegir electrònica");
        System.out.print("Nom producte: ");
        String nom = sc.nextLine();
        System.out.print("preu: ");
        double preu = Double.parseDouble(sc.nextLine());
        System.out.print("Garantia (dies): ");
        int dies = Integer.parseInt(sc.nextLine());
        System.out.print("Codi de barres: ");
        String codi = sc.nextLine();
        return new Electronica(nom, preu, codi, dies);
    }
}