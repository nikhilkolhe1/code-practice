import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Dm44_StreamApi {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(2,5,3,6,78,65,56);
        
        
        
        int result  = num.stream()
                         .filter(n-> n%2==0)
                         .map(n-> n*2)
                         .reduce(0, (c,e) -> c+e);

                         System.out.println(result );
        
        
        // Stream<Integer> st = num.stream();

        // Stream<Integer> st1=st.filter(n-> n%2==0);

        // st1.forEach(n->System.out.println(n));
        

        // for(int i =0; i<num.size(); i++)
        // {
        //     System.out.println(num.get(i));
        // } 
        // for(int n: num)
        // {
        //     System.out.println(n);
        // }
       // num.forEach(n-> System.out.println(n));
    }
}
