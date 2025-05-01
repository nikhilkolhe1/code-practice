public class dm06_ternaryop {
public static void main(String ... arg){
    int x = 9;
    int result = 0;

    // if(x%2==0)
    // result = 10;
    // else 
    // result = 20;
    // System.out.println(result); 

    int z=  x%2 == 0 ? 10:20;
    result = z;
    System.out.println(result);
        
     {
            System.out.println("Java version: " + System.getProperty("java.version"));
            System.out.println("Java vendor: " + System.getProperty("java.vendor"));
            System.out.println("JDK path: " + System.getProperty("java.home"));
        }
    }
    

}