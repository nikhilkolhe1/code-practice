
class A 
{
public A()
{
   System.out.println("in a ctor");
}
public  A( int  b)
{
System.out.println("in a s b");
}
}

class B extends A
{
   public B()
   {
      super( );
      System.out.println("in bctor");
   }

   public  B(int a, int b)
   {
      this();
      System.out.println("in b s b");
   }
}


public class dm25_thisandsuper{
    public static void main(String[] args) {

        B obj = new B(20,30);
        //obj.B(20, 30);
       // obj.c();

        
    }
}
