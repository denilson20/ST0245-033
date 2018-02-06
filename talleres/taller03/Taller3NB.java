/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller3nb;

/**
 *
 * @author Mateo&Denilson
 */
public class Taller3NB {

    public static void main(String[] args) {
        torresDeHannoi(3);
        punto2("abc");
        permutations("abc");
    }
    
    
    private static void torresDeHannoiAux(int n, int origen, int intermedio, int destino){ 
        if( n == 1){
            System.out.println("Mover de "+ origen +" a "+ destino + " (Ficha" + n +")");
        }
    
        else {
            torresDeHannoiAux(n - 1, origen, destino, intermedio);
            System.out.println("Mover de " + origen+ " a " + destino + " (Ficha" + n +")");
            torresDeHannoiAux(n - 1, intermedio, origen, destino);

        }
    
    }
    
    public static void torresDeHannoi(int n){
        torresDeHannoiAux(n, 1, 2, 3);
    }
    public static void punto2(String s){
        punto2(s, "");
    }

    private static void punto2(String s, String a){
        if(s.length()==0){
            System.out.println(a);
            return;            
        }
        punto2(s.substring(1), a + s.substring(0,1));
        punto2(s.substring(1), a);
    }
   public static void permutations(String s) {    
        permutationsAux("", s);
    }
    private static void permutationsAux(String base, String s) { 
        if(s.length()==0){
            System.out.println(base + " ");
        }else{
            for(int i = 0; i < s.length(); i++)
            {
                permutationsAux(base + s.charAt(i),s.substring(0,i)+s.substring(i+1,s.length()));
            }
        }
    }
}
