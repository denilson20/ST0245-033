import java.util.*;
public class Punto
{
    LinkedList lista= new LinkedList<String>();
    public LinkedList<String> Tecledroto(String cadena){
    int modificar=0;
    for(int i=0;i<cadena.length();i++){
    if(cadena.charAt(i)=='['){
    modificar=0;
    }else if(cadena.charAt(i)==']'){
    modificar=lista.size();
    }else{
    lista.add(modificar, cadena.charAt(i));
    modificar++;
    }
    }
    return lista;
    }
    public static void main(String [] args){
    Scanner sc= new Scanner(System.in);
    String frase;
    System.out.println("Ingrese texto");
    frase= sc.nextLine();
    Punto punto= new Punto();
    String respuesta=punto.Tecledroto(frase).toString();
    System.out.println("lo correcto es: " + respuesta);
    }
}
