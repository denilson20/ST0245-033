/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller5bd;

/**
 *
 * @author Mateo & Denilson
 */
public class Taller5BD {
    public static int ArraySum(int []A){
    int sum = 0;
    for(int i = 0; i < A.length;i++){
        sum = sum + A[i];
    }
     return sum;
}
    public static int tablas(int n){
        int m =0;
        for (int i = 1; i <= n; i++)
           for (int j = 1; j <= n; j++)
            m += j*i;  
        return m;
    }
    

    public static int[] Ordenar(int [] a){
        int temp, j;
        for(int i = 0;i<a.length;i++){
            j = i;
            while(j>0 && a[j-1] > a[j]){
            temp = a[j];
            a[j] = a[j-1];
            j = j-1;
            }
        }
        return a;
    }
        public static int[] rand(int n){
        int[] a = new int[n];
        for(int i = 0 ; i < a.length ; i++){
            a[i] = (int)(Math.random()*100);
        }
        return a;
    }
   public static void main(String[] args) {
        /*tablas(10);
        int [] a = {9,8,7,6,5,4,3,2,1,};
        a = ordenar(a);
        for(int i  = 0 ; i < 9 ; i++){
            
           System.out.println(a[i]);
        
        }*/
        for(int i = 20000 ; i <= 50000 ; i += 1000){
            long bf = System.currentTimeMillis();
            tablas(i);
            long nw = System.currentTimeMillis();
            long ps = nw - bf;
            System.out.println(ps);
        }
    
        /*for(int i = 100000000; i <= 200000000 ; i+= 10000000){
            int[] m = rand(i);
            long bf = System.currentTimeMillis();
                ArraySum(m);
            long nw = System.currentTimeMillis();
            long ps = nw - bf;
            System.out.println(ps);
        
    }*/
        
    }
}

