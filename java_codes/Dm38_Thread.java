class A extends Thread
{

    public void run()
    {
    for(int i = 1; i<=1000; i++)
        {
        
            System.out.println("hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread
{
    
    public void run()
    {
    for(int i = 1; i<=1000; i++)
        {
        
            System.out.println("hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

public class Dm38_Thread {
    public static void main(String[] args) {
        A obj = new A();
        B obj1 = new B();

       // obj1.getPriority();
        obj.start();
        obj1.start();
    }
}
