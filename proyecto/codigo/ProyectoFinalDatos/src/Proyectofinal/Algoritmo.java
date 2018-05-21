
package Proyectofinal;
import java.awt.Rectangle;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Algoritmo {
    static List<Abeja> Abejas; 
    static Quadtree quadtree = new Quadtree(0, new Rectangle(0,0,111111,111111));
    public static boolean verificar(Abeja b, Abeja bee1) {
        if(Math.sqrt(Math.pow((b.getX()-bee1.getX()),2)+Math.pow((b.getY()-bee1.getY()),2))<=100){
            return true;
        }
        return false ;                                                  
   }
        public static List<Abeja>[] quad() throws FileNotFoundException {
          List<Abeja> colision=new ArrayList();
            Abejas=new ArrayList();
            LeerArch();
            for (int i = 0; i < Abejas.size(); i++) {
                quadtree.insertar(Abejas.get(i));
            }
            List<Abeja> posiblesColisiones = new ArrayList();
        for (int i = 0; i < Abejas.size(); i++) {
            posiblesColisiones.clear();
            quadtree.Vecinas(posiblesColisiones, Abejas.get(i));
            for (int x = 0; x < posiblesColisiones.size() ; x++) {
                if(Abejas.get(i).getNUM()!=posiblesColisiones.get(x).getNUM() 
                        && verificar(Abejas.get(i), posiblesColisiones.get(x))){
                            colision.add(Abejas.get(i));
                }
            }      
        }
        List<Abeja>[] soluc = new List[2];
        soluc[0] = Abejas;
        soluc[1] = colision;
        return soluc;                                           
    }   
    public static void LeerArch() throws FileNotFoundException {
        Scanner leer = new Scanner(new File("ArchivoAbeja.txt"));
        int i = 1;   
           String line = leer.nextLine();
           Scanner input = new Scanner(System.in);
           
           System.out.println("\u001B[32m" +"Introduzca el numero de abejas");
           int tope  = input.nextInt();
            LinkedList<Abeja> b = new LinkedList();
            while(i<= tope && leer.hasNextLine()){
                line = leer.nextLine();
               String[] separar = line.split(",");
                String lenX = separar[0];
                String lenY = separar[1];
                double x = Double.parseDouble(lenX);
                double y = Double.parseDouble(lenY);
                Abeja b1 = new Abeja((x+75.6)*111111, (y-6.3)*111111,i);
                Abejas.add(b1);
                i++;
            }
            System.out.println("Numero de abejas seleccionadas: "+tope );
    }
}
