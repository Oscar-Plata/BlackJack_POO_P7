/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicas.blackjack_poo_p7;
import java.util.ArrayList;
/**
 * Dealer
 * 
 * @author Oscar JL Plata
 * @version (13/10/21
 */
public class Dealer {

    private ArrayList<Carta> mano;

    /**
     * Constructor for objects of class Jugador
     */
    public Dealer()
    {
        this.mano= new ArrayList<>(5);
    }

    public void recibirCartas(ArrayList<Carta> recibido){
        this.mano=recibido;
    }
    
    public void agregarCarta(Carta c){
        mano.add(c);
    }

    public void mostrarCartas(){
        int c=mano.size();
        for(int i=0;i<c;i++){
            System.out.println(mano.get(c).toString()+"\n");
        }

    }
    
    
    @Override
    public String toString(){
       String inf="Cantidad Cartas: "+mano.size()+" ";
        for(int i=0;i<mano.size();i++){
            inf=inf.concat(mano.get(i).toString()+" ");
        }
        return inf;
    }  
}
