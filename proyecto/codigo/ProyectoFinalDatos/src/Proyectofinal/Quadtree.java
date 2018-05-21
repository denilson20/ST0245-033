/**
 * Title: Quick Tip: Use Quadtrees to Detect Likely Collisions in 2D Space
 * Author: Steven Lambert
 * Date: 2012
 * Code version: 2.0
 * Availability: https://gamedevelopment.tutsplus.com/tutorials/quick-tip-use-quadtrees-to-detect-likely-collisions-in-2d-space--gamedev-374
 */
package Proyectofinal;

import java.util.ArrayList;
import static java.awt.geom.Point2D.distance;
import java.util.List;
import java.awt.Rectangle;


public class Quadtree {
  private int maximoVal = 60;
  private int maximaDiv = 50;
  private int count;
  private List<Abeja> abeelist;
  private Rectangle frontera;
  private Quadtree[] ramas;

public Quadtree(int PrimerNivel, Rectangle PrimerFrontera) {
    count = PrimerNivel;
    abeelist = new ArrayList();
    frontera = PrimerFrontera;
    ramas = new Quadtree[4];
}
private void division() {
    int nuevoAncho = (int)(frontera.getWidth() / 2);                                                           
    int nuevoAlto = (int)(frontera.getHeight() / 2);                                                          
    int x = (int)frontera.getX();                                                                              
    int y = (int)frontera.getY();                                                                              
 
    ramas[0] = new Quadtree(count+1, new Rectangle(x + nuevoAncho, y, nuevoAncho, nuevoAlto));               
    ramas[1] = new Quadtree(count+1, new Rectangle(x, y, nuevoAncho, nuevoAlto));                            
    ramas[2] = new Quadtree(count+1, new Rectangle(x, y + nuevoAlto, nuevoAncho, nuevoAlto));              
    ramas[3] = new Quadtree(count+1, new Rectangle(x + nuevoAncho, y + nuevoAlto, nuevoAncho, nuevoAlto)); // O(1)
}
private int NumCuadrante(Abeja b) {                                                
    int index = -1;
    if((distance(b.getX(),frontera.y, b.getX(),b.getY()) < 100)
            ||(distance(frontera.getX(),b.getY(),b.getX(),b.getY()) < 100)
                ||(distance(b.getX(),frontera.getMaxY(),b.getX(),b.getY()) < 100)
                    ||(distance(frontera.getMaxX(),b.getY(),b.getX(),b.getY()) < 100)){
        return -1; 
     }
     double pointInterVer = frontera.getX() + (frontera.getWidth() / 2);
     double pointInterHor = frontera.getY() + (frontera.getHeight() / 2);
 
    boolean CuadranteSuperior = (b.getY() < pointInterHor);
    boolean CuadranteInferior = (b.getY() > pointInterHor);
    if (b.getX()<pointInterVer) {
        if (CuadranteSuperior) {
            index=1;
        }
            else if (CuadranteInferior) {
                index=2;
            }   
    }
    else if (b.getX()>pointInterVer) {
        if (CuadranteSuperior) {
            index=0;
        }
    else if (CuadranteInferior) {
           index=3;
    }
    }
    return index;                                                                                   
}
 public void insertar(Abeja bee) {
   if (ramas[0]!=null) {
     int index=NumCuadrante(bee);
     if (index!=-1) {
       ramas[index].insertar(bee);
       return;                                                                                     
     }
   }
   abeelist.add(bee);
 
   if (abeelist.size()>maximoVal&&count<maximaDiv) {
      if (ramas[0]==null) { 
         division(); 
      }
     for(int i = 0; i < abeelist.size();i++) {
       int index = NumCuadrante(abeelist.get(i));
       if (index != -1) {
         ramas[index].insertar(abeelist.remove(i));
         i--;
       }
     }
   }
 }                                                                              
 public List Vecinas(List addVecina, Abeja b) {
   int index = NumCuadrante(b);
   if (index != -1 && ramas[0] != null) {
     ramas[index].Vecinas(addVecina, b);
   }
   addVecina.addAll(abeelist);
   return addVecina;
 }                                                                               
}               
