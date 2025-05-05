
class A 
{
    public void show()
    {
        System.out.println("in show");
    }

   class B 
   {
      public void config() 
      {
        System.out.println("hi in config");
      }
    
   }
}


public class Dm31_innerclass {
    public static void main(String[] args) {

        A obj = new A();
        obj.show();
        //obj.config();
        
        A.B obj1 = obj.new B();    //inner class  
        obj1.config();
       // obj1.show(0);

    }
}
