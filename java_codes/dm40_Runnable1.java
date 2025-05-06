
    
    class Counter 
    {   int count;
        public synchronized void counter()
        {
           count++;
        }
    }
    public class dm40_Runnable1 {
        public static void main(String[] args) {
            Counter c = new Counter();
            Runnable obj = ()->
            {
                for(int i = 1; i<=500; i++)
                {
                  c.counter();
                
                }

            };

            Runnable obj1 = ()->
            {
                for(int i = 1; i<=500; i++)
                {
                c.counter();
                }
    
            };

         Thread t1 =new Thread(obj);
            Thread t2 = new Thread(obj1);
            t1.start();
            t2.start();
            try {
                t1.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                t2.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(c.count);
    }

}    



