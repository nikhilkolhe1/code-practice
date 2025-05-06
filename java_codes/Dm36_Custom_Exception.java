
class NiksException extends Exception
{
    public NiksException(String str) 
    {
        super(str);
    }
}

public class Dm36_Custom_Exception {
    public static void main(String[] args) {
        int i =20;
        int j=0;
        int c =0;

        try
        {
         if (j==0)
         throw new NiksException(" gives zero");
         c=i/j;

        }
        catch(NiksException e)
        {
            System.out.println("hey its niks error");
        }
        catch(ArithmeticException e)
        {
            System.out.println("zero is there");
        }
        catch(Exception e)
        {
        System.out.println("something went wrong");
        }
        System.out.println(c);
    }
}
