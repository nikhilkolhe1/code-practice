enum Laptop 
{
   Macbook(3000), hp(400), lenovo(4001), dell(560);
   private int price;
   private Laptop(int price)
   {
    this.price =price;
   }
   public int getPrice() {
    return price;
}
   public void setPrice(int price) {
    this.price = price;
}

}
public class dm34_Enum {
    public static void main(String[] args) {

    //     Status s = Status.Started;
    //     System.out.println(s);

    //     Status[] ss = Status.values();
    //     for(Status s1:ss ) 
    //     {
    //         System.out.println(s1 + " :" + s1.ordinal() );
    //     }

    // Status opt = Status.close;

    // switch(opt)
    // {   
    //     case Started:
    //     System.out.println("its started");
    //     break;

    //     case running :
    //     System.out.println("its running");
    //     break;

    //     case hold:
    //     System.out.println("hey its on hold");
    //     break;

    //     case close:
    //     System.out.println("finished");
    //     break;
    //     default:
    //     System.out.println("something wrong");
    //     break;
    // }



    // Laptop ll = Laptop.Macbook;
    // System.out.println(ll.getPrice());
    for(Laptop ll: Laptop.values())
    {
        System.out.println(ll + " " + ll.getPrice());
    }
   
     }
}
