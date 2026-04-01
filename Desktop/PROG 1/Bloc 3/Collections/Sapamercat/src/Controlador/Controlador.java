package Controlador;

import Model.*;
import Vista.Vista;

public class Controlador {

    private CarretCompra carret = new CarretCompra();
    private Vista vista = new Vista();

    public void iniciar() {
        boolean sortir = false;
        while(!sortir){
            vista.menuPrincipal();
            int op = Integer.parseInt(vista.sc.nextLine());
            switch(op){
                case 1:
                    menuIntroduirProducte();
                    break;
                case 2:
                    carret.passarPerCaixa();
                    break;
                case 3:
                    carret.mostrarCarret();
                    break;
                case 0:
                    sortir = true;
                    break;
            }
        }
    }

    private void menuIntroduirProducte(){
        boolean tornar = false;
        while(!tornar){
            vista.menuProducte();
            int op = Integer.parseInt(vista.sc.nextLine());
            switch(op){
                case 1:
                    carret.afegirProducte(vista.llegirAlimentacio());
                    break;
                case 2:
                    carret.afegirProducte(vista.llegirTextil());
                    break;
                case 3:
                    carret.afegirProducte(vista.llegirElectronica());
                    break;
                case 0:
                    tornar = true;
                    break;
            }
        }
    }
}