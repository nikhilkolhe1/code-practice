
class A 
{
    public void show()
    {
        System.out.println("in show");
    }
}
public class Dm32_Annonymous_class {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        A obj1 = new A()
        {
            public void show() 
            {
                System.out.println("in show and also in all show");
            };

        };
        obj1.show();
    }
}
