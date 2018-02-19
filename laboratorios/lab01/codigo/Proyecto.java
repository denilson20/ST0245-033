/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Mateo Montes & Denilson Moreno
 */
public class Proyecto {

   
    public static void main(String[] args) {
      
        int size = 1;         
        int max = 10000000;
        
        int[] arra = new int[size];         
        Random generator = new Random();         
        for (int i =0; i<size; i++)             
            arra[i] = generator.nextInt(max);
        System.out.println(punto1_1a(arra));
        System.out.println(punto1_3(1000));    
    }
    public static int Arreglosuma(int[] A, int n)
    {           try        
        {
            TimeUnit.MILLISECONDS.sleep(1);
        } 
        catch(InterruptedException ex) 
        {
            Thread.currentThread().interrupt();
        }    
        int sum;
        if (n == 0)
            sum = A[0];
        else 
            sum = A[n] + Arreglosuma(A,n-1);
        return sum;
    }
    private static int punto1_1(int n [],int valor){
        int longitud = n.length-1;
        int mayor;
        int temporal;
        if(valor==longitud){
            return n[valor];
        }
        else{
            mayor = punto1_1(n, valor+1);
        if(n[valor]>mayor){
            temporal = n[valor];
        }
        temporal = mayor;
        }
    return temporal;
    }
    public static int punto1_1a(int n []){
        return punto1_1(n,0);
    }
     public static int punto1_3(int n) {
        int res;
        if (n == 0 || n == 1)
            res = n;
        else
            res = punto1_3(n-1) + punto1_3(n-2);
        return res;
    }

    
}
