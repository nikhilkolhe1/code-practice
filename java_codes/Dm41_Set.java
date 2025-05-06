import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Dm41_Set {
    public static void main(String[] args) {
        Set<Integer> nums = new TreeSet<Integer>();
        nums.add(8);
        nums.add(6);
        nums.add(34);
        nums.add(6);      
        
        for(int n: nums)
        {
            System.out.println(n);
        }
    }
   
}


