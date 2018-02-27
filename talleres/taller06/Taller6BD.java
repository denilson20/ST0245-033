/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller6bd;

/**
 *
 * @author Mateo & Denilson
 */
public class Taller6BD {
public class MiArrayList<T> {
    private final int size;
    private static final int DEFAULT_CAPACITY = 10;
    private T elements[]; 
    
    // Inicializa los atributos size en cero y elements como un arreglo de tamaño  DEFAULT_CAPACITY. No, no recibe parámetros. public MiArrayList() {}          // Retorna el tamaño de la lista public int size() {}          // Agrega un elemento e a la última posición de la lista public void add(int e) {}          // Retorna el elemento que se encuentra en la posición i de la lista public int get(int i) {}          // Agrega un elemento e en la posición index de la lista
    public MiArrayList() {
        this.elements = (T[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }     

    // Retorna el tamaño de la lista ;
    public int size() {
        return size;
    }   
    
    // Retorna el elemento que se encuentra en la posición i de la lista 
    public T get(int i) {
        return (i<size && i>=0)
        ?elements[i]
        :trow new IndexOutOfBoundsException("Out of Bounds"+1);
    }
    // Agrega un elemento e a la última posición de la lista
    public void add(T e) {
        add(size,e); 
    }        
    // Agrega un elemento e en la posición index de la lista
    public void add(int index, T e) {
        if (size == elements.length){
            T[]arraytmp = (T[]) new object [size*2];
           for(int i = 0; i<size; i++){
               arraytmp[i] = elements[i];
           } 
           elements = arraytmp;
        }
        for(int i = size; i>index; i--){
            elements[i] = elements [i-1];
        }
        elements[index] =  e;
    } 
 }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
