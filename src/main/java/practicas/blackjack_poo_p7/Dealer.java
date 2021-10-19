/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicas.blackjack_poo_p7;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Dealer, jugador encargado de entregar cartas y revolver la baraja
 * controlado por la computadora.
 *
 * @author Oscar JL Plata
 * @version (19/10/21)
 */
public class Dealer {

    private Jugador dealerJ;

    /**
     * Constructor for objects of class Jugador
     */
    public Dealer() {
        this.dealerJ = new Jugador();
    }

    public Baraja revolverBaraja(Baraja b) {
        b.revolver();
        return b;
    }

    public void darDosCartas(Jugador j, Baraja b) {
        Carta c1 = b.darCarta();
        System.out.println("Carta 1: " + c1 + " Carta 2: [???]");
        Carta c2 = b.darCarta();
        j.agregarCarta(c1);
        j.agregarCarta(c2);
    }

    public Jugador dealerJugador() {
        return dealerJ;
    }

    @Override
    public String toString() {
        String inf = dealerJ.toString();
        return inf;
    }
}
