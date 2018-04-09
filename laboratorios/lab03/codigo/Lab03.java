import java.util.*;
public class Lab03 {


  public static List CreateList(){
        Scanner f = new Scanner(System.in);
        List<String> Lista = new ArrayList<String>();
         System.out.println("ingrese un numero o ingrese una letra para terminar");
       
        while(f.hasNextInt()){
            boolean ss = false;
            System.out.println("Ingresa un numero");
            String a = f.next();
            for(String aa : Lista){
                if(aa.equals(a)){
            ss    = true;
                System.out.println("Este numero ya existe ingrese un numero diferente");
                break;
            }
        }
            if(ss)
                continue;
    
       Lista.add(a);
        }
        return Lista;
     }
        
    public static int MultiplicarNumeros(List<String> list){
        if(list == null){
            throw  new NullPointerException("no implementa lista");
        }
        
        int centinela = 1;
        
        for (String a : list) {
            centinela *= Integer.parseInt(a);;;
        }
        
        return centinela;
    }
     public static int pivote(List<Integer> list){
        Iterator iter = list.iterator();
        int result =-1;
        int suma1;
        int suma2;
        int mientras=1000000;
        while(iter.hasNext()){    
            suma1=0;
            suma2=0;
            int a=list.lastIndexOf((Integer)iter.next());
            List<Integer> b= list.subList(0,a);
              Iterator itera = b.iterator();
           while(itera.hasNext()){  
            suma1=suma1+(Integer)itera.next();
            }
            List<Integer> c= list.subList(a,list.size());
           Iterator iterb = c.iterator();   
           while(iterb.hasNext()){
           suma2=suma2+(Integer)iterb.next(); 
            }
           if(Math.abs(suma1-suma2)<=mientras){
            mientras=Math.abs(suma1-suma2);
            result=a-1;
            }}
        return result;
        }
    public static void Ejercicio4(List<String> neveras,List<String> solicitudes){
     System.out.println("");
        Queue<String> solicitud = new LinkedList();
     Stack<String> nevera = new Stack();
     Iterator iternev= neveras.iterator();
     
     while(iternev.hasNext()){
        nevera.push((String)iternev.next());
        }
     Iterator itersol= solicitudes.iterator();
     while(itersol.hasNext()){
        solicitud.add((String)itersol.next());
        }
      for(int i=nevera.size();i>=0;i--){
          String solicitu=solicitud.remove();
        System.out.print( solicitu);
           int k=i;
           int j=Integer.parseInt(solicitu.charAt(solicitu.length()-1)+"");
        while(k>i-Integer.parseInt(solicitu.charAt(solicitu.length()-1) + "")){
            if(nevera.size()>0){
         System.out.print( " " + "( " + k + ", " + nevera.pop() + " )");
         k--;
         }else{
            return ;
            }
        
        }
        i=k+1;
         System.out.println("");
        }
    }
    
    public static void main(String[] args) {
        LinkedList<Integer> linked = new LinkedList<>();
        linked.addAll(Arrays.asList(new Integer[] {1, 3, 5, 7}));

        ArrayList<Integer> array = new ArrayList<>();
        array.addAll(Arrays.asList(new Integer[] {2, 4, 6, 8}));
        
      LinkedList<Integer> linked2 = new LinkedList<>();
        linked2.addAll(Arrays.asList(new Integer[] {2, 6, 7, 1,20}));

        ArrayList<Integer> array2 = new ArrayList<>();
        array2.addAll(Arrays.asList(new Integer[] {20, 8, 14, 7,1}));
        
         LinkedList<String> linknev = new LinkedList<>();
        linknev.addAll(Arrays.asList(new String[] {"Motorola","Sony","LG", "Apple","Haceb"}));

        ArrayList<String> arraynev = new ArrayList<>();
        arraynev.addAll(Arrays.asList(new String[] {"Haceb", "Apple", "Sony","Motorola","Lg","M4"}));
        
        LinkedList<String> linksolic = new LinkedList<>();
        linksolic.addAll(Arrays.asList(new String[] {"Flamingo2","Exito1","Jumbo3","Justoybueno4"}));
        
          ArrayList<String> arraysolic = new ArrayList<>();
        arraysolic.addAll(Arrays.asList(new String[] {"Constructor3","Exito1","Falabella4"}));
        
        System.out.println("pivote  for "+ Arrays.toString(array2.toArray()) + " : " +pivote(array2));     
        System.out.println("pivote for  " + Arrays.toString(linked2.toArray()) + " : "  +pivote(linked2));
        
        System.out.println(MultiplicarNumeros(CreateList()));
 
        Ejercicio4(arraynev,arraysolic);
        System.out.println("");
        Ejercicio4(linknev,linksolic);
    }

}
