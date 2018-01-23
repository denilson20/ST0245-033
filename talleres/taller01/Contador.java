
/**
 * Write a description of class Punto2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Contador
{
    int count = 0;
    String ID;
    
    public Contador(String ID){
        this.ID=ID;
    }
    
    public void incrementar(){
        count++;
    }
    
    public int incrementos(){
        return count;
    }
    
    public String toString1(){
        return ID+":"+count;
    }
}
