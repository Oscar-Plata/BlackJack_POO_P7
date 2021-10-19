/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicas.blackjack_poo_p7;

import java.util.Scanner;

/**
 * Clase main que ejecutara juego de BlackJack o 21
 *
 * @author OScar Jl Plata
 * @Version 19/10/21
 */
public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Blackjack bj = new Blackjack();
        String opc;
        String repetir;
        do {
        bj.entregaInicial();
            do {
                bj.verificarJugador();
                System.out.println("Tomar Otra carta?: [si/no]\n >>");
                opc = sc.next();
                opc = opc.toLowerCase();
                if (opc.equals("si")) {
                    bj.darCartaJugador();
                } else if (opc.equals("no")) {
                    bj.getJugador().seguirJugando(false);
                } else {
                    System.out.println("Entrada no valida");
                    break;
                }
                bj.verificarDealer();
                bj.ganador();
            } while (opc.equals("si"));
            bj.mostrarResultados();
            System.out.println("Jugar Denuevo: [si/no]\n >>");
            repetir=sc.next();
            repetir=repetir.toLowerCase();
            bj.reset();
        } while (repetir.equals("si"));
        System.out.println("~~~~~~~~~~~~~~Fin del juego~~~~~~~~~~~~~");

    }

}
