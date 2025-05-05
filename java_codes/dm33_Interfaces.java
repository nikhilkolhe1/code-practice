interface A 
{ 
    int num = 20;
    int age = 30;
    void show();
    void config();
}

class B implements A 
{
   public void show() 
    {
        System.out.println("in show");
    }
    public void config() 
    {
        System.out.println("in config");
    }
}
public class dm33_Interfaces {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
        obj.config();

        System.out.println(A.age);
    }
}
