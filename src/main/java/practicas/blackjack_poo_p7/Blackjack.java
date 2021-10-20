/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicas.blackjack_poo_p7;

/**
 * BlackJack, clase donde se encuentran los metodos principales
 * para el funcionaiento de una partida de blackjack o 21
 *
 * @author Oscar JL Plata
 * @version (19/10/21)
 */
public class Blackjack {

    private Dealer dealer;
    private Jugador jugador;
    private Baraja baraja;

    public Blackjack() {
        this.dealer = new Dealer();
        this.jugador = new Jugador();
        this.baraja = new Baraja();
        baraja.llenarBaraja();
    }

    public void entregaInicial() {
        System.out.println(">> ENTREGA INICIAL~~~~~~~~~~~~~~~~~~~");
        dealer.revolverBaraja(baraja);
        System.out.println("~Cartas a Dealer:");
        dealer.darDosCartas(dealer.dealerJugador(), baraja);
        System.out.println("~Cartas a Jugador:");
        dealer.darDosCartas(jugador, baraja);
    }

    public void darCartaJugador() {
        Carta c = baraja.darCarta();
        System.out.println("Carta a Jugador:\n" + c);
        jugador.agregarCarta(c);
    }

    public void darCartaDealer() {
        Carta c = baraja.darCarta();
        System.out.println("Dealer tomo 1 Carta: \n");
        dealer.dealerJugador().agregarCarta(c);
    }
    
    public void verificarDealer(){
        System.out.println("\n>> VERIFICAR DEALER:~~~~~~~~~~~~~~~~~");
        int dSum=dealer.dealerJugador().sumarCartas();
        int dCan=dealer.dealerJugador().getCantidadCartas();
        if((dSum<21)&&(dCan<6)){
        darCartaDealer();
        }else {
            System.out.println("No tomo carta");
            dealer.dealerJugador().seguirJugando(false);
        }
    }
    public void verificarJugador(){
        System.out.println("\n>> VERIFICAR JUGADOR:~~~~~~~~~~~~~~~~~");
        int jSum=jugador.sumarCartas();
        int jCan=jugador.getCantidadCartas();
        System.out.println("Suma: "+jSum);
        System.out.println("Cartas:");
        jugador.mostrarCartas();
    }
    
    public void ganador(){
        System.out.println("\n>> GANADOR~~~~~~~~~~~~~~~~~~~~~~~~~~");
        int dSum=dealer.dealerJugador().sumarCartas();
        int jSum=jugador.sumarCartas();
        if((jugador.statusJuego()==false)){
            if(jSum<=21 &&(dSum>21||dSum<jSum)){
                System.out.println("Gano el JUGADOR!");
            }else if(dSum<=21&&(jSum>21||jSum<dSum)){
                System.out.println("Gano el DEALER!");
            }else if(dSum==jSum ||(dSum>21&&jSum>21)){
                System.out.println("Hubo un EMPATE!");
            }else System.out.println("ERRORL revisar codigo");
        }else System.out.println("El juego continua");
    }
    public void mostrarResultados(){
        System.out.println("\n>> RESULTADOS~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~Jugador:");
        System.out.println(jugador);
        System.out.println("~Dealer:");
        System.out.println(dealer.dealerJugador());
    }

    public void reset() {
        this.dealer = new Dealer();
        this.jugador = new Jugador();
        this.baraja = new Baraja();
        baraja.llenarBaraja();
    }


    public Dealer getDealer() {
        return dealer;
    }

    public void setDealer(Dealer dealer) {
        this.dealer = dealer;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public Baraja getBaraja() {
        return baraja;
    }

    public void setBaraja(Baraja baraja) {
        this.baraja = baraja;
    }
}
