/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicas.blackjack_poo_p7;

/**
 *
 * @author oscar
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Baraja baraja=new Baraja();
        baraja.mostrarBaraja();
        baraja.revolver();
        baraja.mostrarBaraja();
        System.out.println("Carta:");
       Carta carta=baraja.darCarta();
       System.out.println(carta+"\n");
       
    }  
    
}
