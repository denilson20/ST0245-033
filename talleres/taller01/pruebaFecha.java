public class pruebaFecha
{
    public static void main(String [] args){
        prueba();
    }
    
    public static void prueba(){
        Fecha a = new Fecha("03", "01", "2005");
        Fecha b = new Fecha("03", "01", "2004");
        System.out.println(a.comparar(a.getAño()+a.getMes()+a.getDia(), b.getAño()+b.getMes()+b.getDia()));
    }
}
