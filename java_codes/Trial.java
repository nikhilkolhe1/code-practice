import java.util.Scanner;

public class Trial{
    public static void main(String ...arg){

        Scanner in = new Scanner(System.in);

        do{
        System.out.println("Enter the  number:");

        int n = in.nextInt();     
        if(n%10==0) {
            break;
        }
            System.out.println(n);
        }while(true);
        
    }
}        
        
        

        
    
    

