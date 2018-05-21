package Proyectofinal;

import static java.awt.image.ImageObserver.WIDTH;
import java.awt.Color;
import javax.swing.*;
import java.util.List;
import java.awt.Graphics;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Pintar extends JPanel{
     static ImageIcon Imag=new ImageIcon("ConjuntoDeDatos.png");
     List<Abeja> abejas=new ArrayList();
     List<Abeja> colisiones=new ArrayList();
     Algoritmo algorit=new Algoritmo();
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);      
        paint(g);
    } 
    public static Abeja convert(Abeja b) {
        double x=b.getX()/111111-75.6;
        double y=b.getY()/111111+6.3;
        int x1=(int)(x*4950+374300);
        int y1=(int)(y*-5300+33817);
        Abeja bee2 = new Abeja(x1,y1, b.getNUM());
        return bee2;
    }
    public void paint(Graphics g) {try {
             Imag.paintIcon(this, g, WIDTH, WIDTH);            
             List<Abeja>[] lis=algorit.quad();
             abejas=lis[0];
             colisiones=lis[1];
             
             g.setColor(Color.white);
             for(int i=0;i<abejas.size();i++){
                 Abeja b1 = convert(abejas.get(i));                 
                 g.fillOval((int)b1.getX(), (int)b1.getY(),3,3);               
             } 
             g.setColor(Color.blue);
             for(int i=0;i<colisiones.size();i++){
                 Abeja b1 = convert(colisiones.get(i));
                 g.fillOval((int)b1.getX(), (int)b1.getY(),4,4);                
             } 
                     } catch (FileNotFoundException ex) {
         }
    }
        public static void main(String[] args) {
        Pintar proy = new Pintar();
        JFrame j = new JFrame();
        j.setSize(Imag.getIconWidth(), Imag.getIconHeight()+49);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.add(proy);
        j.setVisible(true);
    }
}
