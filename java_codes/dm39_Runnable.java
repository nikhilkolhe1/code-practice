

    class A implements Runnable
    {
    
        public void run()
        {
        for(int i = 1; i<=5; i++)
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
    
    class B implements Runnable
    {
        
        public void run()
        {
        for(int i = 1; i<=5; i++)
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
    
    public class dm39_Runnable {
        public static void main(String[] args) {
            Runnable obj = new A();
            Runnable obj1 = new B();
    
            Thread t1 =new Thread(obj);
            Thread t2 = new Thread(obj1);
           // obj1.getPriority();
            t1.start();
            t2.start();
        }
    }
     

