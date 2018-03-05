/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab02;

/**
 *
 * @author Mateo
 */
import java.util.*;
public class Lab02 {
 /**
     * este metodo suma todos todos los valores de un arreglo recursivamente
     * @param arr es el arreglo que se recibe para
     * la ejecucion del metodo
     * @return retorna R_arraySum
     */
    public static int R_arraySum(int[] arr) {
        return R_arraySum_aux(arr , 0, 0);
    }
    
    private static int R_arraySum_aux(int[] arr, int index, int sum) {
        if (index == arr.length) return sum;
        sum += arr[index];
        return R_arraySum_aux(arr, index+1, sum);
    }
    /*
    * este metodo suma todos todos los valores de un arreglo iterativamente
     * @param arr es el arreglo que se recibe para
     * la ejecucion del metodo
     * @return retorna sum
     */
    public static int arraySum(int[] arr) {
        int sum = 0;
        for (int index = 0; index < arr.length; ++index) {
            sum += arr[index];
        }
        return sum;
    }   
    
    //----------------------------ArraySum----------------------------------//
    /*
    * este metodo devuelve la suma de la sucesión de Fibonacci recursivamente
     * @param n es el entero que se recibe para
     * la ejecucion del metodo
     * @return retorna R_fibonacci
     */
    public static int R_fibonacci(int n) {
        if (n <= 1) return n;
        return R_fibonacci(n - 2) + R_fibonacci(n-1);
    }
    /*
    * este metodo devuelve la suma de la sucesión de Fibonacci iterativamente
     * @param n es el entero que se recibe para
     * la ejecucion del metodo
     * @return fib
     */
    public static int fibonacci(int n) {
        if (n <= 1) return n;
        int aux = 0;
        int aux2 = 1;
        int fib = 0;
        for (int i = 1; i <= n; ++i) {
                fib = aux + aux2;
                aux2 = aux;
                aux = fib;
        }
        return fib;
    }
 //----------------------------Fibonacci---------------------------------//
     /**
     * este metodo busca el valor mas grande de un arreglo
     * @param A es el arreglo que se recibe
     * @return retorna max
     */
    public static int ArrMaxCiclo(int A []){
        int max = 0;
        for (int i = 0; i <A.length;i++){
            if (A[i] > max){
                max = A[i];
            }
        }
        return max;
    }
    //----------------------------ArrMax---------------------------------//
    /**
     * este metodo compara y ordena cada posicion del arreglo
     * @param A es el arreglo que se ingresa
     * 
     */
     public static void InsertionSort(int[] A)
    {
        int tmp =0;
        int x = 0;
        for (int i = 0; i < A.length; i++)
        {
            x = i;
            while (x > 0 && A[x-1] > A[x])
            {
                tmp = A[x];
                A[x] = A[x-1];
                A[x-1] = tmp;
                x = x-1;
            }           
        }
    }
    //----------------------------InsertionSort---------------------------------// 
        /**
     * metodo auxiliar donde se creara el arreglo tmp
     * @param a es el arreglo que se utilizara
     */
    public static void mergeSort(int [ ] a)
    {
        int[] temporal = new int[a.length];
        mergeSort(a, temporal,  0,  a.length - 1);
    }

    private static void mergeSort(int [ ] a, int [ ] temporal, int left, int right)
    {
        if( left < right )
        {
            int var = (left + right) / 2;
            mergeSort(a, temporal, left, var);
            mergeSort(a, temporal, var + 1, right);
            merge(a, temporal, left, var + 1, right);
        }
    }


    private static void merge(int[] a, int[] tmp, int izq, int der, int derFin )
    {
        int izqFin = derFin - 1;
        int j = izq;
        int num = derFin - izq + 1;

        while(izq <= izqFin && der <= derFin)
            if(a[izq] <= a[der] )
                tmp[j++] = a[izq++];
            else
                tmp[j++] = a[der++];

        while(izq <= izqFin) 
            tmp[j++] = a[izq++];

        while(der <= derFin)  
            tmp[j++] = a[der++];

        for(int i = 0; i < num; i++, derFin--)
            a[derFin] = tmp[derFin];
    }

  
    /** Este metodo genera arreglos 
     */
    public static int[] generatorArr(int n) {
        int maximun = 5000;
        int[] arr = new int[n];
        Random generator = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = generator.nextInt(maximun);
        }
        return arr;
    }
    public static void Time(int nums[]) {
        long inicio = System.currentTimeMillis();
        arraySum(nums);
        long time = System.currentTimeMillis() - inicio;
        System.out.println("La suma del array se demora: " + time);

        inicio = System.currentTimeMillis();
        ArrMaxCiclo(nums);
        time = System.currentTimeMillis() - inicio;
        System.out.println("El valor maximo del arreglo demora: " + time);

    }

    /**
    Este metodo toma el tiempo de insertionsort 
     */
    public static void TimeInsertionsort(int nums[]) {
        long start = System.currentTimeMillis();
        InsertionSort(nums);
        long time = System.currentTimeMillis() - start;
        System.out.println("Para Insertion Sort demora: " + time);
    }

    /**
    Este metodo toma el tiempo de mergesort 
     */
    public static void TimeMergesort(int nums[]) {
        long start = System.currentTimeMillis();
        mergeSort(nums);
        long time = System.currentTimeMillis() - start;
        System.out.println("MergeSort tarda: " + time);
    }
    
    
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        System.out.println("Esta es la sumatoria del metodo recursivo: " + R_arraySum(array));
        System.out.println("Esta es la sumatoria del metodo con ciclo: " + arraySum(array));
        System.out.println("Fibonacci R: "+ R_fibonacci(6));
        System.out.println("Fib ciclo: " + fibonacci(6));
        System.out.println("el maximo del arreglo es: " + ArrMaxCiclo(array));
        int n = 100000000;
        int nums[] =  generatorArr(n);
        Time(nums);
        TimeInsertionsort(nums);
        TimeMergesort(nums);
    }
    
}
