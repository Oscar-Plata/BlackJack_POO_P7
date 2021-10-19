/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicas.blackjack_poo_p7;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author oscar
 */
public class Baraja {
     public ArrayList<Carta> cartas;
     public Baraja(){
         this.cartas=new ArrayList<>(52);
         llenarBaraja();
     }
     public void llenarBaraja(){
         for(int i=1;i<=13;i++){
             cartas.add(new Carta(i,"rojo",9829));
             cartas.add(new Carta(i,"rojo",9830));
             cartas.add(new Carta(i,"negro",9827));
             cartas.add(new Carta(i,"negro",9824));
         }
     }
     public void mostrarBaraja(){
        int c=cartas.size();
        for(int i=0;i<c;i++){
            System.out.println(cartas.get(i).toString()+"\n");
        }
    }
     public void revolver(){
            Collections.shuffle(cartas);
     }
     public Carta darCarta(){
         Carta aux= cartas.get(0);
         cartas.remove(0);
         return aux;
     }
}
