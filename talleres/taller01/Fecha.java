/**
 * Write a description of class Fecha here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fecha
{
    private String año;
    private String mes;
    private String dia;
    private String fecha = ""+año+mes+dia;
    
    public Fecha(String dia, String mes, String año){
        this.mes = mes;
        this.dia = dia;
        this.año = año;
    }
    
    public String getAño(){
        return año;
    }
    
    public String getMes(){
        return mes;
    }
    
    public String getDia(){
        return dia;
    }
    
        public String getFecha(){
        return fecha;
    }
    
    public String toString1(){
        return fecha;
    }
    
    public String comparar(String fecha, String fecha2){
        if(Integer.parseInt(fecha) > Integer.parseInt(fecha2))
            return "fecha#1 mayor a fecha#2";        
        if(fecha.equals(fecha2))return "fecha#1 igual a fecha#2";
            return "fecha#1 menor a fecha#2";
    }
    
}
