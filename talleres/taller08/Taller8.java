import java.util.*;
    public class Taller8 {
       public static void main(String args[]){
        Queue<String> queue = new LinkedList<>();
        queue.add("Mariano");
        queue.add("Mariana");
        queue.add("Juaco");
        cola(queue);

        String s1 = "3 5 * 2 +" ;
        System.out.println(pol(s1));
    }   
            public static int pol(String str) {
        Stack<Integer> pila = new Stack<>();
        String troz[] = str.split(" ");
        for (int i = 0; i < troz.length; i++) {
            String now = troz[i];
            if (!isOperador(now)) {
                pila.push(Integer.parseInt(now));
            } else {
                int facO = pila.pop();
                int facT = pila.pop();
                pila.push(operar(now, facO, facT));  
            }
        }
        return pila.pop();
    }
    public static int operar(String operador, int fac1, int fac2) {
        switch (operador) {
            case "+":
                return fac1+fac2;
            case "-":
                return fac1-fac2;
            case "*":
                return fac1*fac2;
            default:
                return fac1/fac2;
        }
    }
        public static boolean isOperador(String str) {
        return str.startsWith("+")
                || str.startsWith("-")
                || str.startsWith("*")
                || str.startsWith("/");
    }
        public static void cola(Queue<String> queue) {
        while (!queue.isEmpty()) {
            System.out.println("Atendiendo a: " + queue.remove());
        }
    }
    public static Stack<Integer> Inverse(Stack<Integer> stack) {
        Queue<Integer> cola = new LinkedList<>();
        while (!stack.isEmpty()) {
            cola.add(stack.pop());
        }
        while (!cola.isEmpty()) {
            stack.push(cola.remove());
        }
        return stack;
    }
}