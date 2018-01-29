
/**
 * Write a description of class punto3 here.
 *
 * @author (Denilson Moreno & Mateo Montes)
 * @version (Enero 2018)
 */
public class Taller2
{
    public static int punto1(int p, int q){
        if(p%q==0){
            return q;
        }
        else
            return punto1(q,p%q);    
    }

    public boolean punto2(int start, int[] nums, int target) {
        if (start >= nums.length) 
            return (target == 0);
        else
            return punto2(start+1, nums, target) 
            || punto2(start+1, nums, target - nums[start]);
    }

    public static void punto3(String s){
        punto3(s, "");
    }

    private static void punto3(String s, String a){
        if(s.length()==0){
            System.out.println(a);
            return;            
        }
        punto3(s.substring(1), a + s.substring(0,1));
        punto3(s.substring(1), a);
    }
}
