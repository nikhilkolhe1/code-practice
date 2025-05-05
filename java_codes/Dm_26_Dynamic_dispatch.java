
class A
{
public void show()
{
    System.out.println("in a");
}
}

class B extends A
{
    public void show()
{
    System.out.println("in B");
}
}
class C extends A
{
    public void show()
    {
        System.out.println("in c");
    } 
}









public class Dm_26_Dynamic_dispatch {
    public static void main(String[] args) {
        
        A obj = new C();
        obj.show();
    }
}
