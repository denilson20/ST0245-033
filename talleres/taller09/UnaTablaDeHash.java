/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller9;

import java.util.LinkedList;
import java.util.ArrayList;

/**
 *
 * @author mateo
 */
//Una tabla de hash donde la llave es un String y el valor un 
public class UnaTablaDeHash
{
   // Ojo, esta tabla definida así no permite manejar las colisiones
   private ArrayList<LinkedList<Par>> tabla;
   public UnaTablaDeHash(){
      tabla = new ArrayList<>(10);
       for (int i = 0; i < 10; i++) {
           LinkedList linkedList = new LinkedList<>();
       }
   }

   // Ojo, esta función hash es muy ingenua
   private int funcionHash(String k){
       int sum=0;
       for (int i = 0; i < k.length(); i++) {
           sum += k.charAt(i);
       }
       return sum % 10;
   }

   // Ojo con las colisiones
   public int get(String k){
      int pot = funcionHash(k);
      LinkedList enPot = tabla.Get(pot);
       for (int i = 0; i < enPot.size(); i++) {
           par act=(par) enPot.get(i);
           if(k.equals(act.nombre)){
           return act.telefono;
            }       
       }
      return -1;
   }

   // Ojo con las colisiones
   public void put(String k, int v){
        int pos = funcionHash(k);
        tabla.get(pos).addFirst(new par(k, v));
   }
}
