public class Dm35_Exception_Handling {
    public static void main(String[] args) {
        int i =20;
        int j=0;
        int c =0;

        try
        {
         c=i/j;
         if (j==0)
         throw new ArithmeticException(" gives zero");
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
