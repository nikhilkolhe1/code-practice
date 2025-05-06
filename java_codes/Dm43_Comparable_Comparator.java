import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
public class Dm43_Comparable_Comparator {
    public static void main(String[] args) {
        Comparator<Integer> cm =new Comparator<>()
        {
           public int compare(Integer a, Integer b)
           {
            if(a%10 > b%10)
            {
                return 1;
            }
            else
            return -1;

           }
        };
        List<Integer> num = new ArrayList<>();
        num.add(25);
        num.add(38);
        num.add(61);
        num.add(10);
        num.add(80);
        
        Collections.sort(num,cm);
        System.out.println(num);

    }
}
