
import java.util.Random;
import java.util.concurrent.TimeUnit;
public class Taller4
    //Realizado por: Denilson Moreno y Mateo Montes
{

    //SUMAR
    public static void main(String[] args){
        for(int i=1; i <= 20; i = i + 1){
            System.out.println("Suma "+i+" "+tomarElTiempoParaN(i));

        }

    }
    
    public static int ArraySum(int[] A, int n)
    {             try        
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
            sum = A[n] + ArraySum(A,n-1);
        return sum;
    }

    // Computes the maximum value of an array recursively
    public static int ArrayMax(int[] A, int n)
    {
        int max;
        if (n == 0)
            max = A[0];
        else
            max = Math.max(A[n],ArrayMax(A, n-1));
        return max;
    }

    public static long tomarElTiempoParaN(int n){
        int[] arreglo = crearUnArregloAleatorio(n);
        long startTime = System.currentTimeMillis();
        ArraySum(arreglo,arreglo.length-1);
        long estimatedTime = System.currentTimeMillis() - startTime;
        return estimatedTime;
    }

    public static int[] crearUnArregloAleatorio(int n){
        int max = 5000;
        int[] array = new int[n];
        Random generator = new Random();
        for (int i =0; i<n; i++)
            array[i] = generator.nextInt(max);
        return array;
    }

    //MULTIPLICAR

    public static void mult(int n){   
        for (int i = 1; i <= n ; i++){
            for (int j = 1; j <= n; j++) 

                System.out.print(i+"*"+j+"="+i*j + "  ");
        }   
        System.out.println("");
    }   

    public static long tomarElTiempoParaNmult(int n){       
        long startTime = System.currentTimeMillis();
        mult(n);
        long estimatedTime = System.currentTimeMillis() - startTime;
        return estimatedTime;
    }

    //ORDENAMIENTO
    public static int []  ordenamiento(int [] A){
        int n=A.length;
        int temp=0;
        for(int i=0;i<=n-1;i++){
            int j=i;
            while(j>0 && A[j-1]>A[j]){
                temp=A[j];
                A[j]=A[j-1];
                A[j-1]=temp;
                j-=1;
            }

        }
        return A;
    }

    public static long tomarElTiempoParaNord(int n){
        int[] arreglo = crearUnArregloAleatorio(n);
        long startTime = System.currentTimeMillis();
        ordenamiento(arreglo);
        long estimatedTime = System.currentTimeMillis() - startTime;
        return estimatedTime;
    }
}


