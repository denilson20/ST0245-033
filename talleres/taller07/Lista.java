public class Lista {
    Nodo first; 
    public class Nodo {    
        int data;     
        Nodo next;            
        public Nodo(int data){    
            this.data = data;
        }
    }  
    public Lista(){ 
        first= null;
    }  
    public void print() {
        System.out.println("Lista: ");
        Nodo nodo=first;
        while(nodo!=null){
            System.out.println(nodo.data + " ");
            nodo=nodo.next;
        }
    } 
    public void addEnd(int n) {
        Nodo nuevo = new Nodo(n);
        Nodo temp = first;
        if (temp == null) {
            first = nuevo;
        } else {
            while(temp.next!=null){
                temp=temp.next;
            }   
            temp.next= nuevo;
        }
    }
    public void print_inverse() { 
        Nodo nodo=first;
        String algo="";
        while (nodo!=null){
            algo= "\n" + nodo.data + " " + algo  ;
            nodo=nodo.next;
        }
        System.out.println("Inverso: " +algo);
    }
    public void print(int x) { 
        Nodo nodo=first;
        for(int i=0;i<x;i++){
            if(nodo!=null){
                nodo=nodo.next;
            }else{
                System.out.println("Ingrese una posicion valida");   
                return ;
            }
        }
        System.out.println(" posicion " + x +" " +nodo.data);
    }    
    public void delateEnd() { 
        Nodo temp = first;
        Nodo tmp=temp.next;
        if(first.next!=null){
            if (tmp!= null) {
                while(tmp.next!=null){
                    temp=temp.next;
                    tmp=tmp.next;
                }   
                temp.next = null;
            } 
        }else{
            first=null;
        }
    }
    public void add_start(int n) {  
        Nodo nuevo = new Nodo(n);
        if (first != null) {
            nuevo.next = first;
            first = nuevo;
        } else {
            first = nuevo;
        }
    }       
    public void delateStart() { 
        Nodo temp= first;
        if (first!= null) {
            first=first.next; 
        }
    }
    public boolean compare(Lista lista) {  
        Nodo nodoa = first;       
        Nodo nodob= lista.first; 
        while (nodoa!= null) {  
            if(nodob == null || nodoa.data != nodob.data)
                return false; 
            nodoa = nodoa.next;
            nodob = nodob.next;
        }        
        if(nodob != null)
            return false;
        return true;
    }
}  
