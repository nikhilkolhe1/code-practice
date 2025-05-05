
class A 
{
   public void show()
    {
        System.out.println("in a show");
    }
}

class B extends A
{
    public void show1()
{
    System.out.println("in b show1");
}
}



public class Dm28_upcastingand_downcasting {
    public static void main(String[] args) {
        A obj = (A) new B();
        obj.show();

        B obj1 = (B) obj;
        obj1.show1(); 
    }
}
